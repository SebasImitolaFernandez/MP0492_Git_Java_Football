package worldcup;

import java.util.Random;

/**
 * Class to define the defender
 */

public class Defender extends Player { // defender, now, extends player. Previously, defenders were not recognized as
										// players.
	boolean mark;

	public void steal(Ball ball) {
		String[] effects = { "with fault", "without fault" };

		Random rand = new Random();
		String effect = effects[rand.nextInt(effects.length)];
		System.out.println("steals the ball " + effect);
	}

	public boolean isMark() {
		return mark;
	}

	public void setMark(boolean mark) {
		this.mark = mark;
	}
}
