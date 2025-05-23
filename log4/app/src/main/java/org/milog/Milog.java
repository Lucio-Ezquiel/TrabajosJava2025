package org.milog;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Milog
 */
public class Milog {

    private static final Logger logger = LogManager.getLogger(Milog.class);

    private static final Level miLogLevel = Level.forName("miLogLevel", 375);

    public static void main(String[] args) {
        logger.info("Programa ha iniciado");

        logger.log(miLogLevel, "Usando nivel personalizado de log");
        logger.log(Level.getLevel("logCustom"), "Probando desde config");

        logger.warn("New file log msg");
        // logger.fatal("Http funca con python flask"); // tiro mucho error pero
        // funciono
    }
}
