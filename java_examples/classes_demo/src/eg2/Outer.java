package eg2;

public class Outer {

	public void outerMethod() {
		InnerPrivate i = new InnerPrivate();
		i.helloInnerPrivate();
	}

	private class InnerPrivate {
		public void helloInnerPrivate() {
			System.out.println("Heyy hello from helloInnerPrivate()");
		}
	}

	public class InnerPublic {
		public void helloInnerPublic() {
			System.out.println("Heyy hello from helloInnerPublic()");
		}
	}

	public static class InnerPublicStatic {
		public void helloInnerPublicNonStatic() {
			System.out.println("Heyy hello from helloInnerPublicNonStatic()");
		}

		public static void helloInnerPublicStatic() {
			System.out.println("Heyy hello from helloInnerPublicStatic()");
		}
	}
}
/*
 * ->In Java Inner classes can be private static protected and public as well.
 * ->If it is a non static inner class then it can have only non static methods in it and you need to create the object of outer class to access inner class and its methods.
 * ->If it is a static class then a static class can have both static as well as non static methods, so to access static methods as usual you dont need any object and to
 * access non static methods of a static inner class you need object of only static inner class not of the outer class.
 * ->Outer classes in java cannot be static, cannot be private or protected it should and must be public and the file name and the class name should and must be same.
 */
