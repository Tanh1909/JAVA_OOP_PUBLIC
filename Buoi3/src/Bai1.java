import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai1 {
	public static Scanner sc = new Scanner(System.in);
	public static Map<Integer, Integer> m = new TreeMap<>();
	public static int[] b;

	public static void dem(int a[], int n) {
		for (int i = 0; i < n; i++) {
			if (m.containsKey(a[i])) {
				m.put(a[i], m.get(a[i]) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

	public static void main(String[] args) {
		System.out.print("NHAP SO LUONG PHAN TU: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			m.put(a[i], 0);
		}
		dem(a, n);

	}
}
