package inheritance;


class Person{
    protected String name;
    protected String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", address='" + this.address + '\'' +
                '}';
    }
}

class Employee extends Person{
    protected int Emp_no;
    protected float salary;
    protected float house_rent;
    protected float medical_allow;


    public Employee(String name, String address, int emp_no, float salary, float house_rent, float medical_allow) {
        super(name, address);
        Emp_no = emp_no;
        this.salary = salary;
        this.house_rent = house_rent;
        this.medical_allow = medical_allow;
    }
    public void calcSalary(){
        float employees_pay= this.salary/(1+this.house_rent+this.medical_allow);
        System.out.println("Employee total Salary :"+employees_pay);
    }

    @Override
    public String toString() {
        return super.toString()+" ==> Employee{" +
                "Emp_no=" + Emp_no +
                ", salary=" + salary +
                ", house_rent=" + house_rent +
                ", medical_allow=" + medical_allow +
                '}';
    }
}

class Faculty extends Employee {
    protected String designation;
    protected String department;
    protected int years_of_education;
    public float some_amount = 0;

    public Faculty(String name, String address, int emp_no, float salary, float house_rent, float medical_allow, String designation, String department, int years_of_education) {
        super(name, address, emp_no, salary, house_rent, medical_allow);
        this.designation = designation;
        this.department = department;
        this.years_of_education = years_of_education;
    }

    @Override
    public void calcSalary() {


        if (years_of_education < 16) {
            this.some_amount = 0;
            float faculty_pay = (this.salary + (this.house_rent * this.salary) + (this.medical_allow * salary)) + some_amount;
            System.out.println("Faculty total Salary :" + faculty_pay);

        } else if (years_of_education == 16) {
            this.some_amount = 1500;
            float faculty_pay = (this.salary-some_amount)/(1+this.house_rent+this.medical_allow);
            System.out.println("Faculty total Salary :" + faculty_pay);
        } else if (years_of_education == 20) {
            this.some_amount = 2000;
            float faculty_pay = (this.salary-some_amount)/(1+this.house_rent+this.medical_allow);
            System.out.println("Faculty total Salary :" + faculty_pay);
        } else if (years_of_education > 25) {
            this.some_amount = 3000;
            float faculty_pay = (this.salary-some_amount)/(1+this.house_rent+this.medical_allow);
            System.out.println("Faculty total Salary :" + faculty_pay);

        }


    }

    @Override
    public String toString() {
        return super.toString()+" ==> Faculty{" +
                "designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", years_of_education=" + years_of_education +
                ", some_amount=" + some_amount +
                '}';
    }
}
public class drive_of_department {
    public static void main(String[] args) {

        Employee E1 = new Employee("Hasan","Srilanka",100,20000,0.1f,0.3f);
        Faculty Com = new Faculty("Zrk","Srilanka",200,10000,0.2f,0.4f,"professor","ComputerEng",20);
        E1.calcSalary();
        Com.calcSalary();
        System.out.println(E1);
        System.out.println(Com);
    }
}
