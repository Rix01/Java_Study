package work.com.workshop07;

public class Secretary extends Employee implements Bonus {
	
	public Secretary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void incentive(int pay) {
		this.setSalary((int) (this.getSalary()+(pay*0.8)));
	}

	@Override
	public double tax() {
		// 10 percent
		return this.getSalary()*0.1;
	}

	
}
