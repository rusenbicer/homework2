import Abstract.CampaignService;
import Abstract.GameService;
import Abstract.PlayerService;
import Abstract.SalesSevice;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MernisServiceAdaptor;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		
		Campaign bayramKampanyasi = new Campaign(1, "Bayram Kampanyasý", 20);
		Player player = new Player(1, "Ruþen", "Biçer", 1990, 12345678987L);
		Game game = new Game(1, "Call of Duty", 200);
		
		CampaignService campaingManager = new CampaignManager();
		PlayerService playerManager = new PlayerManager(new MernisServiceAdaptor());
		GameService gameManager = new GameManager();
		
		try {
			gameManager.addGame(game);
			campaingManager.campaignAdd(bayramKampanyasi);
			playerManager.add(player);
			SalesSevice salesManager = new SalesManager(bayramKampanyasi);
			salesManager.buy(player, game);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
