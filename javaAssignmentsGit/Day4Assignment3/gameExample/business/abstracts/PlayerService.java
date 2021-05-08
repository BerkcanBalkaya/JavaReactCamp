package gameExample.business.abstracts;

import java.util.List;

import gameExample.entities.concretes.Player;


public interface PlayerService {
	void show(List<Player> players);
	void add (Player player,List<Player> players);
	void delete (Player player, List<Player> players);
	void update (Player newPlayer, Player oldPlayer, List<Player> players);

}
