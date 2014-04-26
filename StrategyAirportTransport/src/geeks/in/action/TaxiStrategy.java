package geeks.in.action;

/**
 * Concrete strategy implementation that uses Taxi
 * 
 * @author manishdevraj
 * 
 */
public class TaxiStrategy implements TransportStrategy {
	private final String sAirportName;

	public TaxiStrategy(String sAirportNamein) {
		this.sAirportName = sAirportNamein;
	}

	@Override
	public void useTransport() {
		System.out.println("Customer is going to airport " + sAirportName
				+ " via Taxi");
	}

}
