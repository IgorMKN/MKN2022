public abstract class Employe {
    public String name;
    public Employe(String name){
        this.name = name;
    }
    public abstract double colculaterSalary();
    @Override
    public String toString(){
        return "Работник " + name + " - Зарплата: " + colculaterSalary();
    }
}