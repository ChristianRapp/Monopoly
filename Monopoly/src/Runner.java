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
			board.add(new ColoredProperty(60, 4,  0, "Dagobah", "Swamp"));
			
			board.add(new ColoredProperty(100, 6,  0, "Hoth", "Swamp"));
			board.add(new ColoredProperty(100, 6,  0, "Hoth", "Swamp"));
			board.add(new ColoredProperty(120, 8,  0, "Hoth", "Swamp"));
			
			board.add(new ColoredProperty(140, 10,  0, "Tatooine", "Swamp"));
			board.add(new ColoredProperty(140, 10,  0, "Tatooine", "Swamp"));
			board.add(new ColoredProperty(160, 12,  0, "Tatooine", "Swamp"));
			
			board.add(new ColoredProperty(180, 14,  0, "Yavin 4", "Swamp"));
			board.add(new ColoredProperty(180, 14,  0, "Yavin 4", "Swamp"));
			board.add(new ColoredProperty(200, 16,  0, "Yavin 4", "Swamp"));
			
			board.add(new ColoredProperty(220, 18,  0, "Cloud City", "Swamp"));
			board.add(new ColoredProperty(220, 18,  0, "Cloud City", "Swamp"));
			board.add(new ColoredProperty(240, 20,  0, "Cloud City", "Swamp"));
			
			
			
			
			
			
		}

	}
