package login.business.concretes;

import login.business.abstracts.UserVerificationService;
import login.entities.concretes.User;

public class UserVerificationManager implements UserVerificationService {



	@Override
	public boolean checkIfValidPerson(User user) {
		
		System.out.println("Bilgileriniz kontrol ediliyor.");
		
		return true;
	}

}
