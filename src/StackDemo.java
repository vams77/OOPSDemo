import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

 public static void main(String[] args) {
Stack<String> s=new Stack<String>();
s.push("vamsi");
s.push("Charan");
s.push("Sai");
s.push("krish");
System.out.println(s);
s.pop();
System.out.println(s.peek());
Iterator<String> st=s.iterator();
while(st.hasNext()) {
System.out.println(st.next());
}
s.remove(0);
System.out.println(s);
}

}

