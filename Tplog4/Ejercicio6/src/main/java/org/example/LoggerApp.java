package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerApp {
    private static final Logger logger = LogManager.getLogger(LoggerApp.class);

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            logger.info("Mensaje de prueba a las {}", java.time.LocalTime.now());
            Thread.sleep(30000); 
        }
    }
}
