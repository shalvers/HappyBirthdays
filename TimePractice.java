import java.time.*;


public class TimePractice{
	public static void main(String [] args){
		
		for (int i=2020; i<2100; i++){
			
			int birthYear = i;
			
			DayOfWeek birthDay = LocalDate.parse(birthYear+"-01-23").getDayOfWeek();
			
			if (birthDay.getValue() == 5 || birthDay.getValue() == 6 ){
				
				System.out.println(birthDay+" "+birthYear);
				
				i = 2100;
				
			}
			
		}
	}
}