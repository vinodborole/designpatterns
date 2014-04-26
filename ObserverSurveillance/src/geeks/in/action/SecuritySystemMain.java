package geeks.in.action;

/**
 * SensorSystem is the Subject. Lighting, Gates, and Surveillance are the
 * Observers. The subject is only coupled to the abstraction of AlarmListener.
 * 
 * @author manishdevraj
 * 
 */
public class SecuritySystemMain {
	public static void main(String[] args) {
		// Subject
		SecuritySystem ss = new SensorSystem();
		// Client configures the number and type of Observers
		ss.register(new Gates());
		ss.register(new Lighting());
		ss.register(new Surveillance());
		ss.action();
	}
}
