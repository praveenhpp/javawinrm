package com.javawinrm.winrm;

class RtProtocolBuilder implements ProtocolBuilder {

    private String endPoint;
    private String username;
    private String password;
    private String authType;

    @Override
    public ProtocolBuilder endPoint(String url) {
        this.endPoint = url;
        return this;
    }

    @Override
    public ProtocolBuilder auth(String username, String password) {
        this.username = username;
        this.password = password;
        return this;
    }

    @Override
    public ProtocolBuilder authType(String type) {
        this.authType = type;
        return this;
    }

    @Override
    public Protocol build() {

        Transport transport = Transport.builder()
                                        .auth(username,password)
                                        .authType(authType)
                                        .endPoint(endPoint)
                                        .build();
        return new RtProtocol(transport);
    }
}
