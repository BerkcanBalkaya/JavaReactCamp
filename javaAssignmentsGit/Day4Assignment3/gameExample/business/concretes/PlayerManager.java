package gameExample.business.concretes;

import java.util.List;

import gameExample.adapters.TurkeyServiceAdapter;
import gameExample.business.abstracts.PlayerService;
import gameExample.entities.concretes.Player;



public class PlayerManager implements PlayerService {
	TurkeyServiceAdapter turkeyServiceAdapter=new TurkeyServiceAdapter();
	
	@Override
	public void show(List<Player> players) {
		System.out.println("Tüm oyuncular : ");
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
					+" Bu bilgilere sahip bir oyuncu oluþturulamaz \n"
					+ "Lütfen doðru bir tc kimlik numarasý girdiðinizden emin olun. \n");
		}
		
		
	}

	@Override
	public void delete(Player player, List<Player> players) {
		if (players.contains(player)) {
			players.remove(player);
		} else {
			System.out.println("Böyle bir oyuncu bulunmamaktadýr.");
		}
		
	}

	@Override
	public void update(Player newPlayer, Player oldPlayer, List<Player> players) {
		int index = players.indexOf(oldPlayer);
		players.set(index, newPlayer);
		System.out.println(players.get(index).getFirstName() + " Ýsimli oyuncumuz güncellenmiþtir.");
		
	}
	

}
