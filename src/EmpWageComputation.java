public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int Is_Full_Time = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_Full_Time){
            System.out.println("Employee is Present");
            int Wage_Per_Hour = 20;
            int Full_Day_Hour = 8;
            int total_Salary = (Wage_Per_Hour * Full_Day_Hour);
            System.out.println("Salary for day is " +total_Salary);
        }else{
            System.out.println("Employee is Absent");
            int total_salary = 0;
            System.out.println("total salary is " +total_salary);

        }
    }
}
