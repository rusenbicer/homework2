package login;

import login.business.abstracts.UserService;
import login.business.concretes.GoogleServiceAdaptor;
import login.business.concretes.UserManager;
import login.dataAccess.concretes.HibernateUserDao;
import login.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User rusen = new User("rusen", "bicer", "rusen@mail.com", "1234567");
		User burak = new User("burak", "ozen", "burak@mail.com", "7654321");
		User cem = new User("cem", "yeyim", "cem@outlook.com", "2635278");
		
		UserService userManager = new UserManager(new GoogleServiceAdaptor(), new HibernateUserDao());
		
		userManager.register(rusen);
		//userManager.register(burak);
		//userManager.register(cem);
		
		
		userManager.login("rusen@mail.com", "1234567");
		
		
	}

}
