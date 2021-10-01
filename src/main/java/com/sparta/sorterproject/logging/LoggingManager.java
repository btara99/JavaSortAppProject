package com.sparta.sorterproject.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingManager {
    private static Logger logger = Logger.getLogger("Java sorter app logger");

    public static void exceptionLog(String n){
        PropertyConfigurator.configure("log4j.properties");
        logger.warn(" User did not enter an int: USER INPUT: " + n);
    }
    public static void arrayLog(String n){
        PropertyConfigurator.configure("log4j.properties");
        logger.trace("user created an array " + n);
    }
    public static void timeLog(double time){
        PropertyConfigurator.configure("log4j.properties");
        logger.trace("time taken for sort " + time + " seconds");
    }

}
