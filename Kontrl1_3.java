import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальную сумму вклада (x): ");
        int x = scanner.nextInt();

        System.out.print("Введите процент увеличения (p): ");
        int p = scanner.nextInt();

        System.out.print("Введите целевую сумму (y): ");
        int y = scanner.nextInt();

        int years = 0;

        while (x < y) {
            x += x * p / 100;
            years++;
        }

        if(years>1 && years<=4){
            System.out.println("Вклад достигнет не менее " + y + " рублей через " + years + " года.");
        }
        else  if (years==1){
            System.out.println("Вклад достигнет не менее " + y + " рублей через " + years + " год.");
        }
        else
            System.out.println("Вклад достигнет не менее " + y + " рублей через " + years + " лет.");
	}
}