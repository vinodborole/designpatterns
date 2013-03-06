
public class PreemitiveThreadSchedular extends ThreadScheduler {
	
	public PreemitiveThreadSchedular(){
		setThreadImpl();
	}
	
	@Override
	public void runThread() {
	   ThreadSchedulerImpl threadSchedulerImpl = this.getThreadSchedulerImpl();
       for (int i = 0; i < 2; i++) {
           System.out.print("Running Preemitive thread...");
           threadSchedulerImpl.runThreadImpl();
       }
       System.out.println(" ");
	}
}
