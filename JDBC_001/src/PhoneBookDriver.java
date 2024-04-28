import java.util.Scanner;
public class PhoneBookDriver {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("1 for save the contact");
		System.out.println("2 for delete the contact");
		System.out.println("enter your choice");
		char c = sc.next().charAt(0) ;
		sc.nextLine() ;
		
		switch(c) {
			case '1':{
				System.out.println("enter the name");
				String name = sc.nextLine() ;
				System.out.println("enter the phone number");
				long phone = sc.nextLong() ;
				sc.nextLine() ;
				System.out.println("enter the city name");
				String city = sc.nextLine() ;
				
				boolean res = PhoneBookCRUD.saveContact(name, phone, city) ;
				if(res) {
					System.out.println("data saved successfully");
				}else {
					System.out.println("something went wrong!!!");
				}
			}break; 
			case '2':{
				System.out.print("enter the slno");
				int slno = sc.nextInt() ;
				int res = PhoneBookCRUD.deleteContact(slno) ;
				if(res==1) {
					System.out.println("data deleted successfully");
				}else {
					System.out.println("something went wrong");
				}
				
				
				
			}break;
		}
		
	}
}