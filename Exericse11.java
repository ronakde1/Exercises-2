public class Exericse11 {

    class Employee {
        public void employee_method(String str) {
            System.out.println("Employee " + str);
        }
        public void tax(double rate){
            System.out.println(rate*100);
        }
    }
    class Ninja{
        public String name = "cole";
        public void ninja_method(String str) {
            System.out.println("Ninja " + str);
        }

    }
    interface EmployeeNinjaInterface {
        //all employee methods
        void employee_method(String str);
        void tax(double rate);

        //all ninja methods
        void ninja_method(String str);

    }

    class EmployeeNinja implements EmployeeNinjaInterface {
        private Employee employee;
        private Ninja ninja;

        public EmployeeNinja(Employee employee, Ninja ninja) {
            this.employee = employee;
            this.ninja = ninja;
        }
        public void employee_method(String str) {
            employee.employee_method(str);
        }
        public void tax(double rate){
            employee.tax(0.4);
        }
        public void ninja_method(String str) {
            ninja.ninja_method(str);
        }
        public String getNinjaName() {
            return ninja.name;
        }
    }
        public static void main(String[] args) {
            Exericse11 combined = new Exericse11();

            Employee employee = combined.new Employee();
            Ninja ninja = combined.new Ninja();

            EmployeeNinja employeeNinja = combined.new EmployeeNinja(employee, ninja);

            employeeNinja.employee_method("is an employee.");
            employeeNinja.tax(0.2);
            employeeNinja.ninja_method("is a ninja.");
            System.out.println("ninja name: " + employeeNinja.getNinjaName());
        }
}
/*
Imagine you have two classes: Employee (which embodies being an employee) and Ninja (which
embodies being a Ninja). You need to represent an employee who is also a ninja (a common
problem in the real world). By creating only one interface and only one class (NinjaEmployee),
show how you can do this without having to copy method implementation code from either of the
original classes
 */