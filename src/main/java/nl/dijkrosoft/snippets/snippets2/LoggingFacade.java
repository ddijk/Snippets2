package nl.dijkrosoft.snippets.snippets2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class LoggingFacade 
{
   private final static Logger LOGGER = LoggerFactory.getLogger(LoggingFacade.class);
 
    public String sayHello() {
      LOGGER.info("About to say hai");
      return "hai";
    }
}
