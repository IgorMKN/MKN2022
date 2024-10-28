public class HourEmploye extends Employe {
    private double hourRate;
    private double hoursworked;
    
    public HourEmploye(String name,double hourRate, double hoursworked){
        super(name);
        this.hourRate = hourRate;
        this.hoursworked =hoursworked;
    }
    @Override
    public double colculaterSalary(){
       return hourRate * hoursworked;
    }
}