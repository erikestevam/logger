package com.mycompany.logger;
public class LogStrategyFactory {
    public static LogStrategy createStrategy(String format) {
        if ("json".equalsIgnoreCase(format)) {
            return new JsonLogStrategy();
        } else if ("csv".equalsIgnoreCase(format)) {
            return new CsvLogStrategy();
        } else {
            throw new IllegalArgumentException("Formato de log não suportado: " + format);
        }
    }
}