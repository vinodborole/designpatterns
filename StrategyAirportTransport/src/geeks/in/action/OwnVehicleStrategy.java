package geeks.in.action;

/**
 * Concrete Strategy implementation using own vehicle
 * 
 * @author manishdevraj
 * 
 */
public class OwnVehicleStrategy implements TransportStrategy {
	private final String sAirportName;

	public OwnVehicleStrategy(String sAirportNamein) {
		this.sAirportName = sAirportNamein;
	}

	@Override
	public void useTransport() {
		System.out.println("Customer is going to airport  " + sAirportName
				+ " via Own vehicle");
	}

}
