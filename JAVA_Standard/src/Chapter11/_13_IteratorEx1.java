package Chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class _13_IteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		} // while문 끝.
		
	} // main() 끝.
	
} // end of class