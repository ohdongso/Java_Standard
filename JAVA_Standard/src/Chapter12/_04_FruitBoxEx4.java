package Chapter12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit2 {
	String name;
	int weight;
	
	Fruit2(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() { return name + "(" +weight + ")"; }
}

class Apple4 extends Fruit2 {
	public Apple4(String name, int weight) {
		super(name, weight);
	}
}

class Grape4 extends Fruit2 {
	public Grape4(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple4> {
	public int compare(Apple4 t1, Apple4 t2) {
		return t2.weight - t1.weight;
	}
}

class GrapeComp implements Comparator<Grape4> {
	public int compare(Grape4 t1, Grape4 t2) {
		return t2.weight - t1.weight;
	}
}

class FruitComp implements Comparator<Fruit2> {
	public int compare(Fruit2 t1, Fruit2 t2) {
		return t1.weight - t2.weight;
	}
}

public class _04_FruitBoxEx4 {
	
	public static void main(String[] args) {
		
		FruitBox2<Apple4> appleBox = new FruitBox2<Apple4>();
		FruitBox2<Grape4> grapeBox = new FruitBox2<Grape4>();
		
		appleBox.add(new Apple4("GreenApple", 300));
		appleBox.add(new Apple4("GreenApple", 100));
		appleBox.add(new Apple4("GreenApple", 200));
		
		grapeBox.add(new Grape4("GreenGrape", 400));
		grapeBox.add(new Grape4("GreenGrape", 300));
		grapeBox.add(new Grape4("GreenGrape", 200));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	} // main
}

class FruitBox2<T extends Fruit2> extends Box3<T> {}

class Box3<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList() { return list; }
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}




