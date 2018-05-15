package BaseGame;


public class enemiesfight {
	
		enemies Ewok = new enemies();
		enemies Rebels = new enemies();
		
		public void setEwoks() {
			Ewok.ac = 10;
			Ewok.attackBonus = 7;
			Ewok.damage = 4;
			Ewok.hp = 10;
			Ewok.name = "Ewok";
		}
		public void setRebels() {
			Rebels.ac = 13;
			Rebels.attackBonus = 9;
			Rebels.damage = 6;
			Rebels.hp = 14;
			Rebels.name = "Rebel";
		}

		public enemies randMonster() {
			dice diceSet = new dice();
			enemies enemy = new enemies();
			int roll = diceSet.roll(2, 1);
			//System.out.println("" + roll);
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
