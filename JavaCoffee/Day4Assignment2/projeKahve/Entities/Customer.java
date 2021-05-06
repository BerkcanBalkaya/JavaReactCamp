package projeKahve.Entities;

import java.util.Date;

import projeKahve.Abstract.*;


public class Customer implements ICustomerService,IEntity {
	//C# da deðiþken isimleri büyük harfle baþlar.
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public String NationalityId;
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}
}
