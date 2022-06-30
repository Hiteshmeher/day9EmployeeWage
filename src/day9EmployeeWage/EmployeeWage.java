package day9EmployeeWage;

public class EmployeeWage {

	public static void main(String[] args) {
		/**
		 * generating random number 0, 1, 2 
		 * if o the part time job
		 * if 1 then present for the job 
		 * if 2 then absent 
		 */
		System.out.println("Welcome to Employee Wage Problem");
		int attendance = (int) Math.floor(Math.random() * 10) % 3;
		if (attendance == 0)
			System.out.println("Emloyee is absent");
		else if (attendance == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is present for the Half day");
	}
}
