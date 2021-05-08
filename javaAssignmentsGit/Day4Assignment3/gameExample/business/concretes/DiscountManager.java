package gameExample.business.concretes;

import java.util.List;

import gameExample.business.abstracts.DiscountService;
import gameExample.entities.concretes.Discount;
import gameExample.entities.concretes.Game;

public class DiscountManager implements DiscountService{

	@Override
	public void add(Game game,List<Discount> discounts) {
		
		discounts.add(new Discount(game.getId(),game.getTitle(),(game.getPrice()/100)*80));
		
	}

	@Override
	public void delete(Discount discount,List<Discount> discounts) {
		if (discounts.contains(discount)) {
			discounts.remove(discount);
		}else {
			System.out.println("Böyle bir indirim bulunmamaktadýr.");
		}

		
	}

	@Override
	public void update(Discount newDiscount,Discount oldDiscount,List<Discount> discounts) {
		int index = discounts.indexOf(oldDiscount);
		discounts.set(index,newDiscount);
		System.out.println(discounts.get(index).getTitle() +" Ýndiriminiz güncellenmiþtir.");
		
	}

	@Override
	public void show(List<Discount> discounts) {
		System.out.println("Ýndirimli oyunlar :");
		for (Discount discount : discounts) {
			System.out.println(discount.getTitle());
		} 
		
	}

}
