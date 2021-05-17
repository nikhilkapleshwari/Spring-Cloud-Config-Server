package io.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.api.config.Config;
import io.api.config.Endpoint;
import io.api.service.ConfigService;

@RestController
@RequestMapping("/config")
public class ConfigController {

  @Autowired
  Config config;

  @Autowired
  ConfigService configService;

  @GetMapping("/users")
  public String getUsers() {
	return "Raju, Ram, Vijay, Ryan, Chris";
  }

  @GetMapping("/monitor")
  public String getMonitorUser() {
	System.out.println("msg value:" + config.getMsg() + " timeout value:" + config.getTimeout());
	return config.getMsg();
  }

  @GetMapping("/{profileId}/{urlName}")
  public Endpoint getUrlEndpoint(@PathVariable String profileId, @PathVariable String urlName) {
	System.out.println("Request received for profile: " + profileId + " , urlName: " + urlName);
	return configService.getUrlList(profileId, urlName);
  }

}
