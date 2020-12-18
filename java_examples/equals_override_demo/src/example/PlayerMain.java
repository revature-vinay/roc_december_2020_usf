package example;

public class PlayerMain {

	public static void main(String[] args) {
	
		Player p1=new Player(100, "Sachin");
		System.out.println("p1 -> "+p1);
	
		Player p2=new Player(101, "Sachin");
		System.out.println("p2 -> "+p2);
		
		if(p1.equals(p2)) {
			System.out.println("both players are same");
		}else {
			System.out.println("both players are different");
		}

	}

}
