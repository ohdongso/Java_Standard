package Chapter12;

import java.util.ArrayList;

class Fruit3 { public String toString() { return "Fruit"; }}
class Apple3 extends Fruit3 { public String toString() { return "Apple"; }}
class Grape3 extends Fruit3 { public String toString() { return "Grape"; }}

class Juice {
	String name;
	
	Juice(String name) { this.name = name + "Juice"; }
	public String toString() { return name; }
}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit3> box2) {
		String tmp = "";
		
		for(Fruit3 f : box2.getList()) {
			tmp += f + " ";
		}
		
		return new Juice(tmp);
	}
}

public class _03_FruitBoxEx3 {
	
	public static void main(String[] args) {
		FruitBox<Fruit3> fruitBox = new FruitBox<Fruit3>();
		FruitBox<Apple3> appleBox = new FruitBox<Apple3>();
		
		fruitBox.add(new Apple3());
		fruitBox.add(new Grape3());
		appleBox.add(new Apple3());
		appleBox.add(new Apple3());
	
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	} // main
}

class FruitBox<T extends Fruit3> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	ArrayList<T> getList() { return list; }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}






