package com.mycompany.logger;
public class Main {
    public static void main(String[] args) {
        UserLoggerAdapter adapter = new UserLoggerAdapter("json");
        adapter.logUserOperation("Criação", "john_doe");

        adapter.setLogFormat("csv");
        adapter.logUserOperation("Atualização", "jane_smith");
    }
}
