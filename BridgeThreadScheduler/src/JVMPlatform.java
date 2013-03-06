
public class JVMPlatform implements ThreadSchedulerImpl {

	@Override
	public void runThreadImpl() {
		System.out.println("Platform used is JVM!");
	}

}
