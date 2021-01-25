public class FooCorporation {

    final static double minimumWage = 8.0;
    final static int maxHours = 60;
    public static void main(String[] args) {
        double x; int y;

        x=7.50;
        y=35;
        salaryCalculation(x,y);
        x=8.20;
        y=47;
        salaryCalculation(x,y);
        x=10.00;
        y=73;
        salaryCalculation(x,y);
    }
    public static void salaryCalculation(double basePay, int hoursWorked){
        double totalSalary = 0;
        if ((basePay < minimumWage) || (hoursWorked > maxHours)){
            System.out.println("Error!");
        }
        else {
            if (hoursWorked > 40){
                totalSalary = basePay * 40 + 1.5*basePay*(hoursWorked - 40);
            }
            else {
                totalSalary = basePay * hoursWorked;
            }
            System.out.println("Your Total Salary is " + totalSalary);
        }
    }
}
