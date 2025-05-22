package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerApp {
    private static final Logger logger = LoggerFactory.getLogger(LoggerApp.class);

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            logger.info("Mensaje de log enviado a las {}", java.time.LocalTime.now());
            Thread.sleep(30 * 1000);
        }
    }
}

