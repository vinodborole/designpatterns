
public class UnixPlatform implements ThreadSchedulerImpl {

	@Override
	public void runThreadImpl() {
		System.out.println("Platform used is Unix!");
	}

}
