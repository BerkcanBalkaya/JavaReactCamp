package gameExample.business.abstracts;

import java.util.List;

import gameExample.entities.concretes.Discount;
import gameExample.entities.concretes.Game;

public interface DiscountService {
	void show(List<Discount> discounts);
	void add(Game game,List<Discount> discounts);
	void delete(Discount discount,List<Discount> discounts);
	void update(Discount newDiscount,Discount oldDiscount,List<Discount> discounts);
}
