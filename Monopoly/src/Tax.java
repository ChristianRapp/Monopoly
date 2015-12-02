
public class Tax extends NotPurchasable
	{
		private int taxAmount;
		
		public Tax(String n, int t)
		{
		name = n;	
		taxAmount = t;
		}
		
		public static void payTax(int taxAmount, Player player)
		{
			
			player.setBalance(player.getBalance()-taxAmount);
			
		}

		public int getTaxAmount()
			{
				return taxAmount;
			}

		public void setTaxAmount(int taxAmount)
			{
				this.taxAmount = taxAmount;
			}
		
		
	}
