import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String inputText = scanner.nextLine();
        String[] words = inputText.split(" ");
        int count = 0;
        for (int i =0;i<words.length;i++){
            if(words[i].startsWith("A")){
                words[i]= "a" + words[i].substring(1);
                count++;
            }
        }
        String result = String.join(" ",words);
        
        System.out.println("Измененный текст: " + result);
        System.out.println("Количество слов на a : " + count);

	}
}