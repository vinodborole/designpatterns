package geeks.in.action;

import java.util.ArrayList;
import java.util.List;

/**
 * This is Main subject
 * 
 * @author manishdevraj
 * 
 */
public class SensorSystem implements SecuritySystem {
	private final List<AlarmListener> listeners = new ArrayList<AlarmListener>();

	@Override
	public void register(AlarmListener newAlarmListener) {
		listeners.add(newAlarmListener);
	}

	@Override
	public void unregister(AlarmListener delAlarmListener) {
		listeners.remove(delAlarmListener);
	}

	@Override
	public void action() {
		soundTheAlarm();
	}

	private void soundTheAlarm() {
		for (AlarmListener alarmL : listeners) {
			alarmL.alarm();
		}
	}
}
