package eg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(99,44,100,200,350,12, 233, 33, 11, 22, 33, 11, 33, 22, 45, 66, 77);
		
		List<Integer> lieven=new ArrayList<>();
		for(Integer i:li) {
			if(i%2==0) {
				lieven.add(i);
			}
		}
		System.out.println("Actual list li : "+li);
		System.out.println("Even list lieven : "+lieven);
		
		List<Integer> lievenStreams=li.stream().filter(i->(i%2==0)).distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Even List Streams : "+lievenStreams);
		
		

	}

}
