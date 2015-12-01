
public class Jail extends NotPurchasable
	{

		private int turnsInJail;
		
		private boolean isJustPassingBy;
		
		public Jail( String name)
		{
			
		}

		public int getTurnsInJail()
			{
				return turnsInJail;
			}

		public void setTurnsInJail(int turnsInJail)
			{
				this.turnsInJail = turnsInJail;
			}

		public boolean isJustPassingBy()
			{
				return isJustPassingBy;
			}

		public void setJustPassingBy(boolean isJustPassingBy)
			{
				this.isJustPassingBy = isJustPassingBy;
			}
		
	}
