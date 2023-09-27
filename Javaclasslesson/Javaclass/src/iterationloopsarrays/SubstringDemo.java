package iterationloopsarrays;

public class SubstringDemo {
	// ---------0123456789012345
	String string = "This is a String";
	// substring with a start and an end
	String sub = string.substring(5, 7);
	System.out.println(sub);
	
	// substring with just a start
	String sub1 = string.substring(5, 7);
	System.out.println(sub1);
	
	
	// -------------------0123456789012
	String filename = "someimage.jpg";
	
	int lastDot = filename.substring(filename.lastIndesOf(.) + 1);
	System.out.println(ext);
	
	// ------------01234567890
	String name = "Eric Heilig";
	
	int spaceposition = name.indexOf(" ");
	String firstname = name.substring(0, spaceposition);
	System.out.println(firstname);
	
	String lastname = name.substring(name.indexOf(" ")+ 1);
	System.out.println(lastname);
	
	filename.substring(filename.lastIndexOf(".");

}
