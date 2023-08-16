import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bonus {
	public static Scanner sc=new Scanner(System.in);
	//cach viet khong dung split
	public static String upperCaseFirst(String s) {
		return (s.charAt(0)+"").toUpperCase()+s.substring(1).toLowerCase();
	}
	public static List<String> xuLy(String s) {
		s=s.trim();
		List<String> words=new ArrayList<>();
		int index=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				words.add(upperCaseFirst(s.substring(index,i)));
				while(s.charAt(i)==' ') {
					i++;
				}
				index=i;
			}
		}
		words.add(upperCaseFirst(s.substring(index)));
		return words;
	}
	public static void formatTen(String s) {
		List<String> words=xuLy(s);
		for(String x:words) {
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		System.out.print("NHAP VAO HO TEN: ");
		String s=sc.nextLine();
		formatTen(s);
	}
}
