import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		// Fill the code here
		System.out.println("Enter your TicketID: ");
		String ticketId = sc.nextLine();
		
		
		String firstfive= ticketId.substring(0, 5);
		
		if(!firstfive.matches("[^[A-Z]{5}$]")) {
			System.out.println("Invalid Input");
		}
		
		if(!ticketId.matches("[^[A-Z]{5}[0-9]{2}[A-Z]{1}[0-9]{2}]")) {
			System.out.println("Invalid Input");
		}
		

//		firstfive.matches("[^[A-Z]{5}$]");
		//"[^[A-Z]{5}[0-9]{2}[A-Z]{1}[0-9]{2}]"
		
		
	}
}
