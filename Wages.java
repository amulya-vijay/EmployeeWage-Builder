package employeeWageBuilder;

public class Wages {
	
	private int wagePerHour;
	private int fullDayHrs;
	private int partTimeHrs;

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
	
	public void dailyWage(int wph, int fdh) {
		this.setWagePerHour(wph);
		this.setFullDayHrs(fdh);
		int dailyWage = wagePerHour*fullDayHrs;
		System.out.println("Daily wage of the employee is "+dailyWage);
	}

	public int getPartTimeHrs() {
		return partTimeHrs;
	}

	public void setPartTimeHrs(int partTimeHrs) {
		this.partTimeHrs = partTimeHrs;
	}
	
	public void partTimeWage(int partTimehrs) {
		
		this.setPartTimeHrs(partTimehrs);
		int partTimeWage = wagePerHour*getPartTimeHrs();
		System.out.println("Part time wage of the employee is "+partTimeWage);
		
	}
	
	

}
