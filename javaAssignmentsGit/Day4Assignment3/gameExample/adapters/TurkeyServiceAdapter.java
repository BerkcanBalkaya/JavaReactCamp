package gameExample.adapters;

import gameExample.business.abstracts.PlayerCheckService;
import gameExample.entities.concretes.Player;

public class TurkeyServiceAdapter implements PlayerCheckService{

	@Override
	public boolean turkeyIdentityController(Player player) {
		if (player.getIdentityNumber().charAt(0) == '1' ) {
			return true;
		}else {
			return false;
		}
		
	}

}
