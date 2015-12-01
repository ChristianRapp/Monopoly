
public class ColoredProperty extends Property
	{

		private String color;
		private int houses;
		private int numberOfSameColor;
		private boolean isMonopoly;
		
		public ColoredProperty( int bp, int r,int m, String c, String n )
		{
			name = n;
			buyPrice = bp;
			rent = r;
			mortgage = m;
			color = c;
			owner = null;
			isOwned = false;
			houses = 0;
			numberOfSameColor = 0;
			isMonopoly = false;
		}
		
		
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		public int getHouses()
			{
				return houses;
			}
		public void setHouses(int houses)
			{
				this.houses = houses;
			}
		public int getNumberOfSameColor()
			{
				return numberOfSameColor;
			}
		public void setNumberOfSameColor(int numberOfSameColor)
			{
				this.numberOfSameColor = numberOfSameColor;
			}
		public boolean isMonopoly()
			{
				return isMonopoly;
			}
		public void setMonopoly(boolean isMonopoly)
			{
				this.isMonopoly = isMonopoly;
			}
		
	}
