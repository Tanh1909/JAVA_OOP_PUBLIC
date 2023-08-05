import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("NHAP VO SO NGUYEN a: ");
		a = sc.nextInt();
		System.out.print("NHAP VO SO NGUYEN b: ");
		b = sc.nextInt();
		System.out.print("NHAP VO SO NGUYEN c: ");
		c = sc.nextInt();
		System.out.println("TONG SO QUA TOI DA: " + 7 * Math.min(a, Math.min(b / 2, c / 4)));
	}
}
