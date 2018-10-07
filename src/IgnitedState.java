
public class IgnitedState implements BombOmbCannonState {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient BombOmbCannon bombOmbCannon;

	public IgnitedState(BombOmbCannon bombOmbCannon) {
		// TODO Auto-generated constructor stub
		this.bombOmbCannon = bombOmbCannon;
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		System.out.println("\nCannon is not empty.\n");

	}

	@Override
	public void loaded() {
		// TODO Auto-generated method stub
		System.out.println("\nCannon is already loaded.\n");
	}

	@Override
	public void ignited() {
		// TODO Auto-generated method stub
		System.out.println("\nBomb-omb is already ignited\n");
		//bombOmbCannon.setCannonState(bombOmbCannon.getBombIgnited());
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("\nYou choose fire the bomb-omb\n");
		System.out.println("firing at an unsuspecting koopa.\n");
		bombOmbCannon.setCannonState(bombOmbCannon.getUnLoaded());
	}
	
	public String toString() {
		return "Ignited";
	}

}
