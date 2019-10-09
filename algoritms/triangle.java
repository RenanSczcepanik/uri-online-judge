import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Double[] triangle = new Double[3];
		for (int i = 0; i < 3; i++) {
			triangle[i] = scanner.nextDouble();
		}
		Arrays.sort(triangle, Collections.reverseOrder());
		
		if (triangle[0] >= (triangle[1] + triangle[2])) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ((Math.pow(triangle[0], 2)) == (Math.pow(triangle[1], 2) + Math.pow(triangle[2], 2))) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if ((Math.pow(triangle[0], 2)) > (Math.pow(triangle[1], 2) + Math.pow(triangle[2], 2))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if ((Math.pow(triangle[0], 2)) < (Math.pow(triangle[1], 2) + Math.pow(triangle[2], 2))) {
				System.out.println("TRIANGULO ACUTANGULO");
			} 
			if ((triangle[0].equals(triangle[1])) && (triangle[0].equals(triangle[2])) && (triangle[1].equals(triangle[2]))) {
				System.out.println("TRIANGULO EQUILATERO");
			} else {
				if ((triangle[0].equals(triangle[1])) || (triangle[0].equals(triangle[2])) || (triangle[1].equals(triangle[2]))) {
					System.out.println("TRIANGULO ISOSCELES");
				}
			}
		}

		scanner.close();
	}
}