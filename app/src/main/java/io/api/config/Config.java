package io.api.config;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "myconfig")
public class Config implements Serializable{

  
  private static final long serialVersionUID = 1L;
  
  public Config() {
	super();
  }
  public Config(String msg, String timeout) {
	super();
	this.msg = msg;
	this.timeout = timeout;
  }
  
  private String msg;
  private String timeout;

  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }
  public String getTimeout() {
    return timeout;
  }
  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }
  
}
