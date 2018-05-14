package BaseGame;


public class enemiesfight {
	
		enemies Ewok = new enemies();
		enemies Rebels = new enemies();
		
		public void setEwoks() {
			Ewok.ac = 6;
			Ewok.attackBonus = 5;
			Ewok.damage = 2;
			Ewok.hp = 5;
			Ewok.name = "Ewok";
		}
		public void setRebels() {
			Rebels.ac = 4;
			Rebels.attackBonus = 4;
			Rebels.damage = 1;
			Rebels.hp = 6;
			Rebels.name = "Rebel";
		}

		public enemies randMonster() {
			dice diceSet = new dice();
			enemies enemy = new enemies();
			int roll = diceSet.roll(2, 1);
			System.out.println("" + roll);
			if (roll==1) {
				enemy = Ewok;
				setEwoks();
			}
			if (roll==2) {
				enemy = Rebels;
				setRebels();
			}
			return enemy;
			
		}
	}
