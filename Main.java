import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] answers = s.nextLine().toCharArray();
		int i = 0;
		for(i = 0; i < answers.length;) {
			if(s.nextLine().toCharArray()[0] == answers[i]) {
				System.out.println("correct");
				i++;
			}
			else{
				System.out.println("incorrect, the answer is: "+answers[i]);
				i++;
			}
	
		}
		System.out.println("Complete");
		
	}

}
