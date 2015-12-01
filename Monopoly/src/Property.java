
public class Property extends Square
	{
		protected int buyPrice;
		protected int rent;
		protected Player owner;
		protected boolean isOwned;
		protected int mortgage;
		protected int location;
		
		public int mortgageProperty()
		{
			//add mortgage to owner
			return 0;
		}
		
		public void bePurchased(Player owner, Property p)
		{
			p.setOwner(owner);
			owner.setBalance(owner.getBalance()-p.getBuyPrice());
			System.out.println();
		}
		
		public void payRent(Object player)
		{
			
			//player balance -=rent;
			
		}

		
		public int getBuyPrice()
			{
				return buyPrice;
			}

		public void setBuyPrice(int buyPrice)
			{
				this.buyPrice = buyPrice;
			}

		public int getRent()
			{
				return rent;
			}

		public void setRent(int rent)
			{
				this.rent = rent;
			}

		public Player getOwner()
			{
				return owner;
			}

		public void setOwner(Player owner)
			{
				this.owner = owner;
			}

		public boolean isOwned()
			{
				return isOwned;
			}

		public void setOwned(boolean isOwned)
			{
				this.isOwned = isOwned;
			}

		public int getMortgage()
			{
				return mortgage;
			}

		public void setMortgage(int mortgage)
			{
				this.mortgage = mortgage;
			}
		
		
	}
