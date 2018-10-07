

import java.rmi.*;

public class CannonMonitor {
	BombOmbCannonRemote monitor;
	
	public CannonMonitor(BombOmbCannonRemote monitor) {
		this.monitor = monitor;
	}
	
	public void monitorResults() {
		try {
		System.out.println("Cannon located on Level:" + monitor.getLevel());
		System.out.println("Number of bomb-ombs:" + monitor.getCount());
		System.out.println("Cannon Status:" + monitor.getCannonState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
