package io.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "global.microservice")
public class ProfileConfig {

  List<Profile> profileList = new ArrayList<>();

  public ProfileConfig() {
  }

  public List<Profile> getProfileList() {
    return profileList;
  }

  public void setProfileList(List<Profile> profileList) {
    this.profileList = profileList;
  }
  
  
}
