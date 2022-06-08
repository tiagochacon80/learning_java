package projectTax;

public class Individual extends TaxPayer {
	
	private Double healthExpendites;
	
	public Individual() {
		
	}	

	public Individual(String name, Double anuallncome, Double healthExpendites) {
		super(name, anuallncome);
		this.healthExpendites = healthExpendites;
	}


	public Double getHealthExpendites() {
		return healthExpendites;
	}

	public void setHealthExpendites(Double healthExpendites) {
		this.healthExpendites = healthExpendites;
	}

	@Override
	public Double tax() {
		if(getAnuallncome() < 20000) {
			return (getAnuallncome() * 0.15) - (healthExpendites * 0.5); 
		}
		else {
			return (getAnuallncome() * 0.25) - (healthExpendites * 0.5);
		}
		
	}	
	
}
