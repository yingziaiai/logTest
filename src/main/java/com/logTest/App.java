package com.logTest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App{

//    final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        App obj = new App();
        obj.runMe("test");

    }

    private void runMe(String parameter){
    	PropertyConfigurator.configure("log4j.properties"); 
        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }

}
