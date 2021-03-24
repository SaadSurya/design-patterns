package com.growth.designpatterns.behavioral.command;

public class Request {

    private String clientName;
    private String requestType;

    public Request(String clientName, String requestType) {
        this.clientName = clientName;
        this.requestType = requestType;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestString() {
        return String.format("Client Name: %s; Request Type: %s", clientName, requestType);
    }
}
