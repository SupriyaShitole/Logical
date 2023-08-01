package LogicalPrograms;

import java.util.Scanner;

public class AcceptUserInput {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		
		Scanner Sc= new Scanner(System.in);
		
		int num=Sc.nextInt();
		
		System.out.println("Enter a second number");
		int num1=Sc.nextInt();
		
		System.out.println("Addition of two no is="+(num+num1));
		System.out.println("Substraction of two no is="+(num-num1));
		
		
	}

}
