
public class Go extends NotPurchasable
	{
		
		public Go()
		{
			
		}
		
		public void passGo(Player player)
		{
			player.setBalance(player.getBalance()+200);
		}
		
	}
