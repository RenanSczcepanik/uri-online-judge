import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		double salary;
		double percent;
		salary = scanner.nextDouble();
		
		if(salary <= 400){
			percent = (salary * 0.15);
			System.out.printf("Novo salario: " + "%.2f", (salary + percent));
			System.out.println();
			System.out.printf("Reajuste ganho: " + "%.2f", percent);
			System.out.println();
			System.out.println("Em percentual: 15 %");
		} else if(salary <= 800){
			percent = (salary * 0.12);
			System.out.printf("Novo salario: " + "%.2f", (salary + percent));
			System.out.println();
			System.out.printf("Reajuste ganho: " + "%.2f", percent);
			System.out.println();
			System.out.println("Em percentual: 12 %");
		} else if(salary <= 1200){
			percent = (salary * 0.10);
			System.out.printf("Novo salario: " + "%.2f", (salary + percent));
			System.out.println();
			System.out.printf("Reajuste ganho: " + "%.2f", percent);
			System.out.println();
			System.out.println("Em percentual: 10 %");
		} else if(salary <= 2000){
			percent = (salary * 0.07);
			System.out.printf("Novo salario: " + "%.2f", (salary + percent));
			System.out.println();
			System.out.printf("Reajuste ganho: " + "%.2f", percent);
			System.out.println();
			System.out.println("Em percentual: 7 %");
		} else {
			percent = (salary * 0.04);
			System.out.printf("Novo salario: " + "%.2f", (salary + percent));
			System.out.println();
			System.out.printf("Reajuste ganho: " + "%.2f", percent);
			System.out.println();
			System.out.println("Em percentual: 4 %");
		}
		
		scanner.close();
	}
}