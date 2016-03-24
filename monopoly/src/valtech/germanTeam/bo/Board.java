package valtech.germanTeam.bo;

public class Board {

	//The board has only a pointer to the first space
	private Space startSpace;
	
	public Board()
	{
		//Constructor
		initBoard();
	}
	
	private void initBoard(){
		//Create a linked list of spaces
		
		//Create the first space, which is the one Board has	
		
		/*
		 * memorySpace remembers what was the second space 
		 * created in last iteration of the for loop
		 * */
		
		startSpace = new ActionSpace("GO",0 , 0);
		
		Space two = new OwnedSpace("Mediterranean Ave.", 60, 2);
		Space  three= new ActionSpace("Community Chest", 0, 0);
		Space four = new OwnedSpace("Baltic Ave.", 60, 4);
		Space five = new ActionSpace("Income Tax", 200, 0);
		Space six = new OwnedSpace("Reading Rail Road", 200, 0);
		Space seven = new OwnedSpace("Oriental Ave.", 100, 6);
		Space eight = new ActionSpace("CHANCE", 0, 0);
		Space nine = new OwnedSpace("Vermont Ave.", 100, 6);
		Space ten = new OwnedSpace("Conneticut Ave.",120, 8);
		Space eleven = new ActionSpace("Jail", 0,0);
		Space twelve = new OwnedSpace("St. Charles Place", 140,10);
		Space thirteen = new OwnedSpace("Electric Company", 150, 0);
		Space fourteen = new OwnedSpace("States Ave.", 140, 10);
		Space fifteen = new OwnedSpace("Virginia Ave.", 160, 12);
		Space sixteen = new OwnedSpace("Pennsylvania Railroad", 200, 0);
		Space seventeen = new OwnedSpace("St. James Place", 180, 40);
		Space eighteen = new ActionSpace("Community Chest", 0, 0);
		Space nineteen = new OwnedSpace("Tennessee Ave.", 180, 14);
		Space twenty = new OwnedSpace("New York Ave.", 200, 16);
		Space twentyone = new ActionSpace("Free Parking", 0,0);
		Space twentytwo = new OwnedSpace("Kentucky Ave.", 220, 18);
		Space twentythree = new ActionSpace("CHANCE", 0,0);
		Space twentyfour = new OwnedSpace("Indina Ave.", 220, 18);
		Space twentyfive = new OwnedSpace("Illinois Ave. ", 240, 20);
		Space twentysix = new OwnedSpace("B. & O. Railroad", 200, 0);
		Space twentyseven = new OwnedSpace("Atlantic Ave.", 260, 22);
		Space twentyeight = new OwnedSpace("Ventnor Ave.", 260, 22);
		Space twentynine = new OwnedSpace("Water Works", 150, 0);
		Space thirty = new OwnedSpace("Marvin Gardens", 280, 22);
		Space thirtytwo = new ActionSpace("GO TO JAIL",0,0);
		Space thirtythree = new OwnedSpace("Pacific Ave.", 300, 26);
		Space thirtyfour = new OwnedSpace("North Carolina Ave.",300, 26 );
		Space thirtyfive = new ActionSpace("Community Chest", 0,0);
		Space thirtysix = new OwnedSpace("Pennsylvania Ave.", 320, 28);
		Space thirtyseven = new OwnedSpace("Short Line Rail Road", 200, 0);
		Space thirtyeight = new OwnedSpace("Park Place", 350, 35);
		Space thirtynine = new ActionSpace("LuxuryTax", 0 , 75);
		Space forty = new OwnedSpace("Board Walk", 400, 50);
		
		connectSpace(startSpace,two);
		connectSpace(two,three);
		connectSpace(three,four);
		connectSpace(four,five);
		connectSpace(five,six);
		connectSpace(seven,eight);
		connectSpace(eight,nine);
		connectSpace(nine,ten);
		connectSpace(ten,eleven);
		connectSpace(eleven,twelve);
		connectSpace(thirteen,fourteen);
		connectSpace(fifteen,sixteen);
		connectSpace(sixteen,seventeen);
		connectSpace(seventeen,eighteen);
		connectSpace(eighteen,nineteen);
		connectSpace(nineteen,twenty);
		connectSpace(twenty,twentyone);
		connectSpace(twentyone, twentytwo);
		connectSpace(twentytwo, twentythree);
		connectSpace(twentythree, twentyfour);
		connectSpace(twentyfour, twentyfive);
		connectSpace(twentyfive, twentysix);
		connectSpace(twentysix, twentyseven);
		connectSpace(twentyseven, twentyeight);
		connectSpace(twentyeight, twentynine);
		connectSpace(twentynine, thirty);
		connectSpace(thirty, thirtytwo);
		connectSpace(thirtytwo, thirtythree);
		connectSpace(thirtythree, thirtyfour);
		connectSpace(thirtyfour, thirtyfive);
		connectSpace(thirtyfive, thirtysix);
		connectSpace(thirtysix, thirtyseven);
		connectSpace(thirtyseven, thirtyeight);
		connectSpace(thirtyeight, thirtynine);
		connectSpace(thirtynine, forty);
		connectSpace(forty, startSpace);
		
		/*Space memorySpace = spNext;
		for(int i = 2; i < 40; i++){
			
			//Create a new space
			Space sp1 = new Space(Integer.toString(i), i);
			//Connect the last space to this new one
			memorySpace.setNextSpace(sp1);
			
			memorySpace = sp1;
			
		}
		memorySpace.setNextSpace(startSpace);*/
	}
	
	//Getter
	public Space getStartSpace()
	{
		return startSpace;
	}
	
	private void connectSpace(Space currentSpace, Space nextSpace){
		currentSpace.setNextSpace(nextSpace);
	}
}
