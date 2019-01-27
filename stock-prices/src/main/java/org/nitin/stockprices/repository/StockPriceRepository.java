package org.nitin.stockprices.repository;

import java.util.Map;

import org.nitin.stockprices.model.Stock;

public interface StockPriceRepository {
	
	public Map<String, Stock> findSourceMapBySymbol(String symbol);
	
	public void saveSourceMap(String source, Stock stock);
	
	public void saveSymbolSourceMap(String symbol, Map<String, Stock> map);

	public void saveStock(Stock stock);

}