public class PercentEmploye extends Employe {
    private double baseSalary;
    private double percent;
    private double sales;
    
    public PercentEmploye(String name,double baseSalary,double percent,double sales){
        super(name);
        this.baseSalary = baseSalary;
        this.percent = percent;
        this.sales = sales;
    }
    
    @Override
    public double colculaterSalary(){
        return baseSalary + (percent * sales);
    }
}