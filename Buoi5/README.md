# NỘI DUNG
- Getter và setter
- constructor
- this và super
- quan hệ HAS-A
- nạp chồng phương thức
- static, final (xem lại các file md lúc trước anh gửi)
## Getter và setter là gì?

---

Getter và setter là 2 phương thức thường dùng để truy xuất/cập nhật giá trị của một biến, ngoài ra, getter và setter còn được gọi là phương thức accessor và mutator trong Java. Dưới đây là một ví dụ đơn giản về getter, setter:

```
public class Demo {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
```
Ở ví dụ trên, chúng ta có một biến private là number, bởi vì number là private, mã bên ngoài class không thể truy cập trực tiếp tới nó

Để truy cập được tới number, mã bên ngoài sẽ phải gọi hàm getNumber() và setNumber() để đọc/cập nhật giá trị. Ví dụ:
```
public class App {
    public static void main(String[] args) throws Exception {
        Demo demo = new Demo();

        demo.setNumber(10); // update number
        System.out.println(demo.getNumber()); // get number
    }
}
```
## Tại sao lại cần getter và setter?

---

- Bạn hoàn toàn có thể không dùng getter và setter, tuy nhiên khi đó, mọi thứ sẽ trở nên khá phiền phức. Một biến có thể được truy cập ở bất kỳ đâu trong mã, và bạn hoàn toàn không thể kiểm soát được cách mã bên ngoài truy xuất và cập nhật giá trị cho biến (tất nhiên bạn vẫn kiểm soát được nếu bạn tự viết toàn bộ mã và tự dùng )

- Đặc biệt hơn với những thông tin quan trọng, ví dụ số tiền trong tài khoản chẳng hạn, bạn sẽ cần phải kiểm soát cách một người có thể truy cập vào nó, và cách họ rút tiền khỏi tài khoản (bạn sẽ không muốn bất kỳ ai cũng có thể truy cập tài khoản ngân hàng của mình và rút số tiền thậm chí là lớn hơn số tiền bạn có đúng không?)

- Với getter và setter, bạn có thể kiểm soát cách mã bên ngoài truy cập tới một dữ liệu quan trọng, và cách cập nhật giá trị cho dữ liệu đó. Cùng xem ví dụ dưới dây về cập nhật số tiền trong tài khoản:

```
public class Demo {
    private long amount;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can not be less than 0");
        }

        this.amount = amount;
    }
}
```
Hàm setAmount() đảm bảo giá trị của amount luôn phải lớn hơn hoặc 0, và mã bên ngoài muốn truy cập tới amount bắt buộc phải thông qua getAmount(), setAmount():

