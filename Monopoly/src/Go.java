
public class Go extends NotPurchasable
	{
		
		public Go()
		{
			name = "Go";
		}
		
		public void passGo(Player player, String n)
		{
			player.setBalance(player.getBalance()+200);
			
		}
		
	}
