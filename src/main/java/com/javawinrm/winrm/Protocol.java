package com.javawinrm.winrm;

public interface Protocol {

    static ProtocolBuilder builder(){
        return new RtProtocolBuilder();
    }
}
