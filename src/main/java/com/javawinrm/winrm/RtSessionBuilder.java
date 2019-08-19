package com.javawinrm.winrm;
//imports
import lombok.NonNull;
import static com.javawinrm.winrm.Session.*;

class RtSessionBuilder implements  SessionBuilder {

    private String host;
    private String username;
    private String password;
    private String authType;
    private String scheme;
    private int port;

    @Override
    public SessionBuilder host(@NonNull String hostname) {
        this.host = hostname;
        return this;
    }

    @Override
    public SessionBuilder auth(@NonNull String username, @NonNull String password) {
        this.username = username;
        this.password = password;
        return this;
    }

    @Override
    public SessionBuilder authType(String type) {
        this.authType = type;
        return this;
    }

    @Override
    public Session build() {

        //default auth type
        if(this.authType == null){
            this.authType = "plaintext";
        }

        this.port = 5985; //TODO: ssl will use 5986.
        this.scheme = "http"; //TODO: ssl will use https.

        Protocol protocol = Protocol.builder()
                                    .endPoint(this.buildURL())
                                    .auth(this.username,this.password)
                                    .authType(this.authType)
                                    .build();

        return new RtSession(protocol);
    }

    private String buildURL(){

        String url = String.format("{0}://{1}:{2}",this.scheme,this.host,this.port);
        return url;
    }
}
