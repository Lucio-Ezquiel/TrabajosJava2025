package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("Este es un mensaje TRACE.");
        logger.debug("Este es un mensaje DEBUG.");
        logger.info("Este es un mensaje INFO.");
        logger.warn("Este es un mensaje de ADVERTENCIA.");
        logger.error("Este es un mensaje de ERROR.");
        logger.fatal("Este es un mensaje FATAL.");

        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Ocurrió un error durante la división:", e);
        }

        System.out.println("Mensajes de logging enviados. Revisa la consola, log.txt y tu endpoint HTTP configurado.");
    }
}