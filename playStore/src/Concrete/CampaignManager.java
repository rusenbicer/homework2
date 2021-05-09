package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println(campaign.getName()+ " �ndirim oran�  % "+campaign.getDiscountRate());
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println("Kampanya silinmi�tir : "+campaign.getName());
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println("Kampanya g�ncellenmi�tir : "+campaign.getName()+ "yeni indirim oran� : "+campaign.getDiscountRate());
		
	}



}
