import java.util.Scanner;

public class Bai4 {
	public static void giaiPT(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		double x1, x2;
		if (delta >= 0) {
			System.out.println("denta>=0");
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println(x1+" "+x2);
			if (x1 > 0) {
				System.out.println("x1: " + Math.sqrt(x1));
				System.out.println("x2: " + Math.sqrt(x1) * -1);
			}
			if (x2 > 0) {
				System.out.println("x3: " + Math.sqrt(x2));
				System.out.println("x4: " + Math.sqrt(x2) * -1);
			}
		} else {
			System.out.println("denta<0");
			System.out.println("PHUONG TRINH VO NGHIEM!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("NHAP SO THUC a: ");
		double a = sc.nextDouble();
		System.out.print("NHAP SO THUC b: ");
		double b = sc.nextDouble();
		System.out.print("NHAP SO THUC c: ");
		double c = sc.nextDouble();
		giaiPT(a, b, c);
		System.out.println("ket thuc chuong trinh");
	}

}
