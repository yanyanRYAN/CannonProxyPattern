
import java.rmi.*;

public class Main {	
	
	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		//*******************************************************************
		/*
		 * To use this block of code, main method needs to throw RemoteException
		 * 
		 * 
		 */
		BombOmbCannonRemote bombOmbCannon = null;
		int count;
		
		if (args.length < 2) {
			System.out.println("Cannon <Level course#.star#.com> <1 or 0>");
			System.exit(1);
		}
		
		try {
			count = Integer.parseInt(args[1]);  // 1 or 0
			
			bombOmbCannon = new BombOmbCannon(args[0], count);
			Naming.rebind("//" + args[0] + "/bombombcannon", bombOmbCannon);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//******************************************************************
		
		//Otherwise run this code to at least do something with 
		
		/*
		 * This block of code will run regardless if the network works or fails
		 */
		
		
		
		
		BombOmbCannon bombOmbCannon0 = new BombOmbCannon("course1.star1.com",0);
		CannonMonitor cannonMonitor = new CannonMonitor(bombOmbCannon0);
		
		System.out.println(bombOmbCannon0);
		bombOmbCannon0.bombLoadedCannon();
		System.out.println(bombOmbCannon0);
		bombOmbCannon0.bombIgnited();
		System.out.println(bombOmbCannon0);
		bombOmbCannon0.bombFired();
		System.out.println(bombOmbCannon0);
		bombOmbCannon0.bombFired();
		System.out.println(bombOmbCannon0);
		bombOmbCannon0.unLoadedCannon();
		System.out.println(bombOmbCannon0);
		bombOmbCannon0.bombIgnited();
		System.out.println(bombOmbCannon0);
		bombOmbCannon0.bombFired();
		System.out.println(bombOmbCannon0);
		bombOmbCannon0.bombLoadedCannon();
		System.out.println(bombOmbCannon0);
		bombOmbCannon0.bombFired();
		
		System.out.println("\nResults from Monitor \n");
		
		cannonMonitor.monitorResults();
		
		System.out.println("\n##################\n");
		
		BombOmbCannon bombOmbCannon2 = new BombOmbCannon("course1.star2.com",1);
		CannonMonitor cannonMonitor2 = new CannonMonitor(bombOmbCannon2);
		
		System.out.println(bombOmbCannon2);
		bombOmbCannon2.bombLoadedCannon();
		System.out.println(bombOmbCannon2);
		bombOmbCannon2.bombIgnited();
		System.out.println(bombOmbCannon2);
		bombOmbCannon2.bombFired();
		System.out.println(bombOmbCannon2);
		bombOmbCannon2.bombFired();
		System.out.println(bombOmbCannon2);
		bombOmbCannon2.unLoadedCannon();
		System.out.println(bombOmbCannon2);
		bombOmbCannon2.bombIgnited();
		System.out.println(bombOmbCannon2);
		bombOmbCannon2.bombFired();
		System.out.println(bombOmbCannon2);
		bombOmbCannon2.bombLoadedCannon();
		System.out.println(bombOmbCannon2);
		bombOmbCannon2.bombFired();
		
		System.out.println("\nResults from Monitor \n");
		
		cannonMonitor2.monitorResults();
		
	}
	

}
