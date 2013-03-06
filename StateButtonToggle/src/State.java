/**
 * The "wrappee" hierarchy
 * @author manish
 *
 */
class State {
	public void push( Button b )  {              
      b.setCurrent( OFF.instance() );
      System.out.println( "   turning OFF" );
    }
}
