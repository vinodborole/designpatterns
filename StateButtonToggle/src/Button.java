/**
 * The "wrapper" class  
 * @author manish
 *
 */
class Button {
	   //The "current" state object
	   private State current;

	   public Button()                   { current = OFF.instance(); }
	   public void setCurrent( State s ) { current = s; }

	   // The "wrapper" always delegates to the "wrappee"
	   public void push()                { current.push( this ); }
}
