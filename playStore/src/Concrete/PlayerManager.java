package Concrete;


import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	private PlayerCheckService PlayerCheckService;
	
	
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		PlayerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) throws Throwable {
		if(PlayerCheckService.checkIfRealPerson(player)) {
			System.out.println("Yeni oyuncu eklendi : "+player.getFirstName());
		}else {
			throw new Exception("Not a valid person");
		}
		
	}

	@Override
	public void update(Player player) throws Throwable {
		if(PlayerCheckService.checkIfRealPerson(player)) {
			System.out.println("Oyuncu kaydý güncellendi : "+player.getFirstName());
		}else {
			throw new Exception("Not a valid person");
		}
		
	}

	@Override
	public void delete(Player player) throws Throwable {
		if(PlayerCheckService.checkIfRealPerson(player)) {
			System.out.println("Oyuncu kaydý silindi. "+player.getFirstName());
		}else {
			throw new Exception("Not a valid person");
		}
	}

}
