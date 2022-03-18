package com.sparta.ss.week2.logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        // Regardless of level, print this
//        return record.getLevel() != Level.WARNING;
        return record.getMessage().contains("main");
    }
}
