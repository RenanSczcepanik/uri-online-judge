import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int numberA;
		int numberB;
		int result;
		while(true){
		numberA = scanner.nextInt();
		numberB = scanner.nextInt();
		if(numberA == 0){
			scanner.close();
			return;
		}
		result = (-2) * numberA + numberB;
		System.out.println(-result);
		}
	}
}