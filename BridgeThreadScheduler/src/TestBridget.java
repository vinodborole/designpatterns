
public class TestBridget {
	public static void testUnixPlatform() {
	       ThreadSchedulerImplSingleton ThreadSchedulerImplSingleton = 
	         new ThreadSchedulerImplSingleton(new UnixPlatform());
	       System.out.println(
	         "testing preemitive thread on the unix platform");
	       PreemitiveThreadSchedular preemitiveThread = new PreemitiveThreadSchedular();
	       preemitiveThread.runThread();
	       System.out.println(
	         "testing timesliced thread on the unix platform");
	       TimeSlicedThreadScheduler timeslicedThread = new TimeSlicedThreadScheduler();
	       timeslicedThread.runThread();     
	   }
	   
	   public static void testWindowsPlatform() {
	       ThreadSchedulerImplSingleton ThreadSchedulerImplSingleton = 
	         new ThreadSchedulerImplSingleton(new WindowsPlatform());
	       System.out.println(
	         "testing preemitive on the Windows platform");
	       PreemitiveThreadSchedular preemitiveThread = new PreemitiveThreadSchedular();
	       preemitiveThread.runThread();
	       System.out.println(
	         "testing timesliced thread on the Windows platform");
	       TimeSlicedThreadScheduler timeslicedThread = new TimeSlicedThreadScheduler();
	       timeslicedThread.runThread();     
	   }   
	   
	   public static void testJVMPlatform() {
	       ThreadSchedulerImplSingleton ThreadSchedulerImplSingleton = 
	         new ThreadSchedulerImplSingleton(new JVMPlatform());
	       System.out.println(
	         "testing preemitive on the JVM platform");
	       PreemitiveThreadSchedular preemitiveThread = new PreemitiveThreadSchedular();
	       preemitiveThread.runThread();
	       System.out.println(
	         "testing timesliced thread on the JVM platform");
	       TimeSlicedThreadScheduler timeslicedThread = new TimeSlicedThreadScheduler();
	       timeslicedThread.runThread();     
	   }
	    
	   public static void main(String[] args) {
	        testUnixPlatform();
	        testWindowsPlatform();
	        testJVMPlatform();
	   }
}
