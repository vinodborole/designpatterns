class This implements Prototype, Command {
	
	public Object clone() {
	    return new This();
	  }
	
	public String getName() {
		return "This";
	}

	public void execute() {
		System.out.println( "This: execute" );
	}

}
