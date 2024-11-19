import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
    public static void main(String[] args) {
    	List<Dish> dList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    
       //Fill the code here
        System.out.println("Enter the number of dishes");
        int num =sc.nextInt();
        System.out.println("Enter the dish details");
        String st = sc.nextLine();
        
        for(int i=0;i<num;i++) {
            String st1 = sc.nextLine();
        	String splits[] =st1.split(":");
        	String dishName = splits[0];
        	String cuisine = splits[1];
        	double price = Double.parseDouble( splits[2]);
        	double rating = Double.parseDouble( splits[3]);
        	Dish di = new Dish(dishName,  cuisine,  price,  rating);
        	dList.add(di);
//        	Stream<String> dList = new <String> ();
//        	cusine n = new cusine();
//        	List <cusine> n  = n.getDishesByCusine(dList.stream(),sr);
        	
        }
        
//        List<Dish> l=
        
    }
}
