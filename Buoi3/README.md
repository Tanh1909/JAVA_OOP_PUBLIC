## MẢNG
### KHAI BÁO MẢNG
> Trong Java, mảng là một cấu trúc dữ liệu dùng để lưu trữ một tập hợp các giá trị cùng kiểu dữ liệu. Mảng trong Java có một kích thước cố định và được khai báo bằng cách sử dụng cú pháp sau:
#### Mảng 1 chiều
> <kiểu_dữ_liệu>[] tên_mảng; // Cách khai báo mảng 1 chiều

> <kiểu_dữ_liệu> tên_mảng[]; // Cách khai báo mảng 1 chiều (cách này ít phổ biến hơn)

Ví dụ:
```
int[] numbers; // Khai báo mảng kiểu int

int[] numbers = new int[5]; // Tạo mảng kiểu int với kích thước 5

int[] numbers = new int[5]; // Tạo mảng kiểu int với kích thước 5

int[] numbers = {1, 2, 3, 4, 5}; // Khai báo mảng và khởi tạo giá trị ban đầu
```
#### Mảng 2 chiều
Đối với mảng hai chiều hoặc nhiều chiều, cú pháp tương tự như trên, nhưng bạn cần chỉ định kích thước cho từng chiều của mảng:
```
<kiểu_dữ_liệu>[][] tên_mảng; // Cách khai báo mảng 2 chiều

int[][] matrix; // Khai báo mảng hai chiều kiểu int

int[][] matrix = new int[3][4]; // Tạo mảng 2 chiều với 3 hàng và 4 cột
```
### CÁC PHƯƠNG PHÁP DUYỆT MẢNG
ở đây mình sẽ chỉ nêu các phương pháp duyệt mảng hay sử dụng. Có rất nhiều phương pháp duyệt mảng khác nhau nữa các bạn có thể tìm hiểu thêm.
1. Sử dụng vòng lặp for (hoặc while<Không thông dụng>):
Phương pháp này sử dụng vòng lặp for để duyệt qua từng phần tử của mảng theo thứ tự từ đầu đến cuối (hoặc ngược lại).
```
int[] numbers = {1, 2, 3, 4, 5};

for (int i = 0; i < numbers.length; i++) {
    int element = numbers[i];
    // Xử lý phần tử element ở vị trí i
    System.out.println(element);
}

```
2. Sử dụng vòng lặp foreach:
Vòng lặp foreach giúp duyệt qua từng phần tử của mảng một cách thuận tiện. Không cần phải quan tâm đến chỉ số, chỉ cần lấy giá trị của từng phần tử.
-   cú pháp
```
for (ClassName element : array) {
    // element là phần tử của mảng
}
```
```
int[] numbers = {1, 2, 3, 4, 5};

for (int element : numbers) {
    // Xử lý phần tử element
    System.out.println(element);
}

```
## HÀM
> Hàm là một khối mã thực hiện một tác vụ cụ thể. Hàm được định nghĩa để thực hiện một công việc nhất định và có thể tái sử dụng trong các phần khác của chương trình. Trong Java, hàm được khai báo bên trong một lớp.

