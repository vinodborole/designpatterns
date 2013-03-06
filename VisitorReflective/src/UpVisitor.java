
public class UpVisitor extends ReflectiveVisitor {

	@Override
	public void visit(Object o) {
		try {
	      getMethod( o.getClass() ).invoke( this, new Object[] { o } );
	    } catch (Exception ex) {
	      System.out.println( "UpVisitor - no appropriate visit() method" );
	    }
	}
	
	public void visitThis( This e ) {
	    System.out.println( "UpVisitor: do Up on " + e.thiss() );
	}
	
	public void visitObject( Object e ) {
	    System.out.println( "UpVisitor: generic visitObject() method" );
	}

}
