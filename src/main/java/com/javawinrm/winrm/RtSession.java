package com.javawinrm.winrm;

class RtSession implements  Session{

    private Protocol protocol;
    RtSession(Protocol protocol){
        this.protocol = protocol;
    }

    @Override
    public Response runCmd(String cmd, String... cmdArgs) {
        return null;
    }

    @Override
    public Response runPs(String script) {
        return null;
    }
}
