package eg1;

import java.util.Scanner;

public class Demo2ObjectRead {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e2=new Employee();
		System.out.println("Enter your name");
		String name="dummy";
		e2.setName(sc.nextLine());
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter contact");
		long contact=sc.nextLong(); //nextDouble nextFloat etc
		System.out.println("Enter gender(m/f/o)");
		char gender=sc.next().charAt(0);
		System.out.println("Hello "+name);
		System.out.println("Age : "+age);
		System.out.println("Contact : "+contact);
		System.out.println("Gender : "+gender);
		
		Employee e1=new Employee(name, contact, age, gender);
		System.out.println("Printing employee");
		System.out.println(e1);
		System.out.println(e1.toString());
		
		System.out.println("e2 = "+e2);

	}

}
