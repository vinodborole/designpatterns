/**
 * SensorSystem is the “subject”.  
 * Lighting, Gates, and Surveillance are the “views”. 
 * The subject is only coupled to the “abstraction” of AlarmListener.
 * @author manish
 *
 */
public class ClassVersusInterface {
	public static void main( String[] args ) {
		  //Subject
	      SensorSystem ss = new SensorSystem();
	      // Client configures the number and type of Observers
	      ss.register( new Gates());
	      ss.register( new Lighting());
	      ss.register( new Surveillance());
	      ss.soundTheAlarm();
	} 
}
