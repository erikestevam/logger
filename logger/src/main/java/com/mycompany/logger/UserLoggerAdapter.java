package com.mycompany.logger;
public class UserLoggerAdapter {
    private Logger logger;

    public UserLoggerAdapter(String format) {
        LogStrategy strategy = LogStrategyFactory.createStrategy(format);
        this.logger = new Logger(strategy);
    }

    public void setLogFormat(String format) {
        LogStrategy strategy = LogStrategyFactory.createStrategy(format);
        this.logger.setStrategy(strategy);
    }

    public void logUserOperation(String operation, String username) {
        String message = "Operação: " + operation + ", Usuário: " + username;
        logger.log(message);
    }
}