![](https://media.techmaster.vn/api/static/bn95ibf0k7qnbj6f7lt0/buubuas51co41h2qd0m0)

Trong lập trình hướng đối tượng (OOP), tính đóng gói (encapsulation) là một trong những nguyên tắc cơ bản nhất. Việc ẩn một biến khỏi mã bên ngoài và triển khai getter, setter giúp đảm bảo tính đóng gói trong Java.

## CONSTRUCTOR

---

Constructor trong java là một dạng đặc biệt của phương thức được sử dụng để khởi tạo các đối tượng.

Java Constructor được gọi tại thời điểm tạo đối tượng. Nó khởi tạo các giá trị để cung cấp dữ liệu cho các đối tượng, đó là lý do tại sao nó được gọi là constructor.

### Các quy tắc tạo constructor trong java
Có 2 quy tắc cơ bản cho việc tạo constructor:

1. Tên constructor phải giống tên lớp chứa nó.
2. Constructor không có kiểu trả về tường minh.

### Các kiểu của java constructor
Có 2 kiểu của constructor

- Constructor mặc định (không có tham số truyền vào)
- Constructor tham số

![](https://viettuts.vn/images/java/cac-kieu-java-constructor.jpg)

#### Constructor mặc định trong java

Một constructor mà không có tham số được gọi là constructor mặc định.

Cú pháp của constructor mặc định:

ví dụ:

```
class Bike1 {  
    Bike1() {
        System.out.println("Bike is created");
    }  
    public static void main(String args[]) {  
       Bike1 b=new Bike1();  //output: Bike is created
    }  
}  
```
**Quy tắc: Nếu không có constructor trong một lớp, trình biên dịch sẽ tự động tạo một constructor mặc định trong lớp đó.**
![](https://viettuts.vn/images/java/tu-dong-tao-constructor-mac-dinh.jpg)
##### Mục đích của constructor mặc định là gì?
Constructor mặc định cung cấp các giá trị mặc định như 0, null, (tùy thuộc vào kiểu dữ liệu) ... tới đối tượng được khởi tạo.
```
class Student3{  
    int id;  
    String name;  
   
    void display() {
        System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]) {
        Student3 s1=new Student3();  
        Student3 s2=new Student3();  
        s1.display();  //output: 0 null
        s2.display();  //output: 0 null
    }  
}
```
**Giải thích**: Trong ví dụ trên, bạn không tạo bất kỳ constructor nào, vì vậy trình biên dịch tự động tạo một constructor mặc định cho bạn. Giá trị 0 và null được cung cấp bởi constructor mặc định đó.

#### Constructor tham số trong java
Một constructor có tham số truyền vào được gọi là constructor tham số.

Constructor tham số được sử dụng để cung cấp các giá trị khác nhau cho các đối tượng khác nhau.

ví dụ:
```
class Student4{  
    int id;  
    String name;  
       
    Student4(int i,String n) {  
        id = i;  
        name = n;  
    }  
    void display() {
        System.out.println(id+" "+name);
    }  
    
    public static void main(String args[]) {  
        Student4 s1 = new Student4(111,"Viet");  
        Student4 s2 = new Student4(222,"Tuts");  
        s1.display();  ///output 111 Viet
        s2.display();  ///output 222 Tuts
   }  
}  
```
## THIS VÀ SUPER

---

### THIS

#### Từ khóa this trong java có thể được dùng để tham chiếu tới biến instance của lớp hiện tại.

Nếu có sự trùng tên nhau giữa biến toàn cục và tham số khiến bạn bị phân vân. Từ khóa this sẽ giúp bạn giải quyết sự phân vân của bạn.

Bạn sẽ hiểu ra vấn đề nếu không dùng từ khóa this trong ví dụ sau:

```
public class Student10 {
    int id;
    String name;
 
    Student10(int id, String name) {
        id = id;
        name = name;
    }
 
    void display() {
        System.out.println(id + " " + name);
    }
 
    public static void main(String args[]) {
        Student10 s1 = new Student10(111, "Viet");
        Student10 s2 = new Student10(222, "Nam");
        s1.display(); //output: 0 null
        s2.display(); //output: 0 null
    }
}
```

Trong ví dụ trên, tên của tham số của Constructor Student10() trùng với tên của biến toàn cục đó là lý do tại sao cần phải sử dụng từ khóa this để phân biệt biến cục bộ và biến toàn cục.

Ví dụ dưới đây giải quyết vấn đề trên bằng cách sử dụng từ khóa this:

```
public class Student11 {
    int id;
    String name;
 
    Student11(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    void display() {
        System.out.println(id + " " + name);
    }
 
    public static void main(String args[]) {
        Student11 s1 = new Student11(111, "Viet");
        Student11 s2 = new Student11(222, "Nam");
        s1.display(); //output: 111 Viet
        s2.display(); //output: 222 Nam
    }
}
```
*Nếu biến cục bộ và biến toàn cục có tên khác nhau thì không cần sử dụng từ khóa this.*
Một số cách dùng khác của this (tham khảo thêm)
#### Sử dụng this() gọi Constructor của lớp hiện tại.
```
public class Student13 {
    int id;
    String name;
 
    Student13() {
        System.out.println("call Constructor mặc định");
    }
 
    Student13(int id, String name) {
        this(); // nó được sử dụng để gọi Constructor của lớp hiện tại
        this.id = id;
        this.name = name;
    }
 
    void display() {
        System.out.println(id + " " + name);
    }
 
    public static void main(String args[]) {
        Student13 e1 = new Student13(111, "Viet");
        Student13 e2 = new Student13(222, "Nam");
        e1.display();
        e2.display();
    }
}
```
>Quy tắc: this() phải được khai báo dòng lệnh đầu tiên trong Constructor.
#### Gọi phương thức của lớp hiện tại.
```
public class Example3 {
    void m() {
        System.out.println("Gọi phương thức bằng từ khóa this");
    }
 
    void n() {
        this.m();
    }
 
    void p() {
        n();// trình biên dịch sẽ thêm this để gọi phương thức n() như this.n()
    }
 
    public static void main(String args[]) {
        Example3 o1 = new Example3();
        o1.p();
    }
}
```
#### Sử dụng từ khóa this như một tham số của phương thức.
```
public class Example4 {
    void m(Example4 obj) {
        System.out.println("Hello Java");
    }
 
    void p() {
        m(this);
    }
 
    public static void main(String args[]) {
        Example4 o1 = new Example4();
        o1.p();
    }
}
```
## SUPER
---

Từ khóa super trong java là một biến tham chiếu được sử dụng để tham chiếu trực tiếp đến đối tượng của lớp cha gần nhất.

Bất cứ khi nào bạn tạo ra instance(thể hiển) của lớp con, một instance của lớp cha được tạo ra ngầm định, nghĩa là được tham chiếu bởi biến super.

Trong java, từ khóa super có 3 cách sử dụng như sau:

1. Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất.
2. super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
3. Từ khóa super được sử dụng để gọi trực tiếp phương thức của lớp cha.

### 1. Tham chiếu trực tiếp đến biến instance của lớp cha.

Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha.

```
class Vehicle {
    int speed = 50;
}
 
public class Bike2 extends Vehicle {
    int speed = 100;
 
    void display() {
        System.out.println(super.speed);//in speed của lớp Vehicle  
    }
 
    public static void main(String args[]) {
        Bike2 b = new Bike2();
        b.display(); //output: 50
 
    }
}
```
### 2. Sử dụng super() để gọi constructor lớp cha
Trong java, super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
```
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}
 
class Bike2 extends Vehicle {
    Bike2() {
        super();//gọi Constructor của lớp cha  
        System.out.println("Bike is created");
    }
 
    public static void main(String args[]) {
        Bike2 b = new Bike2();
        //output: Vehicle is created
        //Bike is created
    }
}
```
> Note: super() được tự động thêm vào mỗi Constructor của class bởi trình biên dịch.

Như chúng ta đã biết Constructor được tạo ra tự động bởi trình biên dịch nhưng nó cũng thêm super() vào câu lệnh đầu tiên. Nếu bạn tạo Constructor và bạn không có this() hoặc super() ở dòng lệnh đầu tiên, trình biên dịch sẽ cung cấp super() của Constructor.
![](https://viettuts.vn/images/java/tu-khoa-super-trong-java-1.jpg)

Một ví dụ khác của từ khóa super nơi super() được cung cấp ngầm định bởi trình biên dịch.
```
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}
 
public class Bike6 extends Vehicle {
    int speed;
 
    Bike6(int speed) {
        this.speed = speed;
        System.out.println(speed);
    }
 
    public static void main(String args[]) {
        Bike6 b = new Bike6(10);
        //output Vehicle is created
        // 10
    }
}
```
### 2. super được sử dụng để gọi trực tiếp phương thức của lớp cha.

Từ khóa super cũng có thể được sử dụng để gọi phương thức của lớp cha. Nó nên được sử dụng trong trường hợp lớp chứa các phương thức tương tự như lớp cha như trong ví dụ dưới đây:
```
class Person {
    void message() {
        System.out.println("welcome");
    }
}
 
public class Student16 extends Person {
    void message() {
        System.out.println("welcome to java");
    }
 
    void display() {
        message();// gọi phương thức message() của lớp hiện tại
        super.message();// gọi phương thức message() của lớp cha
    }
 
    public static void main(String args[]) {
        Student16 s = new Student16();
        s.display();
    }
}
```
## Quan hệ HAS-A trong Java

---

Trong lập trình hướng đối tượng, quan hệ "has-a" thể hiện mối quan hệ giữa hai lớp, trong đó một đối tượng của lớp A "có" một đối tượng của lớp B như một phần của nó. Điều này thường được thể hiện bằng cách sử dụng thành viên dữ liệu của một lớp như một đối tượng của một lớp khác. Mối quan hệ "has-a" còn được gọi là mối quan hệ hợp thành (composition) hoặc sở hữu (ownership).

ví dụ:

```
// Lớp đại diện cho Địa chỉ
class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    // Các phương thức getter và setter khác...
}

// Lớp đại diện cho Người
class Person {
    private String name;
    private int age;
    private Address address; // Mối quan hệ has-a với lớp Address

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Các phương thức getter và setter khác...

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState());
    }
}

public class Main {
    public static void main(String[] args) {
        Address personAddress = new Address("123 Main St", "Cityville", "Stateville");
        Person person = new Person("Alice", 30, personAddress);

        person.displayInfo();
    }
}
```
Trong ví dụ trên, lớp Person có một thuộc tính address kiểu Address, thể hiện mối quan hệ "has-a" giữa lớp Person và lớp Address. Mỗi đối tượng Person "có" một đối tượng Address liên quan đến địa chỉ của người đó.

Lợi ích của mối quan hệ "has-a" là bạn có thể tổ chức và quản lý thông tin phức tạp hơn bằng cách tạo ra các thành phần nhỏ hơn và kết hợp chúng lại thành các đối tượng lớn hơn.

## Mảng đối tượng (mảng tĩnh)

---

Mảng đối tượng trong Java cho phép bạn lưu trữ và quản lý nhiều đối tượng của cùng một kiểu dữ liệu trong một cấu trúc dữ liệu mảng. Dưới đây là cách sử dụng mảng đối tượng trong Java:


### Khai báo và khởi tạo mảng đối tượng:
Để khai báo và khởi tạo một mảng đối tượng, bạn cần chỉ định kiểu dữ liệu của đối tượng và kích thước của mảng. Sau đó, bạn cần tạo và gán các đối tượng vào từng phần tử của mảng.

> các thao tác với mảng đối tượng tương tự với mảng thông thường. Lưu ý ở mảng đối tượng là phải khởi tạo đối tượng cho từng phần tử trong mảng với toán tử **new**.

ví dụ:
```
// Khai báo và khởi tạo mảng đối tượng kiểu Person với kích thước 3
Person[] people = new Person[3];

// Khởi tạo các đối tượng 
for(int i=0;i<3;i++){
    people[i]=new people();
}
```

### Nạp chồng phương thức

---
Nạp chồng phương thức (method overloading) trong Java là một khái niệm cho phép bạn định nghĩa nhiều phương thức có cùng tên trong cùng một lớp, nhưng với số lượng và kiểu tham số khác nhau. Khi gọi phương thức, Java sẽ xác định phương thức cần thực thi dựa trên số lượng và kiểu tham số được truyền vào.

Để thực hiện nạp chồng phương thức, bạn cần tuân thủ các quy tắc sau:

1. **Tên phương thức phải giống nhau:** Các phương thức cùng tên.

2. **Số lượng tham số khác nhau hoặc kiểu tham số khác nhau:** Các phương thức nạp chồng phải có số lượng tham số khác nhau hoặc ít nhất một kiểu tham số khác nhau. Kiểu tham số cũng có thể khác nhau.

3. **Kiểu trả về không quan trọng:** Kiểu trả về của phương thức không được xem xét trong việc xác định phương thức cần gọi.

Dưới đây là ví dụ về nạp chồng phương thức:

```
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5, 10));           // Gọi phương thức add(int, int)
        System.out.println(calculator.add(3.5, 2.7));       // Gọi phương thức add(double, double)
        System.out.println(calculator.add("Hello, ", "world!")); // Gọi phương thức add(String, String)
    }
}
```

Trong ví dụ này, lớp `Calculator` có ba phương thức `add` với các kiểu tham số khác nhau (int, double, String). Khi gọi phương thức `add`, Java sẽ xác định phương thức cần thực thi dựa trên kiểu tham số truyền vào.

Nạp chồng phương thức giúp làm cho mã nguồn dễ đọc và linh hoạt hơn, vì bạn có thể đặt cùng một tên phương thức cho các hành vi tương tự nhưng với đầu vào khác nhau.


## TÀI LIỆU THAM KHẢO

- https://techmaster.vn/posts/36135/java-getter-va-setter
- https://viettuts.vn/java/constructor-trong-java
- https://viettuts.vn/java/tu-khoa-this-trong-java
- https://viettuts.vn/java/tu-khoa-super-trong-java