Cú pháp khai báo hàm trong Java:
```
<phạm_vi> <kiểu_dữ_liệu_đối_tượng> tên_hàm(<tham_số>...) {
    // Các câu lệnh thực hiện công việc của hàm
    return <giá_trị_trả_về>;
}
```
Trong đó:
- <phạm_vi> xác định phạm vi truy cập của hàm (public, private, protected hoặc mặc định).
- <kiểu_dữ_liệu_đối_tượng> xác định kiểu dữ liệu của giá trị mà hàm trả về. Nếu hàm không trả về giá trị nào, bạn có thể sử dụng kiểu dữ liệu void.
tên_hàm là tên của hàm.
- <tham_số>... là danh sách các tham số được truyền vào hàm (nếu có).
- return <giá_trị_trả_về>; là câu lệnh trả về giá trị của hàm (nếu có).
### Truyền tham số
Phần này có rất nhiều vấn đề, nói ở đây sẽ rất dài mọi người có thể tìm hiểu thêm ở [link này](https://yellowcodebooks.com/2021/06/14/lam-ban-ve-tham-chieu-tham-tri-trong-java/).
Mình sẽ chỉ nói kết luận
> Java chỉ hỗ trợ việc truyền tham số kiểu Tham trị mà thôi, mặc dù với việc truyền dữ liệu kiểu đối tượng có phần gây tranh cãi với nhiều người

ví dụ:
```
public static void main(String[] args) {
    int x = 10;

    System.out.println("Before call process: " + x);
    process(x);
    System.out.println("After call process: " + x);
}

public static void process(int x) {
    x = 7;
}
```
Màn hình Console:
```
Before call process: 10
After call process: 10
```
Trên đây là ví dụ rõ ràng nhất cho khái niệm truyền kiểu Tham trị vào phương thức. Vậy truyền theo kiểu Tham trị là gì. Đó là việc truyền tham số trong trường hợp trên đây, nó chỉ là sự sao chép giá trị khi tham số được truyền vào trong một phương thức. x trước khi truyền vào trong phương thức process() mang giá trị 10. Còn x bên trong process() không phải x ở ngoài, nó chỉ là một biến khác được sao chép ra, cũng mang tên x, cũng mang giá trị 10, nhưng không còn là x ở ngoài nữa. Do đó dù bên trong process() chúng ta có thay đổi x như thế nào thì cũng không ảnh hưởng với x bên ngoài.

### hàm static
vấn đề static với final thì mình sẽ nói riêng ở 1 phần. Trong buổi hôm nay thì mình sẽ chỉ nêu về hàm (phương thức) static.
> Hàm static trong Java là một loại hàm đặc biệt, có thể được gọi mà không cần tạo đối tượng của lớp chứa hàm. Điều này có nghĩa là bạn có thể gọi hàm static trực tiếp từ tên lớp, không cần tạo một thể hiện (instance) của lớp đó.

Cú pháp khai báo:
```
<phạm_vi> static <kiểu_dữ_liệu_đối_tượng> tên_hàm(<tham_số>...) {
    // Các câu lệnh thực hiện công việc của hàm
    return <giá_trị_trả_về>;
}
```
ví dụ:
```
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public static void main(String[] args) {

    int sum = MathUtils.add(2, 3);

    double area = MathUtils.calculateCircleArea(5.0);
}
```
Trong ví dụ trên, hai hàm add và calculateCircleArea được khai báo là static. Bạn có thể gọi các hàm này trực tiếp từ tên lớp MathUtils mà không cần phải khởi tạo đối tượng MathUtils
##### Một số đặc điểm của phương thức static
* Một phương thức static thuộc lớp chứ không phải đối tượng của lớp.
* Một phương thức static có thể được gọi mà không cần tạo khởi tạo (instance) của một lớp.
* Phương thức static có thể truy cập biến static và có thể thay đổi giá trị của nó.
* Một phương thức static chỉ có thể gọi một phương thức static khác, không thể gọi được một phương thức non-static.
* Một phương thức static không thể được sử dụng từ khóa this và super.
* Người dùng không thể override (đè) phương thức static trong Java, bởi vì kỹ thuật đè (overriding) phương thức được dựa trên quá trình gán (binding) động khi khi chương trình đang chạy (runtime) và những phương thức static  được gán tĩnh trong thời gian biên dịch. Phương thức tĩnh không ràng buộc với thực thể của lớp nên phương thức tĩnh sẽ không thể override (đè).
## HẰNG
Vấn đề final tương tự như static sẽ nói riêng ở phần khác. Hiện tại mình sẽ giới thiệu 1 chút về final có trong buổi học
> Từ khóa final trong Java được sử dụng để hạn chế thao tác của người dùng.

###### Biến final: khi một biến được khai báo với từ khoá final, nó chỉ chứa một giá trị duy nhất trong toàn bộ chương trình (hay dễ hiểu hơn gọi là biến hằng).
-  Trong Java, biến có thể được khai báo cùng với từ khóa static, và lúc đó bạn sẽ không thể thay đổi giá trị của biến final (nó được gọi là hằng số).
cú pháp:
> final <kiểu_dữ_liệu> TÊN_HẰNG = GIÁ_TRỊ;

ví dụ:
```
public class FinalVariableExample {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        // MAX_SIZE = 200; // Không thể gán giá trị mới cho biến final
        System.out.println(MAX_SIZE);
    }
}
```
### KẾT HỢP STATIC VÀ FINAL
Trong Java, static final là hai từ khóa được sử dụng để định nghĩa một hằng số (constant). Dưới đây là một số điểm quan trọng về cách chúng hoạt động:
1. static: Từ khóa static được sử dụng để khai báo biến hoặc phương thức thuộc về lớp chứ không phải từng đối tượng cụ thể của lớp đó. Điều này có nghĩa là giá trị của biến static là chung cho tất cả các đối tượng của lớp, và chỉ có một bản sao duy nhất của phương thức static trong bộ nhớ, dù có bao nhiêu đối tượng của lớp đó được tạo ra.
2. final: Từ khóa final được sử dụng để chỉ định rằng biến, phương thức hoặc lớp không thể thay đổi sau khi đã được khởi tạo hoặc định nghĩa. Đối với biến, nó có nghĩa là giá trị của biến không thể thay đổi sau khi gán một giá trị ban đầu.
> Kết hợp hai từ khóa này tạo thành một hằng số (constant) trong Java

ví dụ:
```
public class MyClass {
    // Static final constant
    public static final int MY_CONSTANT = 10;

    // Static method
    public static void myStaticMethod() {
        // You can use the static final constant here
        System.out.println("My constant value is: " + MY_CONSTANT);
    }
}
```
Một số lưu ý:
* Tên của hằng số thường được viết hoa và các từ cách nhau bằng dấu gạch dưới (snake_case).
* Hằng số static final nên được khởi tạo ngay khi khai báo hoặc trong khối tĩnh (static block) của lớp. --> khối static là gì thì mình sẽ nói riêng ở bài static
* Hằng số không thể thay đổi giá trị sau khi đã được khởi tạo, điều này đảm bảo tính không thay đổi và an toàn của các giá trị hằng số trong chương trình Java.
## THƯ VIỆN TOÁN HỌC MATH
Trong Java, thư viện toán học Math cung cấp các phương thức tĩnh (static methods) để thực hiện các phép tính toán số học cơ bản. Thư viện Math là một phần của gói java.lang nên không cần import bổ sung để sử dụng. Dưới đây là một số phương thức quan trọng được cung cấp bởi thư viện Math:

1. Các phương thức tính toán cơ bản:
* Math.abs(x): Trả về giá trị tuyệt đối của x.
* Math.ceil(x): Làm tròn lên số nguyên gần nhất lớn hơn hoặc bằng x.
* Math.floor(x): Làm tròn xuống số nguyên gần nhất nhỏ hơn hoặc bằng x.
* Math.round(x): Làm tròn x đến số nguyên gần nhất. Nếu số chữ số thập phân 0.5 hoặc lớn hơn, thì làm tròn lên, ngược lại làm tròn xuống.
2. Các phương thức tính toán lũy thừa và căn bậc hai:
* Math.pow(a, b): Trả về giá trị của a mũ b.
* Math.sqrt(x): Trả về căn bậc hai của x.
3. Các phương thức trả về giá trị lớn nhất và nhỏ nhất:
* Math.max(a, b): Trả về giá trị lớn nhất giữa a và b.
* Math.min(a, b): Trả về giá trị nhỏ nhất giữa a và b.
Để sử dụng các phương thức trong thư viện Math, bạn chỉ cần gọi tên phương thức kèm theo các tham số tương ứng. Ví dụ:
```
public class MathExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        double squareRoot = Math.sqrt(a);
        double random = Math.random();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Square root of " + a + ": " + squareRoot);
        System.out.println("Random number: " + random);
    }
}
```
##### Chú ý rằng tất cả các phương thức trong lớp Math là static, vì vậy bạn không cần tạo đối tượng của lớp Math để sử dụng chúng.
## STRING
###### Về String thì có String, StringBuilder, StringBuffer bài học này mình chỉ nói về String còn việc so sánh mình sẽ làm riêng
Trong Java, String là một lớp (class) đặc biệt được sử dụng để làm việc với chuỗi ký tự. Một chuỗi là một tập hợp các ký tự liên tiếp trong Java và đại diện cho một dãy các ký tự được sắp xếp theo một thứ tự cụ thể.

Lớp String thuộc gói java.lang, nên không cần import bổ sung để sử dụng nó trong mã Java. Dưới đây là một số thông tin quan trọng về lớp String:

1. Khởi tạo chuỗi:
* Sử dụng cặp dấu nháy kép " " để khởi tạo một chuỗi có giá trị cụ thể, ví dụ: "Hello, World!".
* Sử dụng từ khóa new để tạo đối tượng String, nhưng cách này ít được sử dụng vì sự tiện lợi của việc sử dụng cặp dấu nháy kép.
2. Đối tượng chuỗi là bất biến (immutable):
* Điều này có nghĩa là một khi tạo một đối tượng chuỗi, nó không thể thay đổi giá trị của mình. Bất kỳ thay đổi nào đều tạo ra một đối tượng chuỗi mới.
3. Các phương thức quan trọng của lớp String:
* length(): Trả về độ dài của chuỗi (số lượng ký tự).
* charAt(index): Trả về ký tự ở vị trí chỉ mục (index) trong chuỗi (bắt đầu từ 0).
* substring(beginIndex): Trả về một phần của chuỗi, bắt đầu từ vị trí chỉ mục beginIndex đến cuối chuỗi.
* substring(beginIndex, endIndex): Trả về một phần của chuỗi, bắt đầu từ vị trí chỉ mục beginIndex và kết thúc tại vị trí chỉ mục endIndex - 1.
* concat(str): Nối chuỗi hiện tại với chuỗi str.
* indexOf(str): Trả về vị trí đầu tiên của chuỗi str trong chuỗi hiện tại. Nếu không tìm thấy, trả về -1.
* lastIndexOf(str): Trả về vị trí cuối cùng của chuỗi str trong chuỗi hiện tại. Nếu không tìm thấy, trả về -1.
* startsWith(prefix): Kiểm tra xem chuỗi có bắt đầu bằng prefix hay không.
* endsWith(suffix): Kiểm tra xem chuỗi có kết thúc bằng suffix hay không.
* toLowerCase(): Chuyển đổi tất cả các ký tự trong chuỗi thành chữ thường.
* toUpperCase(): Chuyển đổi tất cả các ký tự trong chuỗi thành chữ hoa.
* trim(): Loại bỏ các khoảng trắng ở đầu và cuối chuỗi.

ví dụ:
```
public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        
        // Length
        int length = str1.length();
        System.out.println("Length of str1: " + length);
        
        // Char at index
        char ch = str1.charAt(7);
        System.out.println("Character at index 7: " + ch);
        
        // Substring
        String subStr = str2.substring(5, 9);
        System.out.println("Substring of str2: " + subStr);
        
        // Concatenation
        String result = str1.concat(" I love Java.");
        System.out.println("Concatenated string: " + result);
        
        // Index of
        int index = str2.indexOf("Pro");
        System.out.println("Index of 'Pro' in str2: " + index);
        
        // Starts with
        boolean startsWithHello = str1.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        
        // Ends with
        boolean endsWithWorld = str1.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWithWorld);
    }
}
```
> Đối với các thao tác phức tạp với chuỗi, Java cung cấp lớp StringBuilder và StringBuffer, là các lớp có thể sửa đổi (mutable) được sử dụng để làm việc hiệu quả với chuỗi có sự thay đổi nội dung thường xuyên. Tuy nhiên, trong hầu hết các trường hợp, việc sử dụng lớp String là đủ đơn giản và hiệu quả.