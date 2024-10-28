
public class Main
{
	public static void main(String[] args) {
	HourEmploye employe1 = new HourEmploye("Иван",500,180);
	System.out.println("Зарплата служащего с почасовой оплатой: " + employe1.colculaterSalary());
	SalaryEmploye employe2 = new SalaryEmploye("Никита",45000);
	System.out.println("Зарплата штатного служащего: " + employe2.colculaterSalary());
	PercentEmploye employe3 = new PercentEmploye("Алексей",30000,0.1,120000);
	System.out.println("Зарплата служащего с процентной ставкой: " + employe3.colculaterSalary());
	}

}
