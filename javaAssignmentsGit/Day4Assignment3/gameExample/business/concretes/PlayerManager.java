package gameExample.business.concretes;

import java.util.List;

import gameExample.adapters.TurkeyServiceAdapter;
import gameExample.business.abstracts.PlayerService;
import gameExample.entities.concretes.Player;



public class PlayerManager implements PlayerService {
	TurkeyServiceAdapter turkeyServiceAdapter=new TurkeyServiceAdapter();
	
	@Override
	public void show(List<Player> players) {
		System.out.println("T�m oyuncular : ");
		for (Player player : players) {
			System.out.println(player.getFirstName());
		}
		
	}

	@Override
	public void add(Player player, List<Player> players) {
		if (turkeyServiceAdapter.turkeyIdentityController(player)) {
			players.add(player);
		} else {
			System.out.println(
					player.getFirstName() + player.getLastName()
					+" Bu bilgilere sahip bir oyuncu olu�turulamaz \n"
					+ "L�tfen do�ru bir tc kimlik numaras� girdi�inizden emin olun. \n");
		}
		
		
	}

	@Override
	public void delete(Player player, List<Player> players) {
		if (players.contains(player)) {
			players.remove(player);
		} else {
			System.out.println("B�yle bir oyuncu bulunmamaktad�r.");
		}
		
	}

	@Override
	public void update(Player newPlayer, Player oldPlayer, List<Player> players) {
		int index = players.indexOf(oldPlayer);
		players.set(index, newPlayer);
		System.out.println(players.get(index).getFirstName() + " �simli oyuncumuz g�ncellenmi�tir.");
		
	}
	

}
