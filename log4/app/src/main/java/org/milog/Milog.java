package org.milog;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

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
        logger.fatal("Hola log msg");

        // Agregar información al contexto del hilo
        ThreadContext.put("userId", "12345");
        ThreadContext.put("transactionId", "TXN789");

        // Generar un mensaje de logging
        logger.info("Procesando transacción para el usuario.");

        // Limpiar el contexto del hilo
        ThreadContext.clearAll();
    }
}
