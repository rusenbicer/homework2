package Concrete;

import java.rmi.RemoteException;


import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		boolean result = false;
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		try {
			result = kpsPublic.TCKimlikNoDogrula(player.getNationalId(), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getDate());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
