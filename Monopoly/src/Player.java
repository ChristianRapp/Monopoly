import java.util.*;
public class Player
	{
		private String name;
		

		private int balance;
		private ArrayList<Property> properties = new ArrayList<Property>();
		private ArrayList<Card> hand = new ArrayList<Card>();
		private int turnNumber;
		private boolean inJail;
		private int location;
		private boolean backwards;
		private int turnInJail;
		
		public Player(String n)
		{
			name = n;
			balance = 1500;
			inJail = false;
			location = 0;
			backwards = false;
			turnInJail =0;
		}
		
		public void useCard()
		{
			//do card action
		}
		
		public void addHouses(Object player)
		{
			//check if monopoly
			//add house to one of properties
			//take money from player
		}
		
		public void trade(Object playerTrader, Object player2Trader)
		{
			//ask what to trade	
		}
		
		public int rollDice1()
		{
			int d1 = (int)(Math.random()*6)+1;
			
			return d1;
		}
		
		public int rollDice2()
			{
				int d2 = (int)(Math.random()*6)+1;
				
				return d2;
			}
		
		public void doTurn(Player player, int d1, int d2)
		{
			int temp = player.getLocation();
			if(player.isBackwards()==false)
				{
					if((temp + d1 + d2)>= 40)
						{
							player.setBalance(player.getBalance()+200);
							System.out.println("You passed go and gained 200");
						}
					int pos = (temp + d1 + d2)%40;
					player.setLocation(pos);
				}
			if(player.isBackwards()==true)
				{
					if((temp + d1 + d2)>= 40)
						{
							player.setBalance(player.getBalance()+200);
							System.out.println("You passed go and gained 200");
						}
					int pos = ((temp + d1 + d2)+40)%40;
					player.setLocation(pos);
				}
			
			
		}

		public boolean isBackwards()
			{
				return backwards;
			}

		public void setBackwards(boolean backwards)
			{
				this.backwards = backwards;
			}

		public int getBalance()
			{
				return balance;
			}

		public void setBalance(int balance)
			{
				this.balance = balance;
			}

		public ArrayList<Property> getProperties()
			{
				return properties;
			}

		public void setProperties(Property property, Player player)
			{
				properties.add((Property) Runner.board.get(player.getLocation()));
			}

		public ArrayList<Card> getHand()
			{
				return hand;
			}

		public void setHand(ArrayList<Card> hand)
			{
				this.hand = hand;
			}

		public int getTurnNumber()
			{
				return turnNumber;
			}

		public void setTurnNumber(int turnNumber)
			{
				this.turnNumber = turnNumber;
			}

		public boolean isInJail()
			{
				return inJail;
			}

		public void setInJail(boolean inJail)
			{
				this.inJail = inJail;
			}

		public int getLocation()
			{
				return location;
			}

		public void setLocation(int location)
			{
				this.location = location;
			}
		
		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getTurnInJail()
			{
				return turnInJail;
			}

		public void setTurnInJail(int turnInJail)
			{
				this.turnInJail = turnInJail;
			}
		
		
	}
