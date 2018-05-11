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
			Rebels.name = "Rebels";
		}

		public enemies randMonster() {
			dice diceSet = new dice();
			int roll = diceSet.roll(3, 1);
			if (roll==1) {
				return Ewok;
			}
			if (roll==2) {
				return Rebels;
			}
			
		}
	}
