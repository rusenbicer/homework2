package Abstract;

import Entities.Player;

public interface PlayerService{

	void add(Player player) throws Throwable;
	void update(Player player) throws Throwable;
	void delete(Player player) throws Throwable;
}
