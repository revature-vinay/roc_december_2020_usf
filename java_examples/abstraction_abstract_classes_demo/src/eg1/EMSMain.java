package eg1;

public class EMSMain {

	public static void main(String[] args) {

		System.out.println("Accessing EMS via RevatureEMS");
		EMS revEms=new RevatureEMS();
		revEms.addEmployee();
		revEms.updateEmployee();
		revEms.commonEmployeeBenifits();
		revEms.calculateEmployeeLeaves();
		revEms.searchEmployee();
		revEms.removeEmployee();
		
		System.out.println("\n\nAccessing EMS via XyzEMS");
		EMS xyzEms=new XyzEMS();
		xyzEms.addEmployee();
		xyzEms.updateEmployee();
		xyzEms.commonEmployeeBenifits();
		xyzEms.calculateEmployeeLeaves();
		xyzEms.searchEmployee();
		xyzEms.removeEmployee();

	}

}
