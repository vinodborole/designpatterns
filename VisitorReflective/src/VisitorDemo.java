
class VisitorDemo {
	public static void main( String[] args ) {
	    Element[]    list = { new This(), new That(), new TheOther() };
	    UpVisitor    up   = new UpVisitor();
	    DownVisitor  down = new DownVisitor();
	    for (int i=0; i < list.length; i++)
	      list[i].accept( up );
	    for (int i=0; i < list.length; i++)
	      list[i].accept( down );
   }
}
