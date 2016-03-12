import java.util.Scanner;

public class Bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge;
		
		Scanner  in = new Scanner (System.in);
		System.out.println("Whats Your Age?");
		myAge = in.nextInt();
		
		if (myAge < 21){
			
			System.out.println(21-myAge);
			System.out.println("more years and you'll be a legal Drinker!!! ");
			
		}
		else {
			System.out.println("Lets Party Like theres no Tomorrow!!!");
			
		}
		in.close();
		

		
	}

}
