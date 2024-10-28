public class SalaryEmploye extends Employe {
    private double salary;
    
    public SalaryEmploye(String name,double salary){
        super(name);
        this.salary = salary;
    }
    
    @Override
    public double colculaterSalary(){
        return salary;
    }
}