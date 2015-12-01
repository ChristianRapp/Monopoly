import java.util.*;

public class Runner
	{

		static ArrayList<Square> board = new ArrayList<Square>();
		
		public static void main(String[] args)
			{
				

			}
		
		
		public static void addProperty()
		{
			//Colored properties are buy price, rent, mortgage, color, name
			board.add(new ColoredProperty(60, 2,  0, "Dagobah", "Swamp"));
			board.add(new CommunityChest("Community Chest 1"));
			board.add(new ColoredProperty(60, 4,  0, "Dagobah", "Swamp"));
			board.add(new Tax("Docking tax", 25));
			
			board.add(new Railroad(200, 0,"Tie Fighter"));
			
			board.add(new ColoredProperty(100, 6,  0, "Hoth", "Swamp"));
			board.add(new Chance("Chance 1"));
			board.add(new ColoredProperty(100, 6,  0, "Hoth", "Swamp"));
			board.add(new ColoredProperty(120, 8,  0, "Hoth", "Swamp"));
			
			board.add(new Jail("Jail"));
			board.add(new ColoredProperty(140, 10,  0, "Tatooine", "Swamp"));
			board.add(new Utility(150, 0, "Reactor Core"));
			board.add(new ColoredProperty(140, 10,  0, "Tatooine", "Swamp"));
			board.add(new ColoredProperty(160, 12,  0, "Tatooine", "Swamp"));
			
			board.add(new Railroad(200, 0,"Millennium Falcon"));
			board.add(new ColoredProperty(180, 14,  0, "Yavin 4", "Swamp"));
			board.add(new CommunityChest("Community Chest 2"));
			board.add(new ColoredProperty(180, 14,  0, "Yavin 4", "Swamp"));
			board.add(new ColoredProperty(200, 16,  0, "Yavin 4", "Swamp"));
			board.add(new FreeParking("Free Parking"));
			//halfway
			
			board.add(new ColoredProperty(60, 2,  0, "Cloud City", "Swamp"));
			board.add(new CommunityChest("Community Chest 1"));
			board.add(new ColoredProperty(60, 4,  0, "Cloud City", "Swamp"));
			board.add(new ColoredProperty(60, 4,  0, "Cloud City", "Swamp"));
			
			board.add(new Railroad(200, 0,"X-Wing Fighter"));
			
			board.add(new ColoredProperty(100, 6,  0, "Death Star", "Swamp"));
			board.add(new ColoredProperty(120, 8,  0, "Death Star", "Swamp"));
			board.add(new Utility(150, 0, "Moisture Farm"));
			board.add(new ColoredProperty(100, 6,  0, "Death Star", "Swamp"));
			
			board.add(new GoToJail("Go To Jail"));
			board.add(new ColoredProperty(140, 10,  0, "Endor", "Swamp"));
			board.add(new ColoredProperty(160, 12,  0, "Endor", "Swamp"));
			board.add(new Chance("Chance 1"));
			board.add(new ColoredProperty(140, 10,  0, "Endor", "Swamp"));
			
			board.add(new Railroad(200, 0,"Millennium Falcon"));
			board.add(new ColoredProperty(180, 14,  0, "Yavin 4", "Swamp"));
			board.add(new CommunityChest("Community Chest 2"));
			board.add(new ColoredProperty(180, 14,  0, "Yavin 4", "Swamp"));
			board.add(new ColoredProperty(200, 16,  0, "Yavin 4", "Swamp"));
			board.add(new FreeParking("Free Parking"));
			
			
			
			
			
			
		}

	}
