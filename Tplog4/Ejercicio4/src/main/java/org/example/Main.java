package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Este es un mensaje de información.");
        logger.warn("¡Cuidado, esto es una advertencia!");
        logger.error("Se ha producido un error crítico.");
        logger.debug("Este mensaje de depuración no debería aparecer si el nivel root es 'info'.");
    }
}