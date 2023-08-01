package LogicalPrograms;

public class SwappingTwoNumwithoutThirdvar {

	public static void main(String[] args) {
		int a=10,b=20;//Exp - a=20,b=10
		
		System.out.println("Before swapping Values :"+a+" "+b);
		
		a=a+b; //30
		b=a-b;//30-20--10
		a=a-b;//30-10--20
		
		System.out.println("Before Swapping values :"+a+" "+b);
		

	}

}
