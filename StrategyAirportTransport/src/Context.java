
class Context {
	// the Context doesn't know anything about concrete Strategy classes, it only knows
    // about the Strategy interface
	private Strategy strategy;

	public void useTransport() {
		strategy.useTransport();		
	}

	public void setTaxiStrategy(String sAirportNamein) {
		this.strategy = new TaxiStrategy(sAirportNamein); 
	}

	public void setCityBusStrategy(String sAirportNamein) {
		this.strategy = new CityBusStrategy(sAirportNamein);
	}
	
}
