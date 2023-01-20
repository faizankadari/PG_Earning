package Project11;

public class Maintenance {
	int maintain;
	String cleaning;
	String electricity;
	

	public Maintenance(String cleaning, String electricity) {
		this.cleaning = cleaning;
		this.electricity = electricity;
	}

	public int getMaintain() {
		return maintain;
	}

	public void setMaintain(int maintain) {
		this.maintain = maintain;
	}

	public String getCleaning() {
		return cleaning;
	}

	public void setCleaning(String cleaning) {
		this.cleaning = cleaning;
	}

	public String getElectricity() {
		return electricity;
	}

	public void setElectricity(String electricity) {
		this.electricity = electricity;
	}

	public void totalMaintainance(int amount) {
		PG.Maintaincharge(amount);
		maintain+=amount;
	}
}
