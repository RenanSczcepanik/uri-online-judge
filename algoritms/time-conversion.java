import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int timeSecond;
		int timeHour;
		int timeMinute;
		timeSecond = scanner.nextInt();   
		
		timeHour = timeSecond / 3600;
		timeMinute = timeSecond % 3600;
		timeMinute /= 60;
		timeSecond %= 60;
		System.out.println(timeHour + ":" + timeMinute + ":" + timeSecond);
		
		scanner.close();
	}
}