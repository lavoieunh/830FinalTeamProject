package UI;

public abstract class UserInterface {

	public static void UserOutput(String Output)
	{
		/*
		Integer ConsoleWidth = 166;
		String sCR = "\r\n";
		Integer iStartIndex = 1;
		Integer iEndIndex = ConsoleWidth;
		
		String sFormatOut = "";
		Boolean bEndofString = false;
		
		while(!bEndofString & Output.length()>ConsoleWidth)
		{
			iEndIndex = Output.indexOf(" ", iEndIndex); //Find the next space in the string.
			sFormatOut = Output.substring(iStartIndex, iEndIndex) + sCR; //Add it to the formmatted string and append a carrage return
			iStartIndex = iEndIndex; // Advance the start index to the end of the previous interation
			
			iEndIndex = iEndIndex + ConsoleWidth;
			if(iEndIndex > Output.length())
			{
				iEndIndex = Output.length();
			}	bEndofString = true;
			
		}
		*/
		
		System.out.println(Output);
		
		
	}
	
			
	
	
	
}
