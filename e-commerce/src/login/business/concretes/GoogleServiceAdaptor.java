package login.business.concretes;

import login.business.abstracts.UserVerificationService;
import login.entities.concretes.User;

public class GoogleServiceAdaptor implements UserVerificationService{

	

	@Override
	public boolean checkIfValidPerson(User user) {
		
		System.out.println("Google servisinden yan�t al�n�yor");
		
		return true;
	}

}
