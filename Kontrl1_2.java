import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = scanner.nextInt();
        while(N % 2 == 0){
            N/=2;
        }
        if (N==1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	}
}