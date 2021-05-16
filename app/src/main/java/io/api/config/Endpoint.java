package io.api.config;

public class Endpoint {

  private String name;
  private String url;
  private int ttl;
  
  
  public Endpoint() {
  }


  public Endpoint(String name, String url, int ttl) {
	super();
	this.name = name;
	this.url = url;
	this.ttl = ttl;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public int getTtl() {
    return ttl;
  }


  public void setTtl(int ttl) {
    this.ttl = ttl;
  }

  @Override
  public String toString() {
	return "Endpoint [name=" + name + ", url=" + url + ", ttl=" + ttl + "]";
  }
}
