package Chapter12;

import java.util.ArrayList;

class Fruit1 implements Eatable {
	public String toString() { return "Fruit"; }
}

class Apple1 extends Fruit1 { public String toString() { return "Apple"; }}
class Grape1 extends Fruit1 { public String toString() { return "Grape"; }}
class Toy1   		        { public String toString() { return "Toy";   }}

interface Eatable {}

public class _02_FruitBoxEx2 {

	public static void main(String[] args) {
		
		FruitBox1<Fruit1> fruitBox = new FruitBox1<Fruit1>();
		FruitBox1<Apple1> appleBox = new FruitBox1<Apple1>();
		FruitBox1<Grape1> grapeBox = new FruitBox1<Grape1>();
		
		fruitBox.add(new Fruit1());
		fruitBox.add(new Apple1());
		fruitBox.add(new Grape1());
		appleBox.add(new Apple1());
		grapeBox.add(new Grape1());
		
		System.out.println("fruitBox-" + fruitBox);
		System.out.println("appleBox-" + appleBox);
		System.out.println("grapeBox-" + grapeBox);
	} // main
}

class FruitBox1<T extends Fruit1 & Eatable> extends Box1<T> {}

class Box1<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i)     { return list.get(i); }
	int size() 		 { return list.size(); }
	public String toString() { return list.toString(); }
}
