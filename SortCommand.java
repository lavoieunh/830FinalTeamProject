package UI;

public class SortCommand implements Commandable {
	
	public SortCommand(MyGame g)
	{
		g.Subscribe(this);
	}
	
	
	@Override
	public void doCommand(MyGame g) {
	
		/*
		String s = o.getUserInput().toUpperCase();
		
		switch (s) {
		case  "AUTHOR":
			o.setSort(s);
			break;
		case "TITLE":
			o.setSort(s);
			break;
		case "YEAR":
			o.setSort(s);
			break;
		case "NOSORT":
			o.setSort("");
			break;
		default:
			o.setSort("");
			break;
		}
		
		UserInterface.UserOutput("Sorting set to: " + o.getSort());
		*/
	}

	@Override
	public boolean matchCommand(String s) {
		
		
		switch (s.toUpperCase()) {
		case  "AUTHOR":
			return true;
		case "TITLE":
			return true;
		case "YEAR":
			return true;
		case "NOSORT":
			return true;
		default:
			return false;
		}
		//return s.toUpperCase().equals("SORT"); //returns true for match and false for no match.
	}


	@Override
	public String getCommandText() {
		// TODO Auto-generated method stub
		return null;
	}

}
