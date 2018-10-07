
public class LoadedState implements BombOmbCannonState {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient BombOmbCannon bombOmbCannon;

	public LoadedState(BombOmbCannon bombOmbCannon) {
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
		System.out.println("\nThe Cannon is already loaded.\n");

	}

	@Override
	public void ignited() {
		// TODO Auto-generated method stub
		System.out.println("\nYou ignite the bomb-omb.\n");
		bombOmbCannon.setCannonState(bombOmbCannon.getBombIgnited());
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("\nYou pull the string. \n");
		System.out.println("A black ball falls out.\n");
		System.out.println("The bomb-omb has not been ignited.");
	}
	
	public String toString() {
		return "Loaded";
	}

}
