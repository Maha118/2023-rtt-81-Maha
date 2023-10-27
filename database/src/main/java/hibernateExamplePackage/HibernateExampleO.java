package hibernateExamplePackage;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.entity.Customer;

public class HibernateExampleO {

	 

	public static void main(String[] args) {

		

	 CustomerDAO customerDao = new CustomerDAO();

		

		Customer customer = customerDao.findById(103);

		

		System.out.println( customer.getId() + " | " + customer.getCustomerName() );

			

	}
}









//public class hibernateExampleO {
//	public static void main(String[] args) {
//		OrderDAO customerDao = new OrderDAO();
//
//		Order Customer = customerDao.findById(103);
//
//		System.out.println(Customer.getId() + " | " + Customer.getCustomerNumber());
//		
//		
//		List<Customer> customers = customerDao.findByFirstName("Leslie");
//		for ( Customer c : customers ) {
//			System.out.println(c.getId() + " | " + c.getCustomerName() + " | " + c.getContactFirstname() + " | " + c.getContactLastname());
//		}
//		
//	}
//
//}
