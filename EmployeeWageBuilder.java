package employeeWageBuilder;

public class EmployeeWageBuilder {
	
	public static String employeeAttendance() {
		
		int value = (int) Math.floor(Math.random()*2+1);
		boolean isEmployeePresent = (value==1) ? true  : false ;
		if(isEmployeePresent) {
			return "Employee is Present";
		}else {
			return "Employee is Absent";
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program.");
		System.out.println(employeeAttendance());
		Wages wages = new Wages();
		wages.dailyWage(20,8);
		wages.partTimeWage(4);
	}
}
