package org.nitin.stockprices.cache;

import java.math.BigDecimal;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

/**
 * Interface to represent CRUD operations supported on an entity.
 * 
 * @author Nitin@Linux
 *
 */
@CacheConfig(cacheNames = { "stockprices" })
public interface CacheService {

	@Cacheable
	public BigDecimal findPriceBySymbol(String symbol);

	@CacheEvict
	public void removeFromCache(String symbol);

}