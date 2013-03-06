
public class JavaStrategyDesignPatternExample {
	public static void main(String[] args){
		Context context;
	    // a demonstration of how we might choose different strategies
	    context = new Context();
	    context.setTaxiStrategy("Heathrow");
	    context.useTransport();
	    
	    context.setCityBusStrategy("Mumbai");
	    context.useTransport();
	}
}
