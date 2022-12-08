import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter message type");
		                     
		
		int check = 0;
		do
		{
			String message = sc.nextLine();
			check = 0;
			switch(message)
			{
			case "A":
				System.out.println(Priority.HIGH);
				break;
			case "B":
				System.out.println(Priority.MEDIUM);
				break;
			case "C":
			case "D":
				System.out.println(Priority.LOW);
				break;
			default:
				check = 1;
				System.out.println("Enter the message again");
			}
		} while (check == 1);
	}

}
