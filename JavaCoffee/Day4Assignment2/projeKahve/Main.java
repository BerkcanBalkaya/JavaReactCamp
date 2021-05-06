package projeKahve;
import java.util.Date;

import projeKahve.Abstract.*;
import projeKahve.Adapters.MernisServiceAdapters;
import projeKahve.Concrete.*;
import projeKahve.Entities.*;
public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		baseCustomerManager.save(new Customer(145,"Berkcan","Balkaya",1998,"4536324221"));
	}

}
