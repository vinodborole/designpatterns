
public class DownVisitor extends ReflectiveVisitor {

	@Override
	public void visit(Object o) {
		try {
		     getMethod( o.getClass() ).invoke( this, new Object[] { o } );
		} catch (Exception ex) {
		     System.out.println( "DownVisitor - no appropriate visit() method" );
	    }
	}
	
	public void visitThat( That e ) {
	    System.out.println( "DownVisitor: do Down on " + e.that() );
	}

}
