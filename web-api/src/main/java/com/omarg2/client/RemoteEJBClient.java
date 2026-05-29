package com.omarg2.client;

import com.omarg2.remote.TemperatureRemote;

import javax.naming.InitialContext;

public class RemoteEJBClient {

    public TemperatureRemote getTemperatureEJB()
            throws Exception {

        InitialContext context =
                new InitialContext();

        return (TemperatureRemote)
                context.lookup(
                    "ejb:/ejb-server/TemperatureEJB!com.omarg2.remote.TemperatureRemote"
                );
    }
}