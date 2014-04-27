package geeks.in.action;

/**
 * Subject interface
 * 
 * @author manishdevraj
 * 
 */
public interface SecuritySystem {
	public void register(AlarmListener newAlarmListener);

	public void unregister(AlarmListener delAlarmListener);

	public void action();
}
