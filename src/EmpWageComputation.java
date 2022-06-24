public class EmpWageComputation {
    public static final int Is_Full_Time = 1;
    public static final int Is_Part_Time = 2;
    public static final int Wage_Per_Day = 20;
    public static final int Max_Hrs_For_Month = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int totalEmpHrs = 0, empHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= Max_Hrs_For_Month && totalWorkingDays < 20) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random()*10) % 3;
            switch (empCheck){
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
        System.out.println("Total Working Days " +totalWorkingDays);
        int totalEmpWage = totalEmpHrs * Wage_Per_Day;
        System.out.println("Total Emp Wage: " +totalEmpWage);
    }
}
