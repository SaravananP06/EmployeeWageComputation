public class EmpWageComputation {
    public static final int Is_Full_Time = 1;
    public static final int Is_Part_Time = 2;
    public static final int Wage_Per_Hour = 20;
    public static void main(String[] args) {

        int EmpWage = 0;
        int EmpHrs = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck){
            case Is_Full_Time:
                EmpHrs = 8;
                break;
            case Is_Part_Time:
                EmpHrs = 4;
                break;
            default:
                EmpHrs = 0;
        }
        EmpWage = (EmpHrs * Wage_Per_Hour);
        System.out.println("Employee Wage: " +EmpWage);
    }
}
