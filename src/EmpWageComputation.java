public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int Is_Full_Time = 1;
        int Is_Part_Time = 2;
        int Wage_Per_Hour = 20;
        int EmpWage = 0;
        int EmpHrs = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == Is_Full_Time){
            System.out.println("Employee is in Full Time");
            EmpHrs = 8;
        } else if (empCheck == Is_Part_Time) {
            System.out.println("Employee is in Part Time");
            EmpHrs = 4;
        } else{
            System.out.println("Employee is Absent");
            EmpHrs = 0;
        }
        EmpWage = (EmpHrs * Wage_Per_Hour);
        System.out.println("Employee Wage: " +EmpWage);
        }
    }
}
