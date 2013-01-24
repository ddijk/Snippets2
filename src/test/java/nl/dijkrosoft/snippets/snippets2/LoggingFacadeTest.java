/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.snippets.snippets2;

import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author dick
 */
public class LoggingFacadeTest {
  
  private final static Logger LOGGER = LoggerFactory.getLogger(LoggingFacadeTest.class);
  
  public LoggingFacadeTest() {
  }

  @Test
  public void testSayHai() {
    LOGGER.info("here we go");
    LoggingFacade app = new LoggingFacade();
    assertEquals("hai", app.sayHello() );
  }
}
