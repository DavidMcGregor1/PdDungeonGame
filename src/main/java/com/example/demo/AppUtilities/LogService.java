package com.example.demo.AppUtilities;

import com.example.demo.PdDungeonGameApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogService {

    private final static Logger LOGGER = LogManager.getLogger(PdDungeonGameApplication.class);


    public void logInfo(String logMessage) {
        LOGGER.info("GAME - ]" + logMessage + "[" );
    }

    public void logDebug(String logMessage) {
        LOGGER.debug("GAME - ]" + logMessage + "[" );
    }
}
