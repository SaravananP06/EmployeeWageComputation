public class EmpWageComputation {
    public static final int Is_Full_Time = 1;
    public static final int Is_Part_Time = 2;
    public static final int Wage_Per_Day = 20;
    public static final int Num_Of_Working_Days = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int empWage = 0, empHrs = 0, totalEmpWage = 0;

        for (int day = 0; day < Num_Of_Working_Days; day++) {
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
            empWage = (empHrs * Wage_Per_Day);
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " +empWage);
        }
        System.out.println("Total Emp Wage: " +totalEmpWage);

    }
}
