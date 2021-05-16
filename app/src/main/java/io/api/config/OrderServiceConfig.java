package io.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "order")
public class OrderServiceConfig {

  private List<Endpoint> urlprofiles = new ArrayList<>();
  public List<Endpoint> getUrlprofiles() {
    return urlprofiles;
  }


  public void setUrlprofiles(List<Endpoint> urlprofiles) {
    this.urlprofiles = urlprofiles;
  }

  private String msg;

  public OrderServiceConfig() {
  }


  public String getMsg() {
	return msg;
  }

  public void setMsg(String msg) {
	this.msg = msg;
  }

}
