package com.sf.rnd.consul.tools;

public interface ServiceRegistry {
	
    public void registerService(String name, String uri);
    
    public void unregisterService(String name, String uri);
    
    public String discoverServiceURI(String name);
}
