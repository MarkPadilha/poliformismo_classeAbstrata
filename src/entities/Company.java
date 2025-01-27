package entities;

public class Company extends TaxPayer {
	
	private int numberOfEmployee;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}
	
	@Override
	public Double tax() {
		if(numberOfEmployee <= 10) {
			return super.getAnualIncome() * 0.16;
		}else {
			return super.getAnualIncome() * 0.14;
		}
	}
}
