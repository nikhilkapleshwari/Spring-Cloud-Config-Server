package io.api.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "io.api")
//@EnableJpaRepositories(basePackages = { "io.api.repository" })
//@EntityScan(basePackages = { "io.api.entity" })
@ConfigurationPropertiesScan("io.api.config")
public class SpringCloudConfigServerApp {

  public static void main(String[] args) {
	SpringApplication.run(SpringCloudConfigServerApp.class, args);
  }

}
