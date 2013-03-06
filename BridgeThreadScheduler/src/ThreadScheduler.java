
public abstract class ThreadScheduler {
	ThreadSchedulerImpl threadSchedulerImpl;
	
	public ThreadSchedulerImpl getThreadSchedulerImpl() {
		return this.threadSchedulerImpl;
	}

	public void setThreadImpl(){
		threadSchedulerImpl = ThreadSchedulerImplSingleton.getThreadSchedulerImpl();
	}
	
	public abstract void runThread();
}
