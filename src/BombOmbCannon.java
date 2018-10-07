
import java.rmi.*;
import java.rmi.server.*;

public class BombOmbCannon 
	extends UnicastRemoteObject implements BombOmbCannonRemote {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BombOmbCannonState unLoaded;
	BombOmbCannonState bombLoaded;
	BombOmbCannonState bombIgnited;
	BombOmbCannonState fireBomb;
	
	BombOmbCannonState state;
	
	int count = 0;
	// MAX_COUNT = 1;
	
	String level;
	
	public BombOmbCannon(String level, int bombCount) throws RemoteException {
		unLoaded = new UnLoadedState(this);
		bombLoaded = new LoadedState(this);
		bombIgnited = new IgnitedState(this);
		//fireBomb = new FiredState(this);
		
		this.count = bombCount;
		if(bombCount > 0) {
			state = bombLoaded;
		} else {
			state = unLoaded;
		}
		this.level = level;
	}
	
	void setCannonState(BombOmbCannonState state) {
		this.state = state;
	}
	
	
	public void unLoadedCannon() {
		state.empty();
	}
	
	public void bombLoadedCannon() {
		state.loaded();
		count=1;
	}
	
	public void bombIgnited() {
		state.ignited();
	}
	
	public void bombFired() {
		state.fire();
		if(count != 0) {
			count--;
		}
	}
	
	public int getCount() {
		
		return count;
	}
	
	public BombOmbCannonState getUnLoaded() {
		return unLoaded;
	}
	
	public BombOmbCannonState getBombLoaded() {
		return bombLoaded;
	}
	
	public BombOmbCannonState getBombIgnited() {
		return bombIgnited;
	}
	
	public BombOmbCannonState getBombFired() {
		return fireBomb;
	}
	
	public BombOmbCannonState getCannonState() {
		return state;
	}
	
	public String getLevel() {
		return level;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMario 64 - Bomb-Omb Cannon \n");
		result.append("Cannon currently has " + count + " bomb-omb(s) loaded.\n");
		result.append("Bomb-Omb Cannon is currently:" + state + ".");
		
		return result.toString();
	}

	
	
}
