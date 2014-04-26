package geeks.in.action;

/**
 * Concrete Observer
 * 
 * @author manishdevraj
 * 
 */
public class Lighting implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("lights up");
	}

}
