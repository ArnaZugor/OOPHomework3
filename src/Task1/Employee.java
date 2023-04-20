package Task1;

public class Employee extends Person{
    private double annualSalary;
    private String insuranceNo;

    public Employee (String name, final double annualSalary, final String insuranceNo){
        super(name);
        this.annualSalary = annualSalary;
        this.insuranceNo = insuranceNo;
    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public String getInsuranceNo() {
        return this.insuranceNo;
    }

    @Override
    public String toString(){
        return "name: " +super.toString()+", salary: "+ this.annualSalary +", insurance number: "+ this.insuranceNo;
    }
}
