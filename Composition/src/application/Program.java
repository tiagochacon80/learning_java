package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine(); 
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		//Um novo objeto foi instanciado do tipo Worker, com os dados desse objeto, associado a esse objeto tem u outro objeto com o nome de Departement, com o nome do department digitado pelo usuarios
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (YYYY-MM-DD): ");
			Date contraDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			//Instanciando o contract
			HourContract contract = new HourContract(contraDate, valuePerHour, hours);
			//Associaçao o contract com o worker
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (YYYY-MM): ");
		String monthAndYear = sc.next();
		//Pegando os caracteres de Month/year convertendo para inteiro e guardando numa variavel mês/ano
		int month = Integer.parseInt(monthAndYear.substring(5));
		int year = Integer.parseInt(monthAndYear.substring(0, 4));
		System.out.println("Name: " + worker.getName());
		//Composiçao de objetos, worker acessa o department para depois acessar o name
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}
