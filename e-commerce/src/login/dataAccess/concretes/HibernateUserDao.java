package login.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import login.dataAccess.abstracts.UserDao;
import login.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Hibernate ile eklendi "+ user.getFirtsName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi "+ user.getFirtsName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi "+ user.getFirtsName());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		return  users;
	}

}
