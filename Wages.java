package employeeWageBuilder;

public class Wages {
	
	private int wagePerHour;
	private int fullDayHrs;

	public int getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(int wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	public int getFullDayHrs() {
		return fullDayHrs;
	}

	public void setFullDayHrs(int fullDayHrs) {
		this.fullDayHrs = fullDayHrs;
	}
	
	public Wages(int wph, int fdh) {
		this.setWagePerHour(wph);
		this.setFullDayHrs(fdh);
	}
	
	public void dailyWage() {
		int dailyWage = wagePerHour*fullDayHrs;
		System.out.println("Daily wage of the employee is "+dailyWage);
	}

}
