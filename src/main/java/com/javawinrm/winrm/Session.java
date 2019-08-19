package com.javawinrm.winrm;

public interface Session{

    static SessionBuilder builder(){
        return new RtSessionBuilder();
    }

    Response runCmd(String cmd, String ...cmdArgs);
    Response runPs(String script);
}