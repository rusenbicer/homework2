import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		
		return true;
	
	}


	
}
