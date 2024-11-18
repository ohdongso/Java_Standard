package Chapter11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class _04_MyVector implements List {
	Object[] data = null; // 객체를 담기 위한 객체배열을 선언한다.
	int capacity = 0;     // 용량
	int size = 0;         // 크기
	
	public _04_MyVector(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("유효하지 않은 값입니다. :" + capacity);
		}
	}
	
	public _04_MyVector() {
		this(10); // 크기를 지정하지 않으면 크기를 10으로 한다.
	}
	
	// 최소한의 저장공간
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0) {
			setCapacity(minCapacity);
		}
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity == capacity) {
			return; // 크기가 같으면 변경하지 않는다.
		}
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public void clear() {
		for(int i = 0; i < size; i++) {
			data[i] = null;
		}
		size = 0;
	}
	
	public boolean remove(Object obj) {
		for(int i = 0; i < size; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		
		return result;
	}
	
	public boolean add(Object obj) {
		// 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
		ensureCapacity(size + 1);
		data[size++] = obj;
		return true;
	}
	
	public boolean isEmpty() { return size == 0; }
	public int capacity() { return capacity; }
	public int size() { return size; }
	
	
	
	
	
	
	
	
	
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}



	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void add(int index, Object element) {

	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
	} // main() 끝.

}