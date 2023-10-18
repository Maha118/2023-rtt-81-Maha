package genericjavacollection;

import java.util.HashMap;
import java.util.Map;

public class Maoexample {
 public static void main(String[] args) {
	 HashMap<String,Integer> stringmap = new HashMap<>();
	 
	 stringMap.put("one",1);
	 stringMap.put("two",2);
	 
	 Integer one = stringMap.get("one");
	 Integer two = stringMap.get("two");
	 
	 stringMap.put("one", 1000);
	 
	 System.out.println(stringMap.get("one"));
	 
	 Map<String,String> strings = new Hashmap<>();
	 strings.put(one, "This is a single item");
	 strings.put("two","This is two things");
	 
	 Map<Integer, String> numbers =new HashMap<>();
	 numbers.put(1,  "1st");
	 numbers.put(2, "2nd" );
	 numbers.put(3,  "3rd");
	 numbers.put(4,  "4th");
	 numbers.put(40,  "4th");
	 numbers.put(50,  null);
	 numbers.put(null, "null");
	 
	 System.out.println("=====================");
	 
	 for (Integer Key : numbers.keySet()) {
		 String Value = 
	 }
	 
}
