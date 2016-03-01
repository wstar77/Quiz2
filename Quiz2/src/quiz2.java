import java.util.Scanner;

public class quiz2 {
	
	
	public static void main (String[] args) {           // main
		Scanner user_input = new Scanner( System.in );
		tuitionvar encap = new tuitionvar();
		
		System.out.print("Enter tuition: ");
		encap.setTuition (user_input.nextDouble());
		
		System.out.print("Enter percent increase: ");
		encap.setPercentinc (user_input.nextDouble());
		
		
		System.out.print("Enter repayment APR: ");
		encap.setApr(user_input.nextDouble());
		
		System.out.print("Enter terms left (1-4): ");
		encap.setTerm(user_input.nextDouble());
		
		System.out.print("Enter payment schedule (years): ");
		encap.setSched(user_input.nextDouble());
		
		double loopVal = encap.getTerm();    // Total tuition for however many years in college (2nd number is result)
		while (loopVal > 0){
		double result = tuit2(encap.getTuition(), tuit1(encap.getTuition(), encap.getPercentinc()));
		encap.setTuition(result);
		loopVal--;
		System.out.println(result);
		}
		
		double loopVal2 = encap.getSched(); // Total cost after interest of however many years in payment schedule
		while (loopVal2 > 0){
		double result2 = repay2(encap.getTuition(), repay1(encap.getTuition(), encap.getApr()));
		encap.setTuition(result2);
		loopVal2--;
		
		double result3 = repay3(encap.getTuition(), encap.getSched()); // Monthly payments (4th number is result)
		System.out.println(result3);
}}
	
		public static double tuit1(double tuition, double percentinc) {
		double tuit1 = (tuition * (percentinc * .01));
		
		return tuit1;
		
	} 
	
	
	public static double tuit2(double tuition, double tuit1) {
		double tuit2 = (tuition + tuit1);
		return tuit2;
		
	} 
	
	public static double repay1 (double tuition, double apr) {
		double repay1 = (tuition * (apr * .01));
		return repay1;
}

	public static double repay2 (double tuition, double repay1) {
		double repay2 = (tuition + repay1);
		return repay2;
}
	public static double repay3 (double tuition, double sched) {
		double repay3 = (tuition / (sched * 12));
		return repay3;
}}
		
		
	







