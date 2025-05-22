package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("Este es un mensaje de TRAZA.");
        logger.debug("Este es un mensaje de DEPURACIÓN.");
        logger.info("Este es un mensaje de INFORMACIÓN.");
        logger.warn("Este es un mensaje de ADVERTENCIA.");
        logger.error("Este es un mensaje de ERROR.");
        logger.fatal("Este es un mensaje FATAL.");

        anotherMethod();

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Ocurrió un error durante la división: {}", e.getMessage(), e);
        }
    }

    private static void anotherMethod() {
        logger.info("Este es un mensaje de INFORMACIÓN desde otro método.");
        logger.debug("Depurando en otro método.");
    }

}