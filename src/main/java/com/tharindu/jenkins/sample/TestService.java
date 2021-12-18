package com.tharindu.jenkins.sample;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "test-service")
public class TestService {
    private final String message = new String("Hello, ");

    public void Hello() {
    }

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}
