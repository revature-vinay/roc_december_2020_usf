package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		int ar[]= {12,33,11,2,344,11,12};
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"] -> "+ar[i]);
		}
		
		System.out.println("\n\nar[0] = "+ar[0]);
		
		//System.out.println(ar[-9]);
		System.out.println("size of array = "+ar.length);
		
		
		int ar1[]=new int[10];
		System.out.println("Printing contents of ar1");
		for(int x:ar1) {
			System.out.print(x+" ");
		}
		System.out.println();
		ar1[0]=22;
		ar1[1]=21;
		ar1[2]=32;
		ar1[3]=43;
		ar1[4]=45;
		int n=5;
		System.out.println("Printing contents of ar1 before insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		int pos=5;
		int ele=999;
		for(int i=n;i>=pos;i--) {
			ar1[i]=ar1[i-1];
		}
		ar1[pos-1]=ele;
		n++;
		System.out.println("Printing contents of ar1 before insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		int delpos=4;
		for (int i = delpos-1; i < n; i++) {
			ar1[i]=ar1[i+1];
		}
		n--;
		System.out.println("\nPrinting contents of ar1 after deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		//ar[0]=24;
	}

}
