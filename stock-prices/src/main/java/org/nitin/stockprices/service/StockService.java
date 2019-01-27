package org.nitin.stockprices.service;

import java.math.BigDecimal;

import org.nitin.stockprices.model.Stock;

public interface StockService {

	public BigDecimal getPrice(String symbol);

	public void consumePrice(Stock stock);

}
