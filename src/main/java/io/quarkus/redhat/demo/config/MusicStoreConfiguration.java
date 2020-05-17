package io.quarkus.redhat.demo.config;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "com.redhat.foo.bar")
public class MusicStoreConfiguration {
    
	public String message;
    
	public AuxConfig aux;
	
    public static class AuxConfig {
    	public Integer noShops;
    }
}
