import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1,"Java");
		languages.put(2,"Python");
		languages.put(3,"JS");
System.out.println("HashMap : " + languages);

String value = languages.get(1);
System.out.println(" Value of index 1 : " + value);
System.out.println(" Value of index 3 : " + languages.get(3));


System.out.println(" Keys : " + languages.keySet());



System.out.print("Keys:");
for(Integer key : languages.keySet())
{
	System.out.print(key);
	System.out.print(",");
}
	}

}
