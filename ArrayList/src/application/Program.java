package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//Declarando como inteira (wrapper class)
		//List<Integer> list;
		//Instanciando uma lista com uma classe que implementa a interface
		List<String> list = new ArrayList<>(); 
		
		list.add("Volvo");
		list.add("BMW");
		list.add("Ford");
		list.add("Mazda");
		
		for (String i : list) {
			System.out.println(i);
		}

	}

}
