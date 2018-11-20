package com.darshan;
import org.apache.log4j.Logger;
//import java.util.logging.Logger;
public class LoggerMain {
    // Create a logger object for class "Main"
    // Inherits all properties from "RootLogger"
   static Logger log = Logger.getLogger(LoggerMain.class);
   // static Logger log = Logger.getRootLogger();
    public static void main(String[] args) {
        log.trace("Trace Message");
        log.info("Info Message");
        log.debug("Debug Message");
        log.warn("Warn Message");
        log.error("Error Message");
        log.fatal("Exception Occurred",new RuntimeException("Dummy"));
    }
}
