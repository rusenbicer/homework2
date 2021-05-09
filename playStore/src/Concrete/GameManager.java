package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.getName() + " sisteme y�klendi.");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getName() + " sistemden silindi.");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getName() + " g�ncellendi. ");
		
	}

}
