
public class WindowsPlatform implements ThreadSchedulerImpl {

	@Override
	public void runThreadImpl() {
		System.out.println("Platform used is Windows!");
	}

}
