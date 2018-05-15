/**
 * 
 */
package BaseGame;

/**
 * @author sthib
 *
 */
public class MedPack extends Item {

	/**
	 * @param Name
	 * @param Description
	 * @param DPS
	 * @param UseCount
	 * @param equipStatus
	 */
	public MedPack(String Name, String Description, Integer DPS, Integer UseCount, boolean equipStatus) {
		super(Name, Description, DPS, UseCount, equipStatus);
		// TODO Auto-generated constructor stub
	}
	public void UseItem(Player p) {
		if(equipStatus) {
			//MedPack numerical value will decrease by one with each use as stated in Item.java public void UseItem()
			super.UseItem(); //runs the super class UseItem()
			//each time the MedPack is used, player's health increases by 1
			if (p.currentHp < p.hp) {
			p.currentHp = p.currentHp + 1;
			p.timer = p.timer - 1;
			System.out.println("Player used Medpack: Health increased by 1, while using 1 parsec of time!");
			System.out.println("Current player Health " + p.currentHp + " / " + p.hp);
			}
			else if (p.currentHp >= p.hp) {
				System.out.println("You are too healthy for the medpack!");
			}
		}
		else {
			System.out.println("No MedPack available");
		}
	}
}
