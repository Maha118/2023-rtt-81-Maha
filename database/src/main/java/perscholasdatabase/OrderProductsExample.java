package perscholasdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OrderProductsExample {
	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/classic_models";
		String user = "root";
		String password = "mahelet1975$";

		Connection connection = null;
		try {
			// Establish a database connection

			connection = DriverManager.getConnection(dburl, user, password);
			// Use a scanner to take input of an Order number
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Enter an Order number: ");
				int orderNumber = scanner.nextInt();

				// Prepare the SQL query to retrieve Order details
				String sql = "SELECT od.productCode, p.productName, od.quantityOrdered, p.msrp, p.buyPrice, "
						+ "(p.msrp - p.buyPrice) AS margin, (p.msrp - p.buyPrice) * od.quantityOrdered AS totalMargin "
						+ "FROM orderdetails od " + "JOIN products p ON od.productCode = p.productCode "
						+ "WHERE od.orderNumber = ?";

				// Create a prepared statement
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, orderNumber);

				// Execute the query
				ResultSet resultSet = preparedStatement.executeQuery();

				// Print the column headers
				System.out.printf("%-12s %-45s %-15s %-10s %-10s %-10s %-15s%n", "Product ID", "Product Name",
						"Quantity Ordered", "MSRP", "Buy Price", "Margin", "Total Margin");

				// Iterate through the results and print each row
				while (resultSet.next()) {
					String productCode = resultSet.getString("productCode");
					String productName = resultSet.getString("productName");
					int quantityOrdered = resultSet.getInt("quantityOrdered");
					double msrp = resultSet.getDouble("msrp");
					double buyPrice = resultSet.getDouble("buyPrice");
					double margin = resultSet.getDouble("margin");
					double totalMargin = resultSet.getDouble("totalMargin");

					System.out.printf("%-12s %-45s %-15s %-10.2f %-10.2f %-10.2f %-15.2f%n", productCode, productName,
							quantityOrdered, msrp, buyPrice, margin, totalMargin);
				}

				// Calculate and print the total margin for the entire Order
				double totalOrderMargin = 0.0;
				resultSet.beforeFirst(); // Reset the cursor for the result set
				while (resultSet.next()) {
					totalOrderMargin += resultSet.getDouble("totalMargin");
				}
				System.out.printf("Total Margin for the Entire Order: %.2f%n", totalOrderMargin);

				// Close resources
				resultSet.close();
				preparedStatement.close();
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
