import java.util.ArrayList;
import java.util.Scanner;


public class HappyBirthdaysFinal{
	public static void main(String [] args){
		ArrayList<String> names = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		int userChoice = 0;
		
		System.out.println("Enter any number other than 1 to start program."+"\n");
		
		while ((userChoice = input.nextInt()) != 1){
			System.out.println("Enter names");
			names.add(input.next());
			System.out.println("Do you want to quit and save list? Enter 1 for yes and 0 for no");
		}
		
		for(int i=0; i < names.size(); i++){
			if(names.get(i).equals("Joe")){
				System.out.println("Happy Birthday Joe! You are special!\n");
			}else if(i%2 == 0){
				System.out.println("Happy Birthday to "+names.get(i)+".\n");
			}else{
				System.out.println("Happy Birthday to "+names.get(i)+" too!!!\n");
			}//end if else
		}//end for
	}//end main	
}//end class