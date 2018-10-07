
import java.rmi.*;

public class BombOmbCannonMonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] location = {"level1.star1.com/bombombcannon",
		"level1.star2.com/bombombcannon",
		"level1.star3.com/bombombcannon"};
	
	
		if (args.length >= 0) 
		{
			location = new String[1];
			location[0] = "rmi://" + args[0] + "/bombombcannon";
		}
		
		CannonMonitor[] cannonMonitor = new CannonMonitor[location.length];
		
		for (int i= 0; i< location.length; i++) {
			try {
				BombOmbCannonRemote bombOmbCannon = (BombOmbCannonRemote) 
						Naming.lookup(location[i]);
				cannonMonitor[i] = new CannonMonitor(bombOmbCannon);
				System.out.println(cannonMonitor[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i < cannonMonitor.length; i++) {
			cannonMonitor[i].monitorResults();
		}

	}
}