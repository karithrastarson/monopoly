package valtech.germanTeam.bo;

public class Board {

	//The board has only a pointer to the first space
	private Space startSpace;
	
	public Board()
	{
		//Constructor
		
		
		//Create a linked list of spaces
		
		//Create the first space, which is the one Board has
		
		startSpace = new Space("1");
		
		/*
		 * memorySpace remembers what was the second space 
		 * created in last iteration of the for loop
		 * */
		Space memorySpace = startSpace;
		for(int i = 2; i<40; i++){
			
			//Create a new space
			Space sp1 = new Space(Integer.toString(i));
			//Connect the last space to this new one
			memorySpace.setNextSpace(sp1);
			
			
			Space sp2 = new Space(Integer.toString(i+1));
			sp1.setNextSpace(sp2);
			memorySpace = sp2;
		}
		memorySpace.setNextSpace(startSpace);
		
		
	}
}