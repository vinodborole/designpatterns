package geeks.in.action;

/**
 * Main Class
 * 
 * @author manishdevraj
 * 
 */
public class JavaStrategyDesignPatternExample {
	public static void main(String[] args) {
		TransportForAirport context;
		// a demonstration of how we might choose different strategies
		context = new TransportForAirport();
		TransportStrategy concreteTaxiStrategy = new TaxiStrategy("Heathrow");
		context.setTransportStrategy(concreteTaxiStrategy);
		context.useTransport();

		TransportStrategy concreteBusStrategy = new CityBusStrategy("Mumbai");
		context.setTransportStrategy(concreteBusStrategy);
		context.useTransport();
	}
}
