package Project11;

public class Customer {
	String name;
	int AddharId;
	int phoneNo;
	int amountPaid;
	int totalCharges;
	
	
	
	public Customer(String name, int addharId, int phoneNo) {
		amountPaid=0;
		totalCharges=3800;
		this.name = name;
		AddharId = addharId;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public int getAddharId() {
		return AddharId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void paidAmount(int amount) {
		PG.updateMoneyEarned(amount);
		amountPaid+=amountPaid+amount;
		if(amountPaid==totalCharges) {
			System.out.println("All Paid"+amount);
		}else {
			System.out.println("Deposit Paid is "+amount);
			System.out.println("Remaining amount is "+(totalCharges-amountPaid));
		}
		
	}

}
