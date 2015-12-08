import java.util.*;

public class Runner
	{
		static Scanner userInput = new Scanner(System.in);
		static int playerCount;
		static ArrayList<Square> board = new ArrayList<Square>();
		static ArrayList<Player> players = new ArrayList<Player>();
		static boolean isPlaying =true;
		public static void main(String[] args)
			{
				mainMenu();
				addPlayers();
				while(isPlaying == true)
				{
					playGame();	
				}
				
				
				
			}
		
		public static void mainMenu()
		{
			System.out.println("Hello, welcome to monopoly");
			System.out.println("How many players would you like?");
			playerCount = userInput.nextInt();
			System.out.println(" Would you like to play (1)regular monopoly or (2)Star Wars?");
			int starWarsOrRegular = userInput.nextInt();
			switch(starWarsOrRegular)
			{
				case 1:
					{
					addProperty();
					}
				case 2: 
					{
					addStarWarsProperty();		
					}
			}
			
			
			
			
		}
		
		public static void playGame()
		{
				
				int d1 = players.get(0).rollDice1();
				int d2 = players.get(0).rollDice2();
				System.out.println("You rolled a "+ d1+" and a "+d2 + " for a total of "+(d1+d2));
				players.get(0).doTurn(players.get(0), d1, d2);
				System.out.println("You are now on " + board.get(players.get(0).getLocation()).getName());
				
				if(board.get(players.get(0).getLocation()) instanceof Tax)
					{
					Tax.payTax(((Tax) board.get(players.get(0).getLocation())).getTaxAmount(), players.get(0));
					System.out.println();
					}
				System.out.println();
				menu();
				
				
		}
		
		public static void menu()
		{
			printProperty();
			Scanner playerInput = new Scanner(System.in);
			System.out.println("What would you like to do?");
			int i =1;
			if(board.get(players.get(0).getLocation()) instanceof ColoredProperty && ((Property) board.get(players.get(0).getLocation())).isOwned() == false)
				
				{
				System.out.println(i+") Purchase this property for "+ ((Property) board.get(players.get(0).getLocation())).getBuyPrice());
				i++;
				}
			
			else if(board.get(players.get(0).getLocation()) instanceof NotColored && ((Property) board.get(players.get(0).getLocation())).isOwned() == false)
				{
				System.out.println(i+") Purchase this "+board.get(players.get(0).getLocation()).getName() +" for "+ ((Property) board.get(players.get(0).getLocation())).getBuyPrice());
				i++;
				}
			
			System.out.println(i+") Roll dice and move again");
			System.out.println("3) Print money");
			
			switch(playerInput.nextInt())
			{
				case 1:
				{
				if(board.get(players.get(0).getLocation()) instanceof Property && ((Property) board.get(players.get(0).getLocation())).isOwned() == false)
					{
					((Property) board.get(players.get(0).getLocation())).setOwner(players.get(0));
					((Property) board.get(players.get(0).getLocation())).setOwned(true);
					players.get(0).setBalance(players.get(0).getBalance()-((Property) board.get(players.get(0).getLocation())).getBuyPrice());
					players.get(0).setProperties((Property) board.get(players.get(0).getLocation()), players.get(0));
					menu();
					}
				else
					{
					playGame();
					}
				
				break;
				}
				case 2:
				{
					playGame();
				}
				case 3:
				{
					System.out.println(players.get(0).getBalance());
				}
				default:
				{
					menu();
				}
			}
			//printProperty();
				
			
			
			
		}
		
		public static void printProperty()
		{
			if(!(players.get(0).getProperties().size() == 0))
			{
				System.out.println("Here are "+players.get(0).getName()+ "'s properties");
				for(Property fred: players.get(0).getProperties())
					{
					System.out.print("|"+fred.getName()+"|");

					}
			}
			else
			{
				System.out.println(players.get(0).getName()+" has no properties");
			}
			System.out.println();
		}
		
		public static void addStarWarsProperty()
		{
			board.add(new Go());
			//Colored properties are buy price, rent, mortgage, color, name
			board.add(new ColoredProperty(60, 2,  0, "Dagobah", "Swamp"));
			board.add(new CommunityChest("Community Chest 1"));
			board.add(new ColoredProperty(60, 4,  0, "Dagobah", "Yoda's Hut"));
			
			board.add(new Tax("Docking tax", 25)); 
			board.add(new Railroad(200, 0,"Tie Fighter"));
			board.add(new ColoredProperty(100, 6,  0, "Hoth", "Echo Base"));
			board.add(new Chance("Chance 1"));
			board.add(new ColoredProperty(100, 6,  0, "Hoth", "North Bridge"));
			board.add(new ColoredProperty(120, 8,  0, "Hoth", "Frozen Plain"));
			
			board.add(new Jail("Jail"));
			board.add(new ColoredProperty(140, 10,  0, "Tatooine", "Lar's Homestead"));
			board.add(new Utility(150, 0, "Reactor Core"));
			board.add(new ColoredProperty(140, 10,  0, "Tatooine", "Mos Eisley"));
			board.add(new ColoredProperty(160, 12,  0, "Tatooine", "Jabba's Palace"));
			
			board.add(new Railroad(200, 0,"Millennium Falcon"));
			board.add(new ColoredProperty(180, 14,  0, "Yavin 4", "War Room"));
			board.add(new CommunityChest("Community Chest 2"));
			board.add(new ColoredProperty(180, 14,  0, "Yavin 4", "Massassi Temple"));
			board.add(new ColoredProperty(200, 16,  0, "Yavin 4", "Temple Throne Room"));
			
			board.add(new FreeParking("Free Parking"));
			board.add(new ColoredProperty(220, 18,  0, "Cloud City", "Landing Platform"));
			board.add(new CommunityChest("Community Chest 1"));
			board.add(new ColoredProperty(220, 18,  0, "Cloud City", "Carbon Freezing Chamber"));
			board.add(new ColoredProperty(240, 20,  0, "Cloud City", "Reactor Control Room"));
			
			board.add(new Railroad(200, 0,"X-Wing Fighter"));
			board.add(new ColoredProperty(260, 22,  0, "Death Star", "Landing Bay"));
			board.add(new ColoredProperty(260, 22,  0, "Death Star", "Throne Room"));
			board.add(new Utility(150, 0, "Moisture Farm"));
			board.add(new ColoredProperty(280, 22,  0, "Death Star", "Central Core"));
			
			board.add(new GoToJail("Go To Jail"));
			board.add(new ColoredProperty(300, 26,  0, "Endor", "Forest"));
			board.add(new ColoredProperty(300, 26,  0, "Endor", "Shield Generator"));
			board.add(new Chance("Chance 2"));
			board.add(new ColoredProperty(320, 28,  0, "Endor", "Ewok Village"));
			
			board.add(new Railroad(200, 0,"Star Destroyer"));
			board.add(new CommunityChest("Community Chest 1"));;
			board.add(new ColoredProperty(350, 35,  0, "Coruscant", "Monument Square"));
			board.add(new Tax("Bounty", 100));
			board.add(new ColoredProperty(400, 50,  0, "Coruscant", "Imperial Palace"));
				
		}
		
		public static void addProperty()
			{
				board.add(new Go());
				//Colored properties are buy price, rent, mortgage, color, name
				board.add(new ColoredProperty(60, 2,  0, "Brown", "Mediterranean Avenue"));
				board.add(new CommunityChest("Community Chest 1"));
				board.add(new ColoredProperty(60, 4,  0, "Brown", "Baltic Avenue"));
				
				board.add(new Tax("Income Tax", 200)); 
				board.add(new Railroad(200, 0,"Reading Railroad"));
				board.add(new ColoredProperty(100, 6,  0, "Light Blue", "Oriental Avenue"));
				board.add(new Chance("Chance 1"));
				board.add(new ColoredProperty(100, 6,  0, "Light Blue", "Vermont Avenue"));
				board.add(new ColoredProperty(120, 8,  0, "Light Blue", " Connecticut Avenue"));
				
				board.add(new Jail("Jail"));
				board.add(new ColoredProperty(140, 10,  0, "Purple", "St. Charles Place"));
				board.add(new Utility(150, 0, "Electrice Company"));
				board.add(new ColoredProperty(140, 10,  0, "Purple", "States Avenue"));
				board.add(new ColoredProperty(160, 12,  0, "Purple", "Virginia Avenue"));
				
				board.add(new Railroad(200, 0,"Pennsylvania Railroad"));
				board.add(new ColoredProperty(180, 14,  0, "Orange", "St. James Place"));
				board.add(new CommunityChest("Community Chest 2"));
				board.add(new ColoredProperty(180, 14,  0, "Orange", "Tennessee Avenue"));
				board.add(new ColoredProperty(200, 16,  0, "Orange", "New York Avenue"));
				
				board.add(new FreeParking("Free Parking"));
				board.add(new ColoredProperty(220, 18,  0, "Red", "Kentucky Avenue"));
				board.add(new Chance("Chance 2"));
				board.add(new ColoredProperty(220, 18,  0, "Red", "Indiana Avenue"));
				board.add(new ColoredProperty(240, 20,  0, "Red", "Illinois Avenue"));
				
				board.add(new Railroad(200, 0,"B&O Railroad"));
				board.add(new ColoredProperty(260, 22,  0, "Yellow", "Atlantic Avenue"));
				board.add(new ColoredProperty(260, 22,  0, "Yellow", "Ventnor Avenue"));
				board.add(new Utility(150, 0, "Water Works"));
				board.add(new ColoredProperty(280, 22,  0, "Yellow", "Marving Gardens"));
				
				board.add(new GoToJail("Go To Jail"));
				board.add(new ColoredProperty(300, 26,  0, "Green", "Pacific Avenue"));
				board.add(new ColoredProperty(300, 26,  0, "Green", "North Carolina Avenue"));
				board.add(new Chance("Chance 3"));
				board.add(new ColoredProperty(320, 28,  0, "Green", "Pennsylvania Avenue"));
				
				board.add(new Railroad(200, 0,"Short Line"));
				board.add(new CommunityChest("Community Chest 4"));;
				board.add(new ColoredProperty(350, 35,  0, "Blue", "Park Place"));
				board.add(new Tax("Luxury Tax", 100));
				board.add(new ColoredProperty(400, 50,  0, "Blue", "Boardwalk"));
					
			}
		
		public static void addPlayers()
		{
		
			players.add(new Player("Christian"));
			
		}

	}
