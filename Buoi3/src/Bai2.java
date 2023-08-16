import java.util.Scanner;

public class Bai2 {
	public static Scanner sc = new Scanner(System.in);

	public static boolean check(int viTri, int n) {
		if (viTri <= 0 || viTri > n) {
			return false;
		}
		return true;
	}

	public static void xuat(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void them(int a[], int n) {
		int viTriThem;
		do {
			System.out.print("NHAP VI TRI CAN THEM: ");
			viTriThem = sc.nextInt();
			if (!check(viTriThem, n)) {
				System.out.println("VI TRI THEM KHONG HOP LE! NHAP LAI: ");
			}
		} while (!check(viTriThem, n));
		System.out.print("NHAP GIA TRI CAN THEM: ");
		int gt = sc.nextInt();
		viTriThem--;
		n++;
		for (int i = n - 1; i > viTriThem; i--) {
			a[i] = a[i - 1];
		}
		a[viTriThem] = gt;
		xuat(a, n);
		xoa(a, n);
	}

	public static void xoa(int a[], int n) {
		int ViTriXoa;
		do {
	
			System.out.print("\nNHAP VI TRI CAN XOA: ");
			ViTriXoa = sc.nextInt();
			if (!check(ViTriXoa, n)) {
				System.out.println("VI TRI THEM KHONG HOP LE! NHAP LAI: ");
			}
		} while (!check(ViTriXoa, n));
		n--;
		ViTriXoa--;
		for (int i = ViTriXoa; i < n; i++) {
			a[i] = a[i + 1];
		}
		xuat(a, n);
	}

	public static void main(String[] args) {
		System.out.print("NHAP SO LUONG PHAN TU: ");
		int n = sc.nextInt();
		// khai bao gia tri mang = n+1 de khong can tao mang moi khi them
		int[] a = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		them(a, n);
	

	}
}
