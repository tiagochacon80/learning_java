package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		//Criando um List(generiques) do tipo Employee
		List<Employee> list = new ArrayList<>();
		
		//Part 1 - Reading data
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			//Instanciando o objeto
			Employee emp = new Employee(id, name, salary);
			
			//Incerindo o objeto criado na lista
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("enter the employee id that will have salary increase : ");
		int idSalary = sc.nextInt();
		
		//Procurando a posiçao do idSalary dentro da lista
		Employee pos = positionId(list, idSalary);		
		//Se a posiçao for nula é porque nao existe id
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			//Acessa o funcionario que esta na posiçao "pos" e faz o incremento do salario
			pos.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee emp : list) { //Para cada elemento da lista
			System.out.println(emp);
		}	
		
		sc.close();		
	}
	//Funçao para procurar a posiçao do "id"
	public static Employee positionId(List<Employee> list, int id) {
		/*for (int i = 0; i < list.size(); i++) {
			//list.get() acessa o elemento na posiçao i
			if(list.get(i).getId() == id) {
				return i;
			}
		}*/		
		for(Employee emp : list){
		     if(emp.getId() == id){
		          return emp;
		     }
		}
		return null;
	}
}
