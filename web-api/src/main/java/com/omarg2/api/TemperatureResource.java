package com.omarg2.api;

import com.omarg2.client.RemoteEJBClient;
import com.omarg2.dto.TemperatureResponse;
import com.omarg2.remote.TemperatureRemote;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/temperature")
public class TemperatureResource {

    @GET
    @Path("/convert")
    @Produces(MediaType.APPLICATION_JSON)
    public TemperatureResponse convert(
            @QueryParam("c") double celsius) {

        try {

            RemoteEJBClient client =
                    new RemoteEJBClient();

            TemperatureRemote ejb =
                    client.getTemperatureEJB();

            double fahrenheit =
                    ejb.celsiusToFahrenheit(celsius);

            return new TemperatureResponse(
                    celsius,
                    fahrenheit,
                    "success");

        } catch (Exception e) {

            return new TemperatureResponse(
                    celsius,
                    0,
                    "error");
        }
    }
}