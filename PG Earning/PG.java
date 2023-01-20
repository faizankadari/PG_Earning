package Project11;

import java.util.List;

public class PG {
	List<Staff> staff;
	List<Customer> customer;
	List<Maintenance> maintainance;
	static int moneySpent;
	static int moneyEarned;
	static int totalearned;
	
	public PG(List<Staff> staff, List<Customer> customer,List<Maintenance> maintainance) {
		this.staff = staff;
		this.customer = customer;
		this.maintainance=maintainance;
		moneySpent=0;
		moneyEarned=0;
		totalearned=0;
	}

	public List<Maintenance> getMaintainance() {
		return maintainance;
	}

	public void setMaintainance(List<Maintenance> maintainance) {
		this.maintainance = maintainance;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public static int getMoneyEarned() {
		return totalearned;
	}

	public static void updateMoneyEarned(int amount) {
		// TODO Auto-generated method stub
		moneyEarned+=amount;
		totalearned=moneyEarned;
	}

	public static int getMoneySpent() {
		return moneySpent;
	}

	public static void updateMoneySpent(int sal) {
		// TODO Auto-generated method stub
		moneySpent = totalearned - sal;
	}

	public static void Maintaincharge(int amount) {
		// TODO Auto-generated method stub
		moneySpent-=amount;
	}


}
