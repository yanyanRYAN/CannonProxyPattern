
public class UnLoadedState implements BombOmbCannonState {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient BombOmbCannon bombOmbCannon;

	public UnLoadedState(BombOmbCannon bombOmbCannon) {
		// TODO Auto-generated constructor stub
		this.bombOmbCannon = bombOmbCannon;
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		System.out.println("\nThere is nothing to unload.\n");
	}

	@Override
	public void loaded() {
		// TODO Auto-generated method stub
		System.out.println("\nYou loaded a bomb-omb.\n");
		bombOmbCannon.setCannonState(bombOmbCannon.getBombLoaded());
	}

	@Override
	public void ignited() {
		// TODO Auto-generated method stub
		System.out.println("\nThere is nothing to ignite.\n");
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("\nYou pull on the string. \n");
		System.out.println("*Click* *Click* Nothing happened.\n");
		System.out.println("Cannon is empty.\n");

	}
	
	public String toString() {
		return "Waiting for bomb-ombs";
	}

}
