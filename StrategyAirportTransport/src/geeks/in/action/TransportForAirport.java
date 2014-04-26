package geeks.in.action;

/**
 * Transport for airport that doesn't know anything about concrete strategy
 * classes. It only knows about the strategy interface
 * 
 * @author manishdevraj
 * 
 */
class TransportForAirport {
	private TransportStrategy strategy;

	public void useTransport() {
		strategy.useTransport();
	}

	public void setTransportStrategy(TransportStrategy concreteStrategy) {
		this.strategy = concreteStrategy;
	}

}
