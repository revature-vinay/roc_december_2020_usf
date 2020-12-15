package eg1;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int day=3;
		switch (day) {
		case 1:System.out.println("It's Monday");
			break;
		case 2:System.out.println("Its Tuesday");
			break;
		default:System.out.println("There is no matching day");
			break;
		}
		
		
		String s="vinay123";
		
		switch (s) {
		case "vinay":System.out.println("Yes its Vinay");
			
			break;

		default:System.out.println("No its someone else");
			break;
		}

	}

}
