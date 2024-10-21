import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите натуральное число N: ");
        int N = scanner.nextInt();
        
        int minDigit = 9; 
        int maxDigit = 0; 
        
        while (N > 0) {
            int digit = N % 10; 
            if (digit < minDigit) {
                minDigit = digit; 
            }
            if (digit > maxDigit) {
                maxDigit = digit; 
            }
            
            N /= 10;
        }
        
        System.out.println("Наименьшая цифра: " + minDigit);
        System.out.println("Наибольшая цифра: " + maxDigit);
	}
}