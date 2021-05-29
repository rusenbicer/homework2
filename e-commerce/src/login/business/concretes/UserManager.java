package login.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import login.business.abstracts.UserService;
import login.business.abstracts.UserVerificationService;
import login.core.Validate;
import login.dataAccess.abstracts.UserDao;
import login.entities.concretes.User;

public class UserManager implements UserService {

	private UserVerificationService userVerificationService;
	private UserDao userDao;
	private List<String> emailList = new ArrayList<String>();
	private Scanner scanner = new Scanner(System.in);
	
	
	public UserManager(UserVerificationService userVerificationService, UserDao userDao) {
		this.userVerificationService = userVerificationService;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		
		
		
		for (String mail : emailList) {
			if (mail.equals(user.getMail())) {
				System.out.println("Bu mail daha önce kullanýlmýþtýr. "+user.getMail());
				return;
			}
		}

		if (user.getPassword().length() > 6 
				&& user.getFirtsName().length() > 2
				&& user.getLastName().length() > 2
				&& !user.getFirtsName().equals("")
				&& !user.getLastName().equals("")) {

			if (Validate.validateMail(user.getMail())) {

				if (userVerificationService.checkIfValidPerson(user)) {
					
					if(verificationMail()) {
						userDao.add(user);	
					}else {
						System.out.println("Kayýt iþlemi tamamlanmamýþtýr.");
					}
					
					System.out.println("**********************");
					
				}else {
					System.out.println("Sisteme ayný kullanýcý ile yeni kayýt olamazsýnýz.");
				}

			} else {

				System.out.println("Kayýt iþleimi sýrasýnda bir hata oluþtu.");
			}

		}else {
			System.out.println("Lütfen bilgilerinizi eksizsiz doldurunuz...!");
		}
		
		emailList.add(user.getMail());

	}

	@Override
	public void login(String email, String password) {
		
		for(User user: userDao.getAll()) {
			
			if(user.getMail().equals(email) && user.getPassword().equals(password)) {
				System.out.println("Login baþarýlý");
			}else {
				System.out.println("Mail ya da password hatalý");
			}
			
		}
		
		
		
	}
	
	public boolean verificationMail() {
		
		System.out.println("Lütfen Mail adresinize gelen linke týklayýnýz. (Y/N)");
		String secim = scanner.nextLine();
		
		if(secim.equals("Y")) {
				System.out.println("Doðrulama iþleminiz baþarýlý seçilde tamamlandý.");
				return true;
			}else if(secim.equals("N")) {
				System.out.println("Doðrulama iþleminiz gerçekleþmediði için kayýt iþlemi tamamlanmamýþtýr.");
				return false;
			}else {
				System.out.println("Hatalý iþlem yaptýnýz.");
				return false;
			}
		
	}
	

}
