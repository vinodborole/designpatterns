package geeks.in.action;

/**
 * Concrete Observer and template pattern implementation to override isolate
 * method
 * 
 * @author manishdevraj
 * 
 */
public class Surveillance extends CheckList implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("Surveillance - by the numbers:");
		byTheNumbers();
	}

	@Override
	protected void isolate() {
		System.out.println("   train the cameras");
	}

}
