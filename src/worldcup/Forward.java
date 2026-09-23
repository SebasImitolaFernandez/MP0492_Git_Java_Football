package worldcup;

import java.util.Random;

/**
 * Class to define the forward
 */
public class Forward extends Player {
	boolean killer;

	public void drible() {
		System.out.println("dribbling");
	}

	public boolean isKiller() {
		return killer;
	}

	public void setKiller(boolean killer) {
		this.killer = killer;
	}

	public void kick(Ball ball) { // Change kickball to kick
		String[] effects = { "with spin", "too high", "off target", "straight to the keeper", "into the top corner",
				"with great power", "weak shot", "curled beautifully" };

		Random rand = new Random();
		String effect = effects[rand.nextInt(effects.length)];
		System.out.println("kicking " + effect);
	}

}
