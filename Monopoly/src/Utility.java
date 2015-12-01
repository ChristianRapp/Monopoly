
public class Utility extends NotColored
	{
		
		public Utility(int bp, int m, String n)
			{
				name = n;
				buyPrice = bp;
				rent = 0;
				mortgage = m;
				owner = null;
				isOwned = false;
				sameKindOwned = 0;
				
			}
			
		
		public int calculateRent(int diceRoll)
		{
			return diceRoll* 10;
		}
		
		
	}
