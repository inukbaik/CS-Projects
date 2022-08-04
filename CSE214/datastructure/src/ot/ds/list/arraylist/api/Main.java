package ot.ds.list.arraylist.api;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(1, 50);
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println(numbers);
		
		System.out.println(numbers.get(2));
		System.out.println(numbers.size());
		
		Iterator it = numbers.iterator();
		while(it.hasNext()) {
			int value = (int) it.next();
			if(value == 30) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);
	}
}
