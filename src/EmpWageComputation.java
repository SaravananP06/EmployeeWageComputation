/*
This program is to find the monthly wage of the employee in their companies
 */
public class EmpWageComputation {
    /*
    Added Method for the program
     */
    public static void calculateTotalWage(String companyName, int Wage_Per_Hour, int companyTotalWorkingDays, int Max_Hrs_for_Month) {
        final int Is_Full_Time = 1;
        final int Is_Part_Time = 2;;
        final int Max_Hrs_For_Month = 100;
        System.out.println("Welcome to Employee Wage Computation");
        System.out.println("Details of " + companyName + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.println("Wage per hour:" + Wage_Per_Hour);
        System.out.println("Maximum working days:" + companyTotalWorkingDays);
        System.out.println("Maximum working hours:" + Max_Hrs_for_Month);
        int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;

        while (totalEmpHrs <= Max_Hrs_For_Month && totalWorkingDays < companyTotalWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Is_Full_Time:
                    empHrs = 8;
                    break;
                case Is_Part_Time:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day# Working Day: " + totalWorkingDays + " Emp Hrs: " + empHrs);

        }
        System.out.println("Total Hrs Completed: " + totalEmpHrs);
        System.out.println("Total Working Days " + totalWorkingDays);
        int totalEmpWage = totalEmpHrs * Wage_Per_Hour;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        System.out.println("Total wage for a month of " + companyName + " employee is " + totalEmpWage + "\n");
        }
    public static void main (String[]args){
        /*
        Calling method in main method
         */
        calculateTotalWage("Apple", 40, 15, 200);
        calculateTotalWage( "FaceBook", 20, 20, 100);
    }
}
