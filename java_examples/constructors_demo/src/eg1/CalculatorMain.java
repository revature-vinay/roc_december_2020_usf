package eg1;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator c1=new Calculator("Kiran");
		
		Calculator c2=new Calculator(100);
		
		Calculator c3=new Calculator(199, 99);
		System.out.println("result of c3.add() : "+c3.add());
		
		System.out.println("result of c2.add() : "+c2.add());
		System.out.println("result of c1.add() : "+c1.add());
		System.out.println("result of c3.multiply() : "+c3.multiply());
		
	}

}
