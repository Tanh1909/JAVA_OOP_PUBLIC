# GENERIC

tình huống: Tôi muốn tạo ra một lớp để chứa các chuỗi String nó được sắp xếp lần lượt. Có 3 phương thức push thêm vào 1 String vào, remove xóa bỏ String và isEmpty kiểm tra có String nào trong danh sách ko.

```
class ListString {
   private LinkedList<String> items = new LinkedList<String>();
   public void push(String item) {
      items.addLast(item);
   }
   public String remove() {
      return items.removeFirst();
   }
   public boolean isEmpty() {
      return (items.size() == 0);
   }
}
```
hàm main:
```
ListString listString = new ListString();
listString.push(new String());
```
vấn đề ở đây là: Class này chỉ dùng cho đối tượng String, giả sử nếu tôi muốn lưu trữ dữ liệu dạng Integer, Double, ... thì phải tạo 1 class cụ thể cho dạng tôi muốn -> từ đây khái niệm generic ra đời

# GENERIC LÀ GÌ?

---

> Generic programming là cách tạo ra đoạn mã có reusable (tính tái sử dụng cao), nó rất hữu ích cho những người viết software libraries (thư viện phần mềm) làm sao để generic programming (lập trình có tính tổng quát) vì nó cho phép người dùng sử dụng ở những tình huống khác nhau.

