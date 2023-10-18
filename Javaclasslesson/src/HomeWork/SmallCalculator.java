package HomeWork;

public class SmallCalculator {
  Calculator c = new Calculator();
  c.menu();
  
  public void menu() {
	  // start writing your code here
	  
	  System.out.println("1) add");
	  System.out.println("2) Subtract");
	  System.out.println("3) multplt");
	  System.out.println(")  divide");  
	  
	  System.out.println("Enter the operation:");
	  
	  int menu = scanner.nextInt();
	  
	  double n1 = input();
	  double n2 = input();
	  
	  Double answer = null;
	  
	  if (menu == 1) {
		  answer = sum(n1 , n2)
	  }
	  
	  
  }
}
