package org.example;

import ch.qos.logback.classic.Level;

public class CustomLevelLogback extends Level {

    public static final Level MI_LOG_LEVEL = new CustomLevelLogback(25000, "MI_LOG_LEVEL", 0);

    protected CustomLevelLogback(int levelInt, String levelStr, int syslogEquivalent) {
        super(levelInt, levelStr, syslogEquivalent);
    }
}