![](https://codelearn.io/Media/Default/Users/SeiSilver/GenericImg/2-1.png)

giờ ta sẽ xử lý vấn đề ở trên như sau:

```
class MyList<T> {
   private LinkedList<T> items = new LinkedList<T>();
   public void push(T item) {
      items.addLast(item);
   }
   public T remove() {
      return items.removeFirst();
   }
   public boolean isEmpty() {
      return (items.size() == 0);
   }
}
```

- T là (type parameters) đại diện cho đối tượng bạn truyền vào để lưu trữ, T là ký tự bất kỳ, bạn có thể thay thế bằng 1 từ khác.

- Cách sử dụng đa năng hơn nhiều rồi, tôi có thể tạo ra MyList chứa String hoặc Int hoặc .... đối tượng khác nhau.
# MỘT SỐ QUY ƯỚC TRONG GENERICS

---

Có rất nhiều cách để đặt tên cho kiểu tham số trong Generic nhưng chúng ta nên tuân theo nhưng kiểu đặt tên tiêu chuẩn để sau này nếu có làm việc nhóm thì team sẽ dễ đọc code hơn.

Các kiểu tham số thông thường:

1. T - Type (Kiểu dữ liệu bất kỳ thuộc Wrapper class: String, Integer, Long, Float, …)
2. E – Element (phần tử – được sử dụng phổ biến trong Collection Framework)
3. K – Key (khóa)
4. V – Value (giá trị)
5. N – Number (kiểu số: Integer, Double, Float, …)
6. U,S,I,G, … (tùy theo kiểu của người dùng đặt)

# DEMO TRONG JAVA

---

1. #### Tạo class Generic với kiểu tham số generic

Dictionary<K, V> là một class Generics nó chứa một cặp khóa và giá trị (key/ value).

```
public class Dictionary<K,V> {
   private K key;
   private V value;

   public Dictionary(){

   }

    public Dictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

```
K và V được gọi là 1 kiểu tham số chiếu nào đó của Dictionary<K,V>. Khi sử dụng class này chúng ta phải xác định 1 kiểu tham số cụ thể.

```
public class Demo {
    public static void main(String[] args) {
        Dictionary<Integer,String> dictionary=new Dictionary<>(1,"Tanh");
        int key= dictionary.getKey();
        String value= dictionary.getValue();
        System.out.println(key+" "+value);  output: 1 Tanh
    }
}
```
2. #### Thừa kế lớp Generics

Một class mở rộng từ một class Generics, nó có thể quy định kiểu cho tham số Generics, giữ nguyên các tham số Generics hoặc thêm các tham số Generics.

##### 2.1 Cách quy định kiểu cho tham số Generics.

Chúng ta tái sử dụng class Dictionary<K,V>.

```
public class Book1 extends Dictionary<Integer,String>{
    public Book1(){

    }
    public Book1(Integer key, String value){
        super(key,value);
    }
}

public class Demo {
    public static void main(String[] args) {
        Book1 b=new Book1(2,"Book1");
        System.out.println(b.getKey()+" "+b.getValue()); //output: 2 Book1
    }
}

```
##### 2.2. Cách quy định giữ nguyên các tham số generic.

```
public class Book2<K,V> extends Dictionary<K,V>{
    public Book2(){

    }

    public Book2(K key,V value){
        super(key, value);
    }
}

public class Demo {
    public static void main(String[] args) {
        Book2<Integer,String> book2=new Book2<>(3,"VIET NAM");
        System.out.println(book2.getKey()+" "+book2.getValue());
    }
}
```
##### 2.3. Cách thêm các tham số Generics vào 1 Class generic khác.
```
class Book3<K, V, I> extends Dictionary<K, V> {
    private I info; // khởi tạo thêm tham số generic 

    public Book3(K key, V value) {
        super(key, value);
    }

    public Book3(K key, V value, I info) {
        super(key, value);
        this.info = info; // truyền Kiểu generic mới vào 
    }

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }
}

public class Demo {
    public static void main(String[] args) {
        Book3<String, String, Integer> book3 = new Book<String, String, Integer>("Study", "hoc", 123);
        String english = l.getKey();
        String vietnamese = l.getValue();
        int quanity = l.getInfo();
        System.out.println(english + ": " + vietnamese + "\nQuantity: " + quanity);
        // Ouput:
        // Study: hoc
        // Quanity: 123
    }
}
```

2. #### Generics Interface
```
public class Book4<T> implements Writer<T>{
    @Override
    public void update(T obj) {
        System.out.println("updating...");
    }

    @Override
    public void delete(T obj) {
        System.out.println("deleting...");
    }

    @Override
    public void write(T obj) {
        System.out.println("writing " + obj);
    }
}

public class Demo {
    public static void main(String[] args) {
        Book4<String> book4=new Book4<>();
        book4.write("Hello World"); //output : writing Hello World
    }
}
```

# Các thao tác trên Generic
### 1. KHỞI TẠO PHƯƠNG THỨC
```
import java.util.ArrayList;

public class Store {

    public static <E> E getFirstElement(ArrayList<E> list){
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}


public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("tanh");
        list.add("Viet Nam");
        list.add("java");
        System.out.println(Store.getFirstElement(list)); //ouput: tanh
    }
}
```
### 2. Khởi tạo đối tượng Generic (pending)
### 3. Khởi tạo mảng Mảng Generic (pending)



Chúng ta không được phép khởi tạo đối tương obj theo kiểu này.

```
T obj = new T(); // error
```

Vì khi khởi tạo \<T> không hề tồn tại ở thời điểm java khởi chạy. Nó chỉ có ý nghĩa với trình biên dịch kiểm soát code của người lập trình. Mọi kiểu \<T> đều là Object tại thời điểm chạy của Java.

# Generics với ký tự đại diện Generic method (wildcard):

---

Trong Generic, dấu chấm hỏi (?) được gọi là một đại diện (wildcard), nó là kiểu không xác định.

Wildcard có thể được sử dụng cho rất nhiều tính huống ví dụ như kiểu tham số, trường hoặc biến cục bộ; đôi khi là một kiểu trả về.

Tùy vào ví trí của Wildcard mà nó sẽ có những ý nghĩa khác nhau:

- Collection<?>: mô tả một tập hợp chấp nhận tất cả các loại đối số (chứa mọi kiểu đối tượng).
- List<? extends Number>: mô tả một danh sách, nơi mà các phần tử là kiểu - Number hoặc kiểu con của Number.
- Comparator<? super String>: Mô tả một bộ so sánh (Comparator) mà thông số phải là String hoặc cha của String.

```
package Generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("ve hinh tron");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("ve hinh Vuong");
    }
}

public class Demo {
    // drawShapes chỉ chấp nhận các kiểu thuộc lớp Shape hoặc con của nó
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw(); // call method của lớp Shape từ lớp con
        }
    }

    public static void main(String args[]) {
        List<Square> list1 = new ArrayList<Square>();
        list1.add(new Square());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
    }

}
```
# TÀI LIỆU THAM KHẢO
- https://codelearn.io/sharing/lam-quen-voi-generics-trong-java
- https://viblo.asia/p/java-generic-aWj53Xw1K6m