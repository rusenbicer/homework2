package login.business.abstracts;

import login.entities.concretes.User;

public interface UserVerificationService {

	boolean checkIfValidPerson(User user);
}
