package org.perscholas.database.dao;

import org.perscholas.database.entity.Customer;
import org.perscholas.database.dao.CustomerDAO;



public class CreateandUpdateExample {

	private CustomerDAO customerDao = new CustomerDAO();
	
	public void insertCustomerExample() {
		Customer c = new Customer();
		
		c.setCustomerName("Series Reminder LLC");
		c.setContactFirstname("Eric");
		c.setContactLastname("Heiling");
		c.setAddressLine1("Address line 1");
		c.setAddressLine2("Address line 2");
		c.setCity("City");
		c.setState("Denver");
		c.setPostalCode("80203");
		c.setCountry("USA");
		c.setCreditLimit(1000);
		
				
		 System.out.println("Customer id before save " + c.getId());
			
		 customerDao.save(c);
		 System.out.println("Customer id after save " + c.getId());
	 }
	
	 public void updateCustomerExample() {
		 Customer c = customerDao.findById(533);
		 System.out.println("Customer Name: " + c.getCustomerName());
		
		 c.setContactFirstname("Update Firstname");
		 c.setContactLastname("Update Lasttname");
		 c.setCreditLimit(44444.44);
		
		 customerDao.save(c);
	 }
	public static void main(String[] args) {
	CreateandUpdateExample cause = new CreateandUpdateExample();
	//cause.insertCustomerExample();
    cause.updateCustomerExample();
	}
	
		
	}

