
public class TimeSlicedThreadScheduler extends ThreadScheduler {
	
	public TimeSlicedThreadScheduler(){
		setThreadImpl();
	}
	
	@Override
	public void runThread() {
	   ThreadSchedulerImpl threadSchedulerImpl = this.getThreadSchedulerImpl();
       for (int i = 0; i < 5; i++) {
           System.out.print("Running Timesliced thread...");
           threadSchedulerImpl.runThreadImpl();
       }
       System.out.println(" ");
	}
}
