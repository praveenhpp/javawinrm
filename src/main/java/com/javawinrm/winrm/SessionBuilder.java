package com.javawinrm.winrm;

import java.lang.RuntimeException;
public interface SessionBuilder {

    SessionBuilder host(String hostname);
    SessionBuilder auth(String username,String password);
    SessionBuilder authType(String type);
    Session build() throws  RuntimeException;
}
