package gameExample.business.concretes;

import java.util.List;

import gameExample.business.abstracts.GameService;
import gameExample.entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game, List<Game> games) {
		games.add(game);
		
	}

	@Override
	public void delete(Game game, List<Game> games) {
		if (games.contains(game)) {
			games.remove(game);
		}else {
			System.out.println("B�yle bir oyun bulunmamaktad�r.");
		}
		
	}

	@Override
	public void update(Game newGame, Game oldGame, List<Game> games) {
		int index = games.indexOf(oldGame);
		games.set(index, newGame);
		System.out.println(games.get(index).getTitle()+ " Oyununuz g�ncellenmi�tir");
	}

	@Override
	public void show(List<Game> games) {
		System.out.println("T�m oyunlar :");
		for (Game game : games) {
			System.out.println(game.getTitle());
		} 
	}

}
