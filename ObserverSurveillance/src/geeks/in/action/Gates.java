package geeks.in.action;

/**
 * Concrete Observer
 * 
 * @author manishdevraj
 * 
 */
public class Gates implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("gates close");
	}

}
