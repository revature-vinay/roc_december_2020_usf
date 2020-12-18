package eg1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<>();
		hm.put(100, "Java");//insert
		hm.put(100, "openjdk"); //update
		hm.put(199, "Java");
		hm.put(300, "Java");
		hm.put(900, null);
		hm.put(1000, null);
		hm.put(22, "Java");
		hm.put(null, "driver");
		hm.put(45, null);
		hm.put(800, "Jee");
		hm.put(500, "Jse");
		hm.put(400, "Jee");
		System.out.println("hm = "+hm);
		
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(100, "Java");//insert
		lhm.put(100, "openjdk"); //update
		lhm.put(199, "Java");
		lhm.put(300, "Java");
		lhm.put(900, null);
		lhm.put(1000, null);
		lhm.put(22, "Java");
		lhm.put(null, "driver");
		lhm.put(45, null);
		lhm.put(800, "Jee");
		lhm.put(500, "Jse");
		lhm.put(400, "Jee");
		System.out.println("lhm = "+lhm);
		
		//Map<Integer, String> tm=new TreeMap<>();  //ascending
		Map<Integer, String> tm=new TreeMap<>(Collections.reverseOrder());
		tm.put(100, "Java");//insert
		tm.put(100, "openjdk"); //update
		tm.put(199, "Java");
		tm.put(300, "Java");
		tm.put(900, null);
		tm.put(1000, null);
		tm.put(22, "Java");
		//tm.put(null, "driver");
		tm.put(45, null);
		tm.put(800, "Jee");
		tm.put(500, "Jse");
		tm.put(400, "Jee");
		System.out.println("tm = "+tm);
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(100, "Java");//insert
		ht.put(100, "openjdk"); //update
		ht.put(199, "Java");
		ht.put(31212, "Java");
	//	ht.put(900, null);
	//	ht.put(1000, null);
		ht.put(22, "Java");
	//	ht.put(null, "driver");
	//	ht.put(45, null);
		ht.put(880, "Jee");
		ht.put(50000, "Jse");
		ht.put(400120, "Jee");
		System.out.println("ht = "+ht);
		
		
		System.out.println("ht.size() : "+ht.size());
		System.out.println("ht.containsKey(100) : "+ht.containsKey(100));
		System.out.println("ht.containsKey(101) : "+ht.containsKey(101));
		System.out.println("ht.containsValue(Jee) : "+ht.containsValue("Jee"));
		
		System.out.println("ht.get(100) : "+ht.get(100));
		System.out.println("ht.get(101) : "+ht.get(101));
		ht.remove(100);
		System.out.println("ht after remove(100) = "+ht);
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		Set<Integer> hs=ht.keySet();
		System.out.println("\nIterating using keySet()");
		for(Integer i:hs) {
			System.out.println("Key : "+i+" Value : "+ht.get(i));
		}
		
		
		System.out.println("\nIterating using entrySet() (preffered)");
		for(Entry<Integer, String>e : ht.entrySet()) {
			System.out.println("Key -> "+e.getKey()+" Value -> "+e.getValue());
		}

	}

}
