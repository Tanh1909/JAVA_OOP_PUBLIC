import java.util.Scanner;

public class Bai4 {
	 static void check_word(String list_a[]){
	        int count=0;
	        int len= list_a.length;

	        for(int i=0; i<len/2; i++){
	            if(list_a[i].equals(list_a[len-i-1])){
	                count++;
	            }
	        }

	        if(count== len/2){
	            System.out.print("\nTrue");
	        }else {
	            System.out.print("\nFalse");
	        }
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap chuoi la: ");
	        String a = sc.nextLine();
	        System.out.print("Chuoi vua nhap la: "+a);

	        String[] list_a = a.trim().split("");

	        check_word(list_a);



	    }
}
