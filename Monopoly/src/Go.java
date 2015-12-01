
public class Go extends NotPurchasable
	{
		
		public Go()
		{
			
		}
		
		public void passGo(Player player, String n)
		{
			player.setBalance(player.getBalance()+200);
			name = n;
		}
		
	}
