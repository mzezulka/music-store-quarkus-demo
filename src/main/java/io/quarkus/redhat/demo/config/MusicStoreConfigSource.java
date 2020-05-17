package io.quarkus.redhat.demo.config;

import org.eclipse.microprofile.config.spi.ConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSourceProvider;

public class MusicStoreConfigSource implements ConfigSourceProvider {

	@Override
	public Iterable<ConfigSource> getConfigSources(ClassLoader forClassLoader) {
		// TODO Auto-generated method stub
		return null;
	}

}
