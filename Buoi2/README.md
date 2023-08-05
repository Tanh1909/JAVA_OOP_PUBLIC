# Cấu Trúc chương trình
Một chương trình Java được viết dưới dạng các lớp (classes) và phải tuân theo cấu trúc cơ bản sau đây:
1.  Khai báo gói (Package declaration): Một chương trình Java có thể được đặt trong một gói (package) để quản lý mã nguồn và tránh xung đột tên lớp. Nếu không có khai báo gói, chương trình sẽ nằm trong gói mặc định.
>package mypackage; // Khai báo gói (tùy chọn)
2. Khai báo lớp (Class declaration): Một chương trình Java bắt buộc phải có ít nhất một lớp. Lớp chứa các trường (fields) và phương thức (methods) để xác định hành vi của chương trình.
```
public class MyClass {
    // Các trường (fields) và phương thức (methods) của lớp
}
```
3. Phương thức main: Phương thức main là điểm bắt đầu thực thi của chương trình Java. Nó phải có cú pháp như sau:
```
public static void main(String[] args) {
    // Thân của phương thức main - điểm bắt đầu thực thi của chương trình
}
```
### Ví dụ
```
package mypackage;

public class MyClass {
    // Các trường (fields) và phương thức (methods) của lớp (tùy chọn)

    public static void main(String[] args) {
        // Thực hiện các tác vụ và gọi các phương thức khác (tùy chọn)
        System.out.println("Hello, world!");
    }
}
```
# Các loại biến trong ngôn ngữ java và cách khai báo
### Các loại biến
```
String : dùng để lưu các giá trị văn bản. Ví dụ :"Hello world!"
int : dùng để lưu các giá trị số nguyên. Ví dụ: 1234
float : dùng để lưu các giá trị số thập phân. Ví dụ: 3.14
char : dùng để lưu 1 ký tự ví dụ ký tự a hoặc b
boolean : dùng để lưu giá trị đúng hay sai.
```
### Khai báo biến
cú pháp để khai báo biến như sau
```
type variableName = value;
ví dụ: int a=5;
```
Chúng ta cũng có thể khai báo biến chưa có giá trị mặc định
>ví dụ: String a;
### Phạm vi biến
#### Biến cục bộ (Local variable)
Biến cục bộ được định nghĩa là một loại biến được khai báo trong khối lập trình hoặc các chương trình con. Nó chỉ có thể được sử dụng bên trong chương trình con hoặc khối mã mà nó được khai báo
ví dụ:
```
public class LocalVariableExample {
    public void printNumber() {
        int x = 10; // Biến cục bộ "x" được khai báo trong phương thức "printNumber"
        System.out.println("The value of x is: " + x);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.printNumber(); // Gọi phương thức printNumber()
        // Biến "x" không thể truy cập ở đây vì đã ra khỏi phạm vi hoạt động của printNumber()
    }
}
```
### Biến toàn cục(Global variable)
Biến toàn cục là những biến được khai báo bên ngoài phương thức và khối lệnh, thường được định nghĩa tại mức lớp (trong lớp, ngoài các phương thức). Chúng có phạm vi hoạt động trong toàn bộ lớp và có thể được truy cập từ bất kỳ phương thức hoặc khối lệnh nào trong lớp đó.
```
public class GlobalVariableExample {
    // Biến toàn cục "y" được khai báo trong lớp
    // và có thể truy cập từ mọi phương thức trong lớp này
    int y = 20;

    public void printNumber() {
        System.out.println("The value of y is: " + y); // Truy cập biến toàn cục "y"
    }

    public static void main(String[] args) {
        GlobalVariableExample example = new GlobalVariableExample();
        example.printNumber(); // Gọi phương thức printNumber()
        System.out.println("The value of y is: " + example.y); // Truy cập biến toàn cục "y"
    }
}
```
###### Lưu ý rằng việc sử dụng biến toàn cục không được khuyến khích, vì nó có thể gây ra các vấn đề về quản lý mã nguồn và gỡ lỗi. Thay vào đó, nên sử dụng biến cục bộ 
trong phạm vi cần thiết để giảm thiểu tác động của các biến đến phạm vi khác.
### Biến tĩnh (static variable) (Buổi học tiếp theo anh sẽ nói rõ hơn về phần này nhé.)
Trong Java, biến tĩnh (static variable) là các biến thuộc về lớp, không phải của các đối tượng cụ thể của lớp đó. Điều này có nghĩa là biến tĩnh chỉ tồn tại một bản sao duy nhất và chia sẻ chung cho tất cả các đối tượng của lớp đó. Khi giá trị của biến tĩnh được thay đổi, tất cả các đối tượng của lớp đó đều thấy sự thay đổi.
- Biến static được khai báo trong một class với từ khóa "static", phía bên ngoài các phương thức, constructor và block.
- Sẽ chỉ có duy nhất một bản sao của các biến static được tạo ra, dù bạn tạo bao nhiêu đối tượng từ lớp tương ứng.
- Biến static được lưu trữ trong bộ nhớ static riêng.
- Biến static được tạo khi chương trình bắt đầu chạy và chỉ bị hủy khi chương trình dừng.
```
public class StaticVariableExample {
    // Biến tĩnh "count" thuộc về lớp và không phải của các đối tượng cụ thể
    // Mỗi đối tượng không tạo ra bản sao riêng của "count"
    static int count = 0;

    public StaticVariableExample() {
        count++; // Mỗi khi tạo ra một đối tượng mới, biến "count" tăng lên
    }

    public static void main(String[] args) {
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        // Các đối tượng obj1, obj2, obj3 chia sẻ cùng một bản sao của biến tĩnh "count"
        System.out.println("Total objects created: " + count); // Output: 3
    }
}
```
### Hằng số(Constant)
- Hằng số là những giá trị không bao giờ thay đổi trong suốt quá trình sử dụng, là một giá trị bất biến trong chương trình.
- Nếu bạn cố ý thay đổi giá trị của Constant thì sẽ xảy ra lỗi.
###### Sử dụng từ khóa static final: Từ khóa static được sử dụng để khai báo hằng số cấp lớp, điều này cho phép truy cập hằng số trực tiếp thông qua tên lớp mà không cần tạo đối tượng.
```
public class ConstantsExample {
    public static final int MAX_VALUE = 100; // Hằng số số nguyên
    public static final double PI = 3.14159; // Hằng số số thực

    public static void main(String[] args) {
        // Gọi hằng số trực tiếp thông qua tên lớp
        System.out.println("Max value: " + ConstantsExample.MAX_VALUE);
        System.out.println("PI value: " + ConstantsExample.PI);
    }
}
```
### Quy tắc đặt tên biến
1. Biến phải bắt đầu bằng một chữ cái (a-z hoặc A-Z) hoặc dấu gạch dưới (_) và không được bắt đầu bằng một con số.

2. Tên biến chỉ có thể chứa các chữ cái (a-z hoặc A-Z), chữ số (0-9) và dấu gạch dưới (_). Không được sử dụng các ký tự đặc biệt như !, @, #, $, v.v. trong tên biến.

3. Tên biến nên có ý nghĩa và mô tả rõ ràng về mục đích sử dụng của biến. Hãy tránh sử dụng tên biến không rõ ràng như a, b, x, y v.v. Dùng tên biến có ý nghĩa giúp mã nguồn dễ đọc và dễ hiểu.

4. Nếu tên biến gồm nhiều từ, hãy sử dụng dấu gạch dưới (_) hoặc viết hoa từ đầu tiên của mỗi từ (camelCase) để làm nổi bật và giữ cho tên biến đọc dễ hiểu.

5. Tên biến nên được viết bằng chữ thường (lowercase) vì Java phân biệt chữ hoa và chữ thường. Tuy nhiên, hằng số thường được viết hoàn toàn bằng chữ in hoa và các từ được phân cách bằng dấu gạch dưới (_).

6. Tránh sử dụng các từ khóa của Java như int, double, if, while v.v. làm tên biến.
#Toán tử

Java hỗ trợ nhiều loại phép toán tử để thực hiện các phép tính và các tác vụ khác nhau. Dưới đây là danh sách các phép toán tử cơ bản trong Java:
```
- Phép toán số học:
+: Phép cộng
-: Phép trừ
*: Phép nhân
/: Phép chia
%: Phép chia lấy phần dư
- Phép toán gán:
=: Gán giá trị cho biến
Phép toán tăng/giảm:
++: Tăng giá trị biến lên một đơn vị
--: Giảm giá trị biến đi một đơn vị
- Phép toán logic:
&&: Phép AND logic
||: Phép OR logic
!: Phép NOT logic
- Phép toán so sánh:
==: So sánh bằng
!=: So sánh khác
\>: So sánh lớn hơn
<: So sánh nhỏ hơn
\>=: So sánh lớn hơn hoặc bằng
<=: So sánh nhỏ hơn hoặc bằng
- Phép toán ba ngôi (ternary operator):
condition ? value1 : value2: Trả về value1 nếu condition đúng, ngược lại trả về value2
```
##### Ví dụ từng toán tử
```
int a = 10;
int b = 5;

int sum = a + b; // sum = 15
int difference = a - b; // difference = 5
int product = a * b; // product = 50
int quotient = a / b; // quotient = 2
int remainder = a % b; // remainder = 0

a++; // a tăng lên thành 11
b--; // b giảm xuống thành 4

int result = (a > b) ? a : b; // result = 11

```
# Rẽ nhánh
## if
- Câu lệnh if: Sử dụng để thực hiện một khối mã nếu một điều kiện được thỏa mãn (đúng) còn không sẽ thực thi khối lệnh ở else
```
int x = 10;
if (x > 5) {
    System.out.println("x lớn hơn 5.");
} else {
    System.out.println("x không lớn hơn 5.");
}
```
-   Câu lệnh else if: Sử dụng để thêm một điều kiện phụ để kiểm tra nếu điều kiện trước đó không đúng.
```
int score = 80;
if (score >= 90) {
    System.out.println("Xuất sắc!");
} else if (score >= 80) {
    System.out.println("Giỏi.");
} else if (score >= 70) {
    System.out.println("Khá.");
} else {
    System.out.println("Trung bình hoặc yếu.");
}
```
## switch
- Câu lệnh switch: Sử dụng để kiểm tra giá trị biến và thực hiện các hành động tương ứng với các giá trị đã xác định.
```
int dayOfWeek = 3;
switch (dayOfWeek) {
    case 1:
        System.out.println("Chủ nhật");
        break;
    case 2:
        System.out.println("Thứ hai");
        break;
    case 3:
        System.out.println("Thứ ba");
        break;
    // ...
    default:
        System.out.println("Không hợp lệ");
}
```
# Vòng lặp
## for
Vòng lặp for: Sử dụng để lặp lại một khối mã với một số lần xác định.
```
for (int i = 1; i <= 5; i++) {
    System.out.println("Lần lặp thứ " + i);
}

```
## while
Vòng lặp while: Sử dụng để lặp lại một khối mã trong khi một điều kiện cụ thể đúng.
```
int i = 1;
while (i <= 5) {
    System.out.println("Lần lặp thứ " + i);
    i++;
}
```
### do-while
Vòng lặp do-while: Sử dụng để lặp lại một khối mã ít nhất một lần và tiếp tục lặp lại trong khi một điều kiện cụ thể đúng.
```
int i = 1;
do {
    System.out.println("Lần lặp thứ " + i);
    i++;
} while (i <= 5);

```
