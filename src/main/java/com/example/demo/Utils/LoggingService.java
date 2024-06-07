package com.example.demo.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingService {
    private static final Logger logger = LogManager.getLogger(LoggingService.class);

    public void logInfo(String message) {
        logger.info(message);
    }

    public void logDebug(String message) {
        logger.debug(message);
    }

    public void logError(String message, Throwable throwable) {
        logger.error(message, throwable);
    }
}
