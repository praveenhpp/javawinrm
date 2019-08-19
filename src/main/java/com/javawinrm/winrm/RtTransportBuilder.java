package com.javawinrm.winrm;

public class RtTransportBuilder implements TransportBuilder {

    private String endPoint;
    private String username;
    private String password;
    private String authType;

    @Override
    public TransportBuilder endPoint(String url) {
        this.endPoint = url;
        return this;
    }

    @Override
    public TransportBuilder auth(String username, String password) {
        this.username = username;
        this.password = password;
        return this;
    }

    @Override
    public TransportBuilder authType(String type) {
        this.authType = type;
        return this;
    }

    @Override
    public Transport build() {
        return new RtTransport();
    }
}
