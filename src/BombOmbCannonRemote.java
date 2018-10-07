
import java.rmi.*;

public interface BombOmbCannonRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLevel() throws RemoteException;
	public BombOmbCannonState getCannonState() throws RemoteException;
}
