package org.nitin.stockprices.cache;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeSet;

import org.nitin.stockprices.model.Stock;
import org.nitin.stockprices.repository.StockPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Repository implementation to {@link CacheService}
 * 
 * @author Nitin@Linux
 * 
 */
@Service
public class CacheServiceImpl implements CacheService {

	@Autowired
	private StockPriceRepository stockPriceRepository;

	@Override
	public BigDecimal findPriceBySymbol(String symbol) {

		Map<String, Stock> sourcePriceMap = stockPriceRepository.findSourceMapBySymbol(symbol);
		if (sourcePriceMap == null) {
			return null;
		}
		TreeSet<Stock> stockSet = new TreeSet<>(sourcePriceMap.values());
		return stockSet.first().getPrice();
	}

	@Override
	public void removeFromCache(String symbol) {
	}

}
