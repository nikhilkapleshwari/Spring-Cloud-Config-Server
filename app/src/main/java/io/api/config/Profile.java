package io.api.config;

import java.util.ArrayList;
import java.util.List;

public class Profile {


  private String id;
  private List<Endpoint> urlList = new ArrayList<>();
  
  public Profile() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<Endpoint> getUrlList() {
    return urlList;
  }

  public void setUrlList(List<Endpoint> urlList) {
    this.urlList = urlList;
  }

  @Override
  public String toString() {
	StringBuilder sb = new StringBuilder("Profile [id=" + id);
	
	for(Endpoint url:urlList)
	  sb.append(url.toString());
	
	sb.append("]");
	return sb.toString();
  }
  
}
