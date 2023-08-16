import java.util.Scanner;

public class Bai3 {
	public static Scanner sc = new Scanner(System.in);

	static void Xuat_mang(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void Bubble_sort(int a[], int n) {
		int tg;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					tg = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tg;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("NHAP SO LUONG PHAN TU: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Bubble_sort(a, n);
		System.out.print("\nMang vua sap xep tang dan la: ");
		Xuat_mang(a, n);
	}
}
