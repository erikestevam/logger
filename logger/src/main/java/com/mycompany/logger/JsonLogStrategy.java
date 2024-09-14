package com.mycompany.logger;
public class JsonLogStrategy implements LogStrategy {
    @Override
    public void log(String message) {
        System.out.println("{\"message\": \"" + message + "\"}");
    }
}