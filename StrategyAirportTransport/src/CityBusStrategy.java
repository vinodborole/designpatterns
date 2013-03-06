
public class CityBusStrategy implements Strategy {
	private String sAirportName;
	
	public CityBusStrategy(String sAirportNamein){
		this.sAirportName = sAirportNamein;
	}
	@Override
	public void useTransport() {
		System.out.println("Customer is going to airport  " + sAirportName + " via CityBus");
	}

}
