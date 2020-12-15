package eg1;

public class Calculator {

	//Calculator(){}
	
	public Calculator(String name) {
		System.out.println("Hello "+name);
	}
	
	public Calculator(int x) {
		System.out.println("x = "+x);
	}
	
	int a;
	int b;
	
	public Calculator(int a,int b) {
	this.a=a; //variable shadowing
	this.b=b;
	}
	
	public int add() {
		return a+b;
	}
	
	public int multiply() {
		return a*b;
	}
	
}
