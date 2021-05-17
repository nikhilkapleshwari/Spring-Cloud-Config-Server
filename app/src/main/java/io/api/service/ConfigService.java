package io.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import io.api.config.Endpoint;
import io.api.config.Profile;
import io.api.config.ProfileConfig;


@Service
public class ConfigService {

  @Autowired
  ProfileConfig profileConfig;
  
  public Profile getProfile(final String profileId) {
	List<Profile> profileList = profileConfig.getProfileList();
	System.out.println("profileList details:"+profileList);
	if(CollectionUtils.isEmpty(profileList))
	  return new Profile();
	
	System.out.println("profile Id:"+profileId);
	for(Profile p:profileList) {
	  System.out.println("profile:"+p.getId()+","+p.getUrlList());
	}
	Optional<Profile> optProfile = profileList.stream().filter(profile->profile.getId().equals(profileId)).findFirst();
	System.out.println("optProfile isPresent details:"+optProfile.isPresent());
	
	return optProfile.isPresent() ? optProfile.get() : new Profile();
  
  }
  
 public Endpoint getUrlList(final String profileId, final String urlName) {
   Profile profile = getProfile(profileId);
   
   if(profile!=null && !CollectionUtils.isEmpty(profile.getUrlList())) {
	 Optional<Endpoint> optUrl = profile.getUrlList().stream().filter(url->url.getName().equals(urlName)).findFirst();
	 if(optUrl.isPresent())
	   return optUrl.get();
   }
   return new Endpoint();
 }
  
}
