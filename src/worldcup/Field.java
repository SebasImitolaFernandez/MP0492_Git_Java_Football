package worldcup;

/**
 * Class to define the player
 */

public class Field {
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Field(int size) {
		super();
		this.size = size;
	}
	
	public void light() {
		System.out.println(" switching the lights");
	}
	
}
