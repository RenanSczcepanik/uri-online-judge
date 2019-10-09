import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int initialHour;
		int finalHour;
		
		initialHour = scanner.nextInt();
		finalHour = scanner.nextInt();
		
		if(initialHour < finalHour){
			System.out.println("O JOGO DUROU " + (finalHour - initialHour) + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU " + ((24 - initialHour) + finalHour) + " HORA(S)");
		}
		scanner.close();
	}
}