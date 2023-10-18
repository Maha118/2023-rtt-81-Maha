package classworkwithEric;

import java.util.StringJoiner;

public class StrinJoiner {
	public static void main(String[]args) {
		StringJoiner joinNames = new StringJoiner(",", "(",")");
		joinNames.add("Java");

		joinNames.add("Python");

		joinNames.add("C Sharp");

		joinNames.add("Javascript");

				

		System.out.println(joinNames);
	}

}

//{Name:Tony:LastName,Strak}    this is it!  right here

		StringJoiner sj1 = new StringJoiner(":", "{", "}");

		StringJoiner sj2 = new StringJoiner(",", "[", "]");	

		sj1.add("Name").add("Tony");

		sj2.add("LastName").add("Stark");

		System.out.println(sj1.merge(sj2).toString());





		StringJoiner joiner = new StringJoiner("|", "=", "="); 

		 

		joiner.add("Java");

		joiner.add("Python");

		joiner.add("C Sharp");

		joiner.add("Javascript");

				

		System.out.println(joiner);

		

		

		

		StringJoiner joinNames = new StringJoiner(",", "[", "]");

		/* passing comma(,) and square-brackets as delimiter */

		// ----- Adding values to StringJoiner---

		joinNames.add("New York");

		joinNames.add("New Jersey");

 

		// ---- Creating StringJoiner with :(colon) delimiter

		StringJoiner joinNames2 = new StringJoiner(":", "[", "]");

		/* passing colon(:) and square-brackets as delimiter */

 

		// ---Adding values to StringJoiner-----

		joinNames2.add("Dallas");

		joinNames2.add("Chicago");

		// ---- Merging two StringJoiner ----

		StringJoiner merge = joinNames.merge(joinNames2);

		System.out.println(merge);





		
		
StringBuffer sb = new StringBuffer("135");

		

		sb.replace(0, 5, "6789");

		sb.insert(0, "12345");

		sb.reverse();

		sb.delete(0, 5);

		

		System.out.println(sb.toString());






