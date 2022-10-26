package password;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class password {
	public static void main(String[] args) {
		
		String answerclient = null;
		Scanner in = new Scanner(System.in);
		
		System.out.println("How long the password should be?");
		
		int answer = in.nextInt();
		List<String> password;
		int count = 0;
		
		do {
			System.out.println("Generating new password ... \n \n \n");
			password= new ArrayList<>();
			String temppassword = "";
			
		for(int i = 0; i < answer; i++){
			
			int character = (int)(Math.random()* 93 + 33);
			char ch = (char)character;
			System.out.print(ch);
			temppassword = temppassword + ch;
			
		}
		System.out.print("Generate another pasword? (Y/N)\n");
		answerclient = in.next();
		password.add(temppassword);
		count++;
		
		}while (answerclient.equalsIgnoreCase("Y"));
			for (int j = 0; j < password.size(); j++) {
				if (password.get(j) != null && !password.get(j).isEmpty())
					System.out.print("your " + j + " new passowrd is: "  +password.get(j) + "\n");
			}
	}
}
		
			
		
		
		
		
		
		
	
	

	

		  
		
		
		
	
	


		
	
