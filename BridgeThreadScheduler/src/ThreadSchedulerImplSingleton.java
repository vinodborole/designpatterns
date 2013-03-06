
public class ThreadSchedulerImplSingleton {
	private static ThreadSchedulerImpl threadSchedulerImpl;
	
	public ThreadSchedulerImplSingleton(ThreadSchedulerImpl threadSchedulerImplIn){
		this.threadSchedulerImpl = threadSchedulerImplIn;
	}
	
	public static ThreadSchedulerImpl getThreadSchedulerImpl(){
		return threadSchedulerImpl;
	}
}
