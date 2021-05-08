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
			System.out.println("Böyle bir oyun bulunmamaktadýr.");
		}
		
	}

	@Override
	public void update(Game newGame, Game oldGame, List<Game> games) {
		int index = games.indexOf(oldGame);
		games.set(index, newGame);
		System.out.println(games.get(index).getTitle()+ " Oyununuz güncellenmiþtir");
	}

	@Override
	public void show(List<Game> games) {
		System.out.println("Tüm oyunlar :");
		for (Game game : games) {
			System.out.println(game.getTitle());
		} 
	}

}
