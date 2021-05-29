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
				System.out.println("Bu mail daha �nce kullan�lm��t�r. "+user.getMail());
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
						System.out.println("Kay�t i�lemi tamamlanmam��t�r.");
					}
					
					System.out.println("**********************");
					
				}else {
					System.out.println("Sisteme ayn� kullan�c� ile yeni kay�t olamazs�n�z.");
				}

			} else {

				System.out.println("Kay�t i�leimi s�ras�nda bir hata olu�tu.");
			}

		}else {
			System.out.println("L�tfen bilgilerinizi eksizsiz doldurunuz...!");
		}
		
		emailList.add(user.getMail());

	}

	@Override
	public void login(String email, String password) {
		
		for(User user: userDao.getAll()) {
			
			if(user.getMail().equals(email) && user.getPassword().equals(password)) {
				System.out.println("Login ba�ar�l�");
			}else {
				System.out.println("Mail ya da password hatal�");
			}
			
		}
		
		
		
	}
	
	public boolean verificationMail() {
		
		System.out.println("L�tfen Mail adresinize gelen linke t�klay�n�z. (Y/N)");
		String secim = scanner.nextLine();
		
		if(secim.equals("Y")) {
				System.out.println("Do�rulama i�leminiz ba�ar�l� se�ilde tamamland�.");
				return true;
			}else if(secim.equals("N")) {
				System.out.println("Do�rulama i�leminiz ger�ekle�medi�i i�in kay�t i�lemi tamamlanmam��t�r.");
				return false;
			}else {
				System.out.println("Hatal� i�lem yapt�n�z.");
				return false;
			}
		
	}
	

}
