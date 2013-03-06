
public class TestTemplate {
	public static void main(String[] args) {
        
        LoanApp mortgageClient = new LoanApp("Judy");
        System.out.println("\nCheck client " + mortgageClient.getName()+ " Mortgage loan application. ");
        mortgageClient.check();
        
        LoanApp equityloanClient = new LoanApp("Mark");
        System.out.println("\nCheck client " + equityloanClient.getName()+ " equity loan application. ");
        equityloanClient.check();
    }
}
