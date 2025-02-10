package Chapter11;

import java.util.Iterator;
import java.util.Map;
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
		
		System.out.println("= 기본정렬 =");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		} // while문 끝.
		System.out.println();
		
		// map을 ArrayList로 변환한 다음에 Collections.sort()로 정렬
		
		
		
	} // main의 끝.
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar);
	}
	
} // class