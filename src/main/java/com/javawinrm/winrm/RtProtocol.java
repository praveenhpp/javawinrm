package com.javawinrm.winrm;

class RtProtocol implements Protocol {

    private Transport transport;
    RtProtocol(Transport transport){
        this.transport = transport;
    }
}
