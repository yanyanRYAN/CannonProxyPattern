
import java.io.*;

public interface BombOmbCannonState extends Serializable {

	public void empty();
	public void loaded();
	public void ignited();
	public void fire();
	
}
