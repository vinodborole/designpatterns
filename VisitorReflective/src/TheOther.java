
public class TheOther implements Element {
	@Override
	public void   accept( ReflectiveVisitor v ) { v.visit( this ); }
	
    public String theOther() { return "TheOther"; }

}
