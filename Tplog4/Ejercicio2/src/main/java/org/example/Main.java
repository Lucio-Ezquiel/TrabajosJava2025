package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Este es un mensaje INFO.");
        logger.debug("Este es un mensaje DEBUG.");
        logger.warn("Este es un mensaje WARN.");
        logger.error("Este es un mensaje ERROR.");

        logger.log(CustomLevelLogback.MI_LOG_LEVEL, "Este es un mensaje de miLogLeveL.");
    }
}