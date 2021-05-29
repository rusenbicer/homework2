package login.business.abstracts;

import login.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(String email, String password);
}
