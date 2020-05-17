package io.quarkus.redhat.demo;

import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.redhat.demo.config.MusicStoreConfiguration;

@Path("/hello")
public class ExampleResource {

	@Inject
	MusicStoreConfiguration msc;
	
	@ConfigProperty(name = "com.redhat.foo.bar.message")
	Optional<String> message;
	
	@ConfigProperty(name = "com.redhat.foo.bar.aux.no-shops")
	Integer noShops;
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return msc.message.concat("\n");
    }
}