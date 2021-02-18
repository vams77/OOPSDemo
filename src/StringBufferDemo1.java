
public class StringBufferDemo1 {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer ("jamesgosling");
		int l= str.length();
		System.out.println("the length of string is : " +l);
		System.out.println("the capacity of string is : " +l);
		System.out.println(" The capacity of string is : " +str.capacity());
		
		System.out.println((" the reversed string : " +str.reverse()));

		System.out.println(" the  sub string : " +str.substring(0,4));
		
		
	}

}
