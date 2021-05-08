package gameExample;

import java.util.ArrayList;

import gameExample.business.concretes.DiscountManager;
import gameExample.business.concretes.GameManager;
import gameExample.business.concretes.PlayerManager;
import gameExample.entities.concretes.Discount;
import gameExample.entities.concretes.Game;
import gameExample.entities.concretes.Player;

public class Main {

	public static void main(String[] args) {
		ArrayList <Player> players = new ArrayList<Player>();
		ArrayList <Game> games = new ArrayList<Game>();
		ArrayList <Discount> discounts = new ArrayList<Discount>();
		PlayerManager playerManager = new PlayerManager();
		GameManager gameManager = new GameManager();
		DiscountManager discountManager = new DiscountManager();
		Player[] addPlayer = {
				new Player("123562212","Berkcan","Balkaya",1999),
				new Player("152315425","Ebu","Yazýcý",1999),
				new Player("252315425","Salih","Degirmenci",1999)
				};
		
		for (Player player : addPlayer) {
			playerManager.add(player, players);
		}
		playerManager.show(players);
		
		Game[] addGame = {
				new Game(1,"Apex",10f),	
				new Game(2,"Valorant",20f)	
				};
		
		for (Game game : addGame) {
			gameManager.add(game, games);
		}
		gameManager.show(games);
	}

}
