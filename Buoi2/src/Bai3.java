import java.util.Scanner;

public class Bai3 {
	public static boolean checkNT(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n > 1;
	}

	public static void main(String[] args) {
		System.out.print("NHAP VAO SO NGUYEN N: ");
		int n = (new Scanner(System.in)).nextInt();
		System.out.println(checkNT(n) ? n + " LA SO NGUYEN TO!" : n + " KHONG PHAI LA SO NGUYEN TO!");
	}
}
