package geeks.in.action;

/**
 * Concrete strategy implementation that uses City Bus
 * 
 * @author manishdevraj
 * 
 */
public class CityBusStrategy implements TransportStrategy {
	private final String sAirportName;

	public CityBusStrategy(String sAirportNamein) {
		this.sAirportName = sAirportNamein;
	}

	@Override
	public void useTransport() {
		System.out.println("Customer is going to airport " + sAirportName
				+ " via City Bus");
	}

}
