
public class TaxiStrategy implements Strategy {
	private String sAirportName;
	public TaxiStrategy(String sAirportNamein){
		this.sAirportName = sAirportNamein;
	}
	@Override
	public void useTransport() {
	  System.out.println("Customer is going to airport " + sAirportName + " via Taxi");
	}

}
