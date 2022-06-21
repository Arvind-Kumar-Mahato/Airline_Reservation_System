import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRunner {

	private static List<Customer> customers = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer(1, "A","B","C","D",10,"A","B");
		Customer c2 = new Customer(2, "arvind@gmail.com", "Arvind", "1234567891", "Dhanbad",24, "Male","I123" );
		c1.addNewCustomer();
		
		
		c2.deleteCustomer(1);
		
		c1.printCustomer();
		c1.searchUser(1);
		 c2.emailUnique("arvind@gmail.com");
		
		
		
		

	}

	

}
