package me.oriordan.common.config.framework;

/**
 * Thrown when something silly happens.
 *  
 * @author tnxo
 *
 */
public class ConfigurationException extends Exception {

  private static final long serialVersionUID = 1L;

  public ConfigurationException(String message) {
    super(message);
  }
  
  public ConfigurationException(String message, Throwable t) {
    super(message, t);
  }
}
