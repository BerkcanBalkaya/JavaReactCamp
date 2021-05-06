package projeKahve.Abstract;
import projeKahve.Entities.*;

public abstract class BaseCustomerManager implements ICustomerService{
	public void save(Customer customer) {
		System.out.println("Saved to db"+ customer.firstName);
	}
}
