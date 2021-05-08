package gameExample.business.abstracts;

import java.util.List;

import gameExample.entities.concretes.Game;

public interface GameService {
	void add(Game game, List<Game> games);
	void delete(Game game, List<Game> games);
	void update(Game newGame,Game oldGame, List<Game> games);
	void show(List<Game> games);
}
