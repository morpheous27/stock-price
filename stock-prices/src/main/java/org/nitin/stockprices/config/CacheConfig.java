package org.nitin.stockprices.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Config file to manage and configure cache manager settings.
 * 
 * @author Nitin@Linux
 *
 */
@Configuration
@EnableCaching
public class CacheConfig {

	/**
	 * Registers a cache manager with spring with the desired name.
	 * 
	 * @return
	 */
	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager("stockprices");
	}

	@Bean(name = "symbols")
	public Map<String,String> getSymbols() {
		
		Map<String,String> symbolsMap = new HashMap<>();
		symbolsMap.put("GOOG", "GOOG");
		symbolsMap.put("SAPE", "SAPE");
		symbolsMap.put("VWELX", "VWELX");
		symbolsMap.put("JPM", "JPM");
		
		return symbolsMap;
	}
}
