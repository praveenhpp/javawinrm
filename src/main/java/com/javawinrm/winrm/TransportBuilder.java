package com.javawinrm.winrm;

public interface TransportBuilder {

    TransportBuilder endPoint(String url);
    TransportBuilder auth(String username, String password);
    TransportBuilder authType(String type);
    Transport build();
}
