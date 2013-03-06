
abstract class CheckBackground {
	public abstract void checkBank();
    public abstract void checkCredit();
    public abstract void checkLoan();
    public abstract void checkStock();
    public abstract void checkIncome();

    //work as template method
    public void check() {
    	// TODO add something that can be common to all loan application
        checkBank();
        checkCredit();
        checkLoan();
        checkStock();
        checkIncome(); 
    }
}
