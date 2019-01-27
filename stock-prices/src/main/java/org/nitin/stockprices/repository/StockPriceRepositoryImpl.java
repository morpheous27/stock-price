
package org.nitin.stockprices.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.nitin.stockprices.model.Stock;
import org.springframework.stereotype.Repository;

@Repository
public class StockPriceRepositoryImpl implements StockPriceRepository {

	private Map<String, Map<String, Stock>> stockPriceMap = new ConcurrentHashMap<String, Map<String, Stock>>();

	@Override
	public Map<String, Stock> findSourceMapBySymbol(String symbol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSourceMap(String source, Stock stock) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveStock(Stock stock) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveSymbolSourceMap(String symbol, Map<String, Stock> map) {
		// TODO Auto-generated method stub

	}

}
