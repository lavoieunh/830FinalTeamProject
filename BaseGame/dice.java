package game;

import java.util.Random;

public class dice {
	public int roll(int max, int min) {
		Random r = new Random();
		int rand = r.nextInt(max - min + 1) + min;
		return rand;
	}
}
