package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>(); 
		
		list.add("Volvo");
		list.add("BMW");
		list.add("Ford");
		list.add("Mazda");
		
		list.add(2, "Hyundai");
		System.out.println(list.size());
		
		
		for (String i : list) {
			System.out.println(i);
		}
		System.out.println("--------");						
		list.remove(1);
		
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String i : list) {
			System.out.println(i);
		}
		System.out.println("--------");		
		System.out.println("Index of BMW: " + list.indexOf("BMW"));
		
		System.out.println("--------");		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList());
		for (String i : result) {
			System.out.println(i);
		}
		
		System.out.println("--------");		
		String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null); 
		System.out.println(name);
	}
}
