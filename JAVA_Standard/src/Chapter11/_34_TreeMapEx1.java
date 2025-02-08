package Chapter11;

import java.util.Iterator;
import java.util.TreeMap;

public class _34_TreeMapEx1 {
	
	public static void main(String args[]) {
		
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };
		
		TreeMap map = new TreeMap();
		
		for(int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1));
			} else {
				map.put(data[i], new Integer(1));
			}
		}
		
		// 여기서 부터
		Iterator it = map.entrySet().iterator();
		
		
		
		
	} // main의 끝.
	
} // class