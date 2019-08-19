package com.javawinrm.winrm;

public interface Response {

    int statusCode();
    StringBuffer stdOut();
    StringBuffer stdErr();
}
