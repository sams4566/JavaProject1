package com.sparta.ss.week2.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger("myLogger");
    public static void main(String[] args) {
        // Print messages - security, only the value,
        // Debugging - abstraction (step into), tied to an IDE (Integrated Development Environment)
        try {
            Handler fileHandler = new FileHandler("src/main/java/com/sparta/ss/week2/logging/myLog.log", true);
            logger.addHandler(fileHandler);
             System.setProperty("java.util.logging.SimpleFormatter.format", "%4$s: %5$s [%1$tcl%n]");
            fileHandler.setFormatter(new CustomFormatter());
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.setLevel(Level.ALL); // At level or higher
        logger.setFilter(new CustomFilter());
        logger.log(Level.INFO, "I am in the main method"); // information
        logger.log(Level.WARNING, "This is a warning"); // information
    }
}
