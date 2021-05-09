package Concrete;

import Abstract.CampaignService;
import Abstract.SalesSevice;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SalesManager implements SalesSevice{

	private Campaign campaign ;

	public SalesManager(Campaign campaign) {
		this.campaign = campaign;
	}


	@Override
	public void buy(Player player, Game game) {
		
		System.out.println(game.getName() + " oyununun fiyatý " +game.getPrice() +" TL'dir.");
		System.out.println(player.getFirstName() +" isimli oyuncu "+ game.getName() + " oyununu");
		System.out.println(campaign.getName() +" % "+ campaign.getDiscountRate() +" indirim orani ile "+(game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100)) +" TL'ye almýþtýr." );
	}

	
	
}
