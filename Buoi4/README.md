# OOP

##  Lập trình hướng đối tượng (Oriented Object Programming - OOP) là gì?

---

Lập trình hướng đối tượng (Oriented Object Programming - OOP) là một phương pháp lập trình trong đó chương trình được tổ chức và triển khai dưới dạng các "đối tượng". Mỗi đối tượng đại diện cho một thực thể trong thế giới thực hoặc một khái niệm trong bài toán cần giải quyết. OOP tập trung vào việc mô hình hóa thế giới thực bằng cách tạo ra các đối tượng, mỗi đối tượng có các thuộc tính (dữ liệu) và phương thức (hành vi) liên quan.

![](https://as1.ftcdn.net/v2/jpg/04/82/41/76/1000_F_482417602_F4qMc75cVZgs0iRI4W8iibBzL0Y0aJLN.jpg)

***Tại sao nên dùng OOP?***
=> OOP giúp cải thiện khả năng tái sử dụng mã, dễ dàng quản lý và bảo trì mã nguồn, cũng như tăng tính tương tác và hiểu rõ trong việc mô hình hóa và giải quyết vấn đề. Nhiều ngôn ngữ lập trình như Java, C++, Python đã tích hợp tính năng OOP để hỗ trợ việc phát triển phần mềm.
## CÁC KHÁI NIỆM QUAN TRỌNG TRONG OOP

---

###### 1. Lớp (Class): Là một khuôn mẫu để định nghĩa cách một đối tượng cụ thể sẽ hoạt động. Lớp chứa định nghĩa cho các thuộc tính và phương thức mà các đối tượng có thể sử dụng.

###### 2. Đối tượng (Object): Là một thực thể cụ thể được tạo ra từ một lớp cụ thể. Đối tượng bao gồm các dữ liệu (thuộc tính) và có khả năng thực hiện các hành động (phương thức).

###### 3. Phương thức (Method):
- Phương thức là một hành vi hoặc hành động mà một đối tượng có thể thực hiện.
- Nó định nghĩa các hoạt động cụ thể mà đối tượng cần thực hiện.
- Phương thức có thể nhận tham số đầu vào và thực hiện một loạt các thao tác, xử lý dữ liệu, và trả về kết quả.
Ví dụ: Trong một lớp "Động vật," có thể có một phương thức "ăn" để thể hiện hành vi ăn của động vật.

###### 4. Thuộc tính (Attribute hoặc Property):

- Thuộc tính là các dữ liệu mô tả trạng thái của một đối tượng.
- Chúng biểu thị các đặc điểm, thông số, hoặc thông tin khác về đối tượng.
- Thuộc tính có thể là các kiểu dữ liệu như số nguyên, chuỗi, boolean, hoặc thậm chí là một đối tượng khác.
Ví dụ: Trong một lớp "Người," có thể có các thuộc tính như "tên," "tuổi," "địa chỉ" để lưu trữ thông tin về người.

###### 5. Package: Trong ngữ cảnh của lập trình hướng đối tượng (OOP), khái niệm "package" thường được sử dụng để tổ chức và quản lý mã nguồn của chương trình. Một package là một tập hợp các lớp, phương thức và tài liệu liên quan được nhóm lại vào cùng một thư mục hoặc không gian tên (namespace). Package giúp tạo ra sự tổ chức logic và chia nhỏ mã nguồn để dễ dàng quản lý và duy trì.

## PHẠM VI TRUY CẬP (ACCESS MODIFIERS)

---

Trong lập trình hướng đối tượng (OOP), "phạm vi truy cập" (access modifiers) là các từ khóa được sử dụng để quy định mức độ truy cập vào các thành phần của một lớp, chẳng hạn như thuộc tính và phương thức. Các phạm vi truy cập giúp kiểm soát việc truy cập và tương tác với các thành phần của đối tượng, giúp bảo vệ dữ liệu và hạn chế sự truy cập không cần thiết.

![](https://images.viblo.asia/3efc9ede-d8e3-4b93-b1f0-7b46e1e773f3.png)

1. public: Các thành phần được đánh dấu là public có thể truy cập từ bất kỳ nơi nào, trong hoặc ngoài cùng package hoặc lớp kế thừa. Chẳng hạn:

2. private: Các thành phần được đánh dấu là private chỉ có thể truy cập từ bên trong cùng lớp. Chúng không thể truy cập từ bất kỳ nơi nào khác

3. default (không có từ khóa): Các thành phần không có từ khóa phạm vi truy cập được gọi là phạm vi mặc định. Chúng có thể truy cập từ bên trong cùng lớp và các lớp cùng package, nhưng không thể truy cập từ bên ngoài package. Đây cũng là phạm vi mặc định nếu bạn không sử dụng bất kỳ từ khóa phạm vi nào

4. Phạm vi protected: là một loại phạm vi cho phép truy cập được từ trong hay cả ngoài package (gói), nếu là ngoài package thì phải thông qua tính kế thừa (inheritance). Cả phạm vi private và protected đều chỉ áp dụng bên trong class như thuộc tính, phương thức, ... Không thể áp dụng cho phạm vi truy cập của lớp hoặc interface
ví dụ: 
```
// Định nghĩa lớp X trong gói a
package a;
public class X{
    protected int x1, x2;

    protected int plus(){
        return x1 + x2;
    }
}

// Định nghĩa lớp Y trong gói a
package a;
public class Y{
    public static main(String args[]){
       X c = new X();
       c.x1 = 1;
       c.x2 = 2;
       System.out.print(c.plus());
       // Ta có thể thấy rằng chúng ta hoàn toàn truy xuất được đến các thuộc tính hay phương thức có trong X
    }
}

// Định nghĩa lớp Z trong gói b
package b;
public class Z extends a.X {
    public static main(String args[]){
       Z c = new X();
       c.x1 = 1;
       c.x2 = 2;
       System.out.print(c.plus());
       // Khi này để truy xuất được đến các thuộc tính, phương thức trong X ta cần để Z kế thừa X.
    }
}
```

## CÁC TÍNH CHẤT CỦA OOP
OOP nói chung có 4 tính chất, gồm: tính trừu tượng (abstract), tính kế thừa (inheritance), tính đóng gói (encapsulation), tính đa hình (polymorphism).

##### 1. Tính đóng gói (encapsulation): đóng gói ở đây có nghĩa là đóng gói attributes, methods thành class, đóng gói các class thành package, ... Nhằm che giấu thông tin và đảm bảo sự toàn vẹn của dữ liệu.

```
// Định nghĩa lớp Money
public class Money{
    /* Toàn bộ các thuộc tính để phạm vi truy cập là private, điều này có nghĩa là
    các thuộc tính này không thể truy cập được bởi các lớp bên ngoài*/
    private String donVi;
    private String menhGia;
    private String seri;
    
    
    // Khi này để tương tác với các thuộc tính trên, chúng ta sử dụng các hàm setter, getter,
    
    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getMenhGia() {
        return menhGia;
    }

    public void setMenhGia(String menhGia) {
        this.menhGia = menhGia;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }
}
```

Một vài lợi ích nữa trong việc đóng gói là:

- Chúng ta có thể kiểm soát chỉ đọc hoặc chỉ ghi, hoặc cả ghi cả đọc cho các thuộc tính, tức là chỉ có setters hoặc getters, hoặc có cả setters, getters.
- Người sử dụng của class không biết được cách các class lưu trữ dữ liệu hay được gọi là sự kiểm soát dữ liệu.
- Một class có thể thay đổi kiểu dữ liệu của một thuộc tính và người dùng class không cần sự thay đổi trong code.

##### 2. Tính kế thừa (inheritance): Chỉ đơn giản là chúng ta tái sử dụng lại các thuộc tính, phương thức ở class khác mà không cần phải xây dựng lại từ đầu.

```
// Định nghĩa lớp TaiKhoan
public class TaiKhoan{
    protected String ID;
    protected String name;
    protected String userName;
    protected String passWord;
    
    protected void input(){
        // Triển khai nhập dữ liệu
    }
    
    protected void output(){
        // Xuất dữ liệu
    }
}

// Định nghĩa lớp tài khoản giáo viên kế thừa lớp tài khoản
public class TKGiaoVien extends TaiKhoan {
    private String specialized; // Chuyên ngành 
    private String qualification; // trình độ chuyên môn
    
    // Tái sử dụng phương thức đã có sẵn trong class TaiKhoan
    @Override
    public void input(){
        super.input();
        // Triển khai tiếp nhập dữ liệu cho các thuộc tính trong class TKGiaoVien
    }
    
    @Override
    public void output(){
        super.ouput();
        // Triển khai tiếp xuất dữ liệu cho các thuộc tính trong class TKGiaoVien
    }
}

// Định nghĩa tiếp lớp tài quản trị viên kế thừa lớp tài khoản cho thấy sức mạnh kế thừa
public class TKQTV extends TaiKhoan {
    private String permission;
    
    // Tái sử dụng phương thức đã có sẵn trong class TaiKhoan
    @Override
    public void input(){
        super.input();
        // Triển khai tiếp nhập dữ liệu cho các thuộc tính trong class TKQTV
    }
    
    @Override
    public void output(){
        super.ouput();
        // Triển khai tiếp xuất dữ liệu cho các thuộc tính trong class TKQTV
    }
}
```
##### 3. Tính đa hình (polymorphism): chỉ sự đa hình thái, chẳng hạn cùng có một phương thức giống nhau nhưng tùy vào tham số truyền vào hay sự cài đặt của lớp con mà nó thực hiện các công việc khác nhau. Tính đa hình liên quan tới 2 khái niệm là: overriding (ghi đè) và overloading (nạp chồng).

###### overriding (ghi đè) là đi viết lại, định nghĩa lại phương thức mà nó kế thừa từ lớp cha.
ví dụ về overriding:
```
// Định nghĩa lớp Animal
public class Animal {
    public void output(){
        System.out.println("- Đây là lớp động vật.");
    }
}

// Định nghĩa lớp Cat kế thừa lớp Animal
public class Cat extends Animal {
    /* Class Cat kế thừa phương thức output() từ lớp Animal, nhưng phương thức output() trong lớp Cat
    lại khác so với phương thức output() trong Animal, ta gọi nó là overriding (ghi đè).*/
    @Override
    public void output(){
        System.out.println("- Đây là lớp mòe :D.");
    }
}
```

###### overloading (nạp chồng) sử dụng các phương thức có cùng tên nhưng tham số đầu vào lại khác nhau.
ví dụ về overloading:
```
// Định nghĩa lớp Animal
public class Animal{

    // tạo các phương thức cùng tên nhưng các tham số đầu vào khác nhau
    public void output(){
        System.out.println("- Đây là lớp động vật ăn thịt.");
    }
    
    public void output(int i){
        System.out.println("- Đây là lớp động vật ăn cỏ.");
    }
    
    public void output(int i, int j){
        System.out.println("- Đây là lớp động vật ăn chay???");
    }
}

// triển khai trong hàm main
public static void main(String args[]){
    Animal x = new Animal();
    x.output(); // kết quả: - Đây là lớp động vật ăn thịt.
    x.output(1); // kết quả: - Đây là lớp động vật ăn cỏ.
    x.output(1, 2); // kết quả: - Đây là lớp động vật ăn chay???.
}
```
##### 4.Tính trừu tượng (abstract): abstract có nghĩa là chúng ta đi tổng quát hóa một cái gì đó mà không cần đi vào chi tiết quá vào nó, nhưng người nghe vẫn hiểu được nó là cái gì. Trong OOP thì tính trừu tượng tức là ta đi lựa chọn các thuộc tính và các phương thức cần thiết của đối tượng để giải quyết bài toán. Bởi trong thực tế, một đối tượng có thể có rất nhiều thuộc tính và phương thức, nhưng không liên quan và không cần sử dụng trong bài toán đề ra.
Ví dụ: trong bài toán quản lý mèo, chẳng hạn đối tượng mèo chúng ta chỉ cần khái quát nó thành 1 lớp kiểu:
```
public class cat{
    // Các thuộc tính
    private int ID;
    private String species; // chủng loại
    private String origin; // Xuất xứ
    private double weight; // cân nặng

    // Các phương thức
    public void input(){
    }

    public void output(){
    }
}
```

