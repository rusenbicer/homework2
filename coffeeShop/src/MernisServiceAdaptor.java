import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements ICustomerCheckService {
	

	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
			
		boolean result = false;
		
		try {
			  
			KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
			
			 result =  kpsPublic.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDate());
			 
			 return result;
			 
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
		
		
	}

}
