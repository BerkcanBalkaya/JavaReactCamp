package projeKahve.Concrete;

import java.rmi.RemoteException;

import projeKahve.Abstract.*;
import projeKahve.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}
