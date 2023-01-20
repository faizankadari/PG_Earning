package Project11;

public class Staff {
	String name;
	String id;
	int salary;

	public Staff(String name, String id) {
		super();
		this.name = name;
		this.id = id;
		salary = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void salaryEarned(int sal) {
		salary += sal;
		PG.updateMoneySpent(sal);
		System.out.println("Salay of " + getName() + " is " + sal);
	}

}
