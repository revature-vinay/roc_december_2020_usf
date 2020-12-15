package eg2;

public class Employee {

	private int id;
	private String name;
	private long contact;
	private String city;
	private int age;
	private String email;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, long contact, String city) {
		this(id, name); // constructor chaining which you can only chain 1 constructor and in first line
						// only
		this.contact = contact;
		this.city = city;
	}

	public Employee(int id, String name, long contact, String city, int age, String email) {
		this(id, name, contact, city);
		this.age = age;
		this.email = email;
	}

	public void printEmployee() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
		System.out.println("City : " + city);

	}
}
