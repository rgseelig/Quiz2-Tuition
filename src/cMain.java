import java.util.Scanner;
public class cMain {
	public static void main(String[] args){	
		Scanner reader = new Scanner (System.in);
		
		System.out.println("What is your tuition cost per school year?");
		float tuition = reader.nextFloat();
		
		System.out.println("What is your percentage increase of tuition per school year? (enter as decimal)");
		float pctincrease = reader.nextFloat();

		for (int i = 0; i <=3; i++){
				tuition += tuition * pctincrease;
			}
		
		System.out.println("Your total tuition cost is $"+tuition+".");
		
		
	
	}
	

}
