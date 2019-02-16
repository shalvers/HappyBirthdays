import java.util.Scanner;
import java.util.ArrayList;

public class PeopleObjectsTestDrive{
	public static void main(String [] args){
		
		ArrayList<PeopleObjects> listOfPeopleObjects = new ArrayList<PeopleObjects>();
		
		Scanner input = new Scanner(System.in);
		
		int userChoice = 0;
		
		System.out.println("Enter any number other than 1 to start program."+"\n");
		
			while ((userChoice = input.nextInt()) != 1){
				
				PeopleObjects people = new PeopleObjects();
				System.out.println("What is the name of the person?\n");
				people.setName(input.next());
				listOfPeopleObjects.add(people);
				System.out.println("Do you want to quit and see list? Enter 1 for yes and 0 for no");
			}
			
			for(int i=0; i < listOfPeopleObjects.size(); i++){
				
				if(listOfPeopleObjects.get(i).getName().equals("Joe")){
					System.out.println("Happy Birthday Joe! You are special!\n");
				}else if(i%2 == 0){
					System.out.println("Happy Birthday to "+listOfPeopleObjects.get(i).getName()+".\n");
				}else{
					System.out.println("Happy Birthday to "+listOfPeopleObjects.get(i).getName()+" too!!!\n");
					
				}//end if else 
			}//end for
	}
}