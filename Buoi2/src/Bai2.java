import java.util.Scanner;

public class Bai2 {
	public static double S(int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (1.0f / i);
		}
		return sum;
	}

	public static int P(int n) {
		int sum = 0;
		int giaiThua = 1;
		for (int i = 1; i <= n; i++) {
			giaiThua *= i;
			sum += giaiThua;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.print("NHAP VAO SO NGUYEN N: ");
		int n = (new Scanner(System.in)).nextInt();
		System.out.println("S= " + S(n));
		System.out.println("P= " + P(n));
	}
}
