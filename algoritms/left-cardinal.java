import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String[] cardinalPoints = { "N", "L", "S", "O" };
		String commands = "";
		char[] command;
		int aux = 0;
		int testCases;

		while (true) {
			testCases = scanner.nextInt();
			if (testCases == 0) {
				scanner.close();
				return;
			}
			commands += scanner.next();
			command = commands.toCharArray();
			for (int j = 0; j < commands.length(); j++) {
				if (command[j] == 'D') {
					if (aux == 3) {
						aux = 0;
					} else {
						aux++;
					}
				} else {
					if (aux == 0) {
						aux = 3;
					} else {
						aux--;
					}
				}
			}
			if (aux >= 0) {
				System.out.println(cardinalPoints[aux]);
			} else {
				aux += 4;
				System.out.println(cardinalPoints[aux]);
			}
			aux = 0;
			commands = "";
		}
	}
}