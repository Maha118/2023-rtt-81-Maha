package hibernateExamplePackage;

import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Product;





public class HibernateExampleP {
	public static void main(String[] args) {
	     SessionFactory factory = new Configuration().configure().buildSessionFactory();
	        Session session = factory.openSession();
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the Product ID: ");
	        int productId = scanner.nextInt();
	        String hql = "FROM Product p WHERE p.id = :id";
	        TypedQuery<Product> query = session.createQuery(hql, Product.class);
	        query.setParameter("id", productId);
	        Product result;
	        try {
	            result = query.getSingleResult();
	            System.out.println("Product ID: " + result.getId());
	            System.out.println("Product Code: " + result.getProductCode());
	            System.out.println("Product Name: " + result.getProductCode());
	            System.out.println("Product Line ID: " + result.getProductCode());
	            System.out.println("Product Scale: " + result.getProductCode());
	            System.out.println("Product Vendor: " + result.getProductCode());
	            
	        } catch (javax.persistence.NoResultException e) {
	            System.out.println("No Product found with the specified ID.");
	        } finally {
	            session.close();
	            factory.close();
	        }
	}







}
