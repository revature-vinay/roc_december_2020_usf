package eg2;

//Linear Search
public class DemoSearch {

	public static void main(String[] args) {
		int ar[]= {12,33,11,2,344,11,12,11,22,11,11,23,11,44,11,22,11};
		boolean b=false;
		int searchElement=2;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==searchElement) {
				b=true;
				break;
			}
		}
		if(b) {
			System.out.println(searchElement+" found");
		}else {
			System.out.println(searchElement+" not found");
		}
		
		b=false;
		
		searchElement=12;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==searchElement) {
				b=true;
				//break;
				System.out.println(searchElement+" found at position "+(i+1));
			}
		}
		if(!b) {
			System.out.println(searchElement+" not found");
		}
		

	}

}
