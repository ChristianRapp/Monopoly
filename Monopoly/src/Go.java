
public class Go extends NotPurchasable
	{
		
		public Go()
		{
			
		}
		
		public void passGo(Player player, String name)
		{
			player.setBalance(player.getBalance()+200);
		}
		
	}
