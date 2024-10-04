package com.bptn.course._hackDayFriday;

public class Stock {

	// Create instance variables
	String tickerSymbol, companyName;
	int price, totalShares;
	double percentChange;
	long marketCap;

	// Constructor
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0.0;
		this.marketCap = (long) totalShares * price;
	}

	// Create the methods
	public void adjustPrice(int change) {
		this.price = change + price;
		this.percentChange = ((double) (change) / this.price) * 100;
		this.marketCap = (long) this.totalShares * this.price;
	}

	@Override
	public String toString() {
		return "Ticker Symbol: " + tickerSymbol + "\n" + "Company: " + companyName + "\n" + "Current Price: " + "$"
				+ price + " " + "(" + percentChange + "%)" + "\n" + "Market Cap: " + "$" + marketCap;
	}

	// Don't modify the code below:
	public static void main(String[] args) {
		Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
		System.out.println(stock);
		stock.adjustPrice(20);
		System.out.println(stock);
	}
}