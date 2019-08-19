package com.javawinrm.winrm;

public class RtProtocol implements Protocol {

    private Transport transport;
    RtProtocol(Transport transport){
        this.transport = transport;
    }
}
