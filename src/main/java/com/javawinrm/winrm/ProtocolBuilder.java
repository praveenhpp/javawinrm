package com.javawinrm.winrm;

public interface ProtocolBuilder {

    ProtocolBuilder endPoint(String url);
    ProtocolBuilder auth(String username, String password);
    ProtocolBuilder authType(String type);
    Protocol build();
}
