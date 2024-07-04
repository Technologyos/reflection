package com.technologyos.reflection.web;

import com.sun.net.httpserver.HttpServer;
import com.technologyos.reflection.classes.ServerConfiguration;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class WebServer {
    public  void startServer() throws IOException {
        HttpServer httpServer = HttpServer.create(ServerConfiguration.getInstance().getServerAddress(), 0);
        httpServer.createContext("greeting").setHandler(exchange -> {
            String responseMessage = ServerConfiguration.getInstance().getGreetingMessage();
            exchange.sendResponseHeaders(200, responseMessage.length());

            OutputStream responseBody = exchange.getResponseBody();
            responseBody.write(responseMessage.getBytes(StandardCharsets.UTF_8));
            responseBody.flush();
            responseBody.close();
        });

        System.out.println(String.format("Starting server on address %s:%d",
            ServerConfiguration.getInstance().getServerAddress().getHostName(),
            ServerConfiguration.getInstance().getServerAddress().getPort()));

        httpServer.start();
    }
}
