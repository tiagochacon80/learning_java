package entities;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//Associa�oes
	private Department department;
	//Varios contratos, sera representado por listas
	private List<HourContract> contracts = new ArrayList<>();
	//(Tem muitos)As lista sao instanciados vazia e nao iniciadas no construtor
	
	public Worker() {		
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}	
	
	public void addContract(HourContract contract) { //Nao entendi porque ele recebe esse argumento?
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) { //Nao entendi porque ele recebe esse argumento?
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance(); 
		for (HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
			
		}
		return sum;
	}	
}
