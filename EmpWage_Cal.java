package empBuilder;

public class EmpWage_Cal {
	public static void main(String args[]) {
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR =20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck= Math.floor(Math.random()*10)%2;
		System.out.println("Welcome to employee wage computation");
			if (IS_FULL_TIME == empCheck)
				empHrs = 8;
			else
					empHrs = 0;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage:" + empWage);
		}
		
 	}
