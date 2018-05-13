package UI;

public abstract class UserInterface {

	public static void UserOutput(String Output, Boolean wrap)
	{
		///*
 		Integer ConsoleWidth = 80;
		String sCR = "\r\n";
		Integer iStartIndex = 0;
		Integer iEndIndex = ConsoleWidth;
		
		String sFormatOut = "";
		Boolean bEndofString = false;
		
		//System.out.println(Output.length()); //Debug
		if(Output.length()<ConsoleWidth || wrap.equals(false))
		{
			sFormatOut = Output;
			bEndofString = true; //Don't enter the while loop and reformat the string.
		}
		
		while(!bEndofString ) //not the end of the string...
		{
			/*//Debug
			if(Output.indexOf(" ", iEndIndex) == -1)
			{
				System.out.println("iEndIndex -1");
				System.out.println(Output.length());
			}
			*/
			iEndIndex = Output.indexOf(" ", iEndIndex); //Find the next space in the string.

			if(iEndIndex <= -1 || iEndIndex > Output.length() ) //...there are no new spaces for the rest of the string...
			{
				iEndIndex = Output.length(); //...go to the end.
			}
			/*//Debug
			if(iStartIndex > iEndIndex)
			{
				System.out.println("Start is bigger" + "Start: " + iStartIndex.toString() + " End: " + iEndIndex);
				
			}
			*/
			sFormatOut = sFormatOut + Output.substring(iStartIndex, iEndIndex) + sCR; //Add it to the formated string and append a carriage return
			iStartIndex = iEndIndex; // Advance the start index to the end of the previous iteration
			
			iEndIndex = iEndIndex + ConsoleWidth; // Advance the end index the length for the console setting.
			if(iEndIndex >= Output.length()) //...
			{
				bEndofString = true;
			}

		}
		
		
		System.out.println(sFormatOut);
		//*/
		
		
		
	}
	
	public static void UserOutput(String Output)
	{
		System.out.println(Output);
	}
}
