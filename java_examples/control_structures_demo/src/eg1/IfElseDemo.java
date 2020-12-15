package eg1;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int x=9;
		
		if(x==10) {
			System.out.println("Yes it is 10");
		}else {
			System.out.println("No it is not");
		}
		
		
		if(x==10 || x==9) {
			System.out.println("Yes it is either 10 or 9");
		}else {
			System.out.println("No its neither 10 or 9");
		}
		
		
		int score=5;
		if(score>=90) {
			System.out.println("Its top score");
		}else if(score<90 && score >=60) {
			System.out.println("First Class");
		}else if(score<60 && score>=50) {
			System.out.println("You can try and make it better");
		}else {
			System.out.println("Retry.......");
		}

	}

}
