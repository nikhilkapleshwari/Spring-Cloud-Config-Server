package io.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.api.config.Config;
import io.api.config.Endpoint;
import io.api.config.OrderServiceConfig;

@RestController
@RequestMapping("/config")
public class ConfigController {

  @Autowired
  Config config;

  @Autowired
  OrderServiceConfig orderServiceConfig;

  @GetMapping("/users")
  public String getUsers() {
	return "Raju, Ram, Vijay, Ryan, Chris";
  }

  @GetMapping("/monitor")
  public String getMonitorUser() {
	System.out.println("msg value:" + config.getMsg() + " timeout value:" + config.getTimeout());
	System.out.println("order service endpoint details:" + orderServiceConfig.getUrlprofiles());
	System.out.println("order service msg details:" + orderServiceConfig.getMsg());
	return config.getMsg();
  }

  @GetMapping("/order-service/{urlProfile}")
  public Endpoint getOrderServiceUrl(@PathVariable String urlProfile) {
	System.out.println("request receives for urlProfile: " + urlProfile);
	
	List<Endpoint> endpoints = orderServiceConfig.getUrlprofiles();
	Optional<Endpoint> optEndpoint = Optional.empty();
	if (endpoints != null)
	  optEndpoint =  endpoints.stream().filter(endpoint -> endpoint.getName().equals(urlProfile)).findFirst();

	return (optEndpoint.isPresent()) ? optEndpoint.get() : null;
  }
}
