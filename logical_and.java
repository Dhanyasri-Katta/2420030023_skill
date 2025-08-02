package My_project;
import java.util.*;

public class logical_and {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Theory marks: ");
		int theory=sc.nextInt();
		System.out.println("Practical marks: ");
		int practical=sc.nextInt();
		int Theorypassmarks=40;
		int Practicalpassmarks=40;
		/*boolean Theorypassed=theory>=Theorypassmarks;
		boolean practicalpassed=practical>=Practicalpassmarks;*/
		if(theory>=Theorypassmarks && practical>=Practicalpassmarks) {
			System.out.println("Passed both theory and practical exam");
		}
		else {
			System.out.println("Not passed");
		}
		
	}

}
