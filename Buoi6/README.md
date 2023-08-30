# LIST

---

Trong Java, List interface là một collection có trật tự cho phép chúng ta lưu trữ và truy cập tới các phần tử một cách tuần tự. Nó được mở rộng từ Collection interface.

## CÁC HÀM CỦA LIST

Một số hàm thường được sử dụng của Collection interface và cũng có sẵn trong List interface là:

- add() – thêm một phần tử vào list
- addAll() – thêm tất cả các phần tử của một list này vào list khác
- get() – giúp truy cập ngẫu nhiên các phần tử từ list
- iterator() – trả về đối tượng iterator có thể được sử dụng để truy cập tuần tự các phần tử của list
- set() – thay đổi các phần tử của list
- remove() – xóa một phần tử khỏi list
- removeAll() – loại bỏ tất cả các phần tử khỏi list
- clear()- loại bỏ tất cả các phần tử khỏi list (hàm này hiệu quả hơn hàm - removeAll())
- size() – trả về độ dài của list
- toArray() – chuyển đổi một list thành một mảng
- contains()- trả về true nếu một list chứa phần tử được chỉ định
## CÁCH TRIỂN KHAI LIST

 **Vì List là một interface nên chúng ta không thể tạo các đối tượng từ nó.**
 ```
  List<String> names = new List<>(); //error vì list là interface không thể khởi tạo đối tượng
 ```

![](https://cafedev.vn/wp-content/uploads/2020/05/cafedev_list_java.png)

Để sử dụng các chức năng của List interface, chúng ta có thể sử dụng các class sau:

- Arraylist

- Linkedlist

- Vector

- Stack

Mỗi cách triển khai interface List sẽ có sự khác biệt nhất định và mục đích sử dụng khác nhau ở bài viết này anh chỉ giới thiệu về Arraylist. (Sự khác nhau với mục đích sử dụng a sẽ làm 1 phần riêng)

## ARRAYLIST

### Triển khai class ArrayList

Có 2 cách để triển khia theo ArrayList

```
List<Kiểu dữ liệu> <Tên> = new ArrayList<>();
ArrayList<Kiểu dữ liệu> <Tên> = new ArrayList<>();
```

2 cách này cơ bản là không có gì khác biệt nhau. Để hiểu rõ bản chất thì nó sẽ liên quan đến tính đa hình nên anh giới thiệu sau. Mọi người có thể tìm hiểu thêm [ở đây](https://viblo.asia/p/su-khac-nhau-giua-bien-tham-chieu-kieu-list-va-arraylist-trong-java-la-gi-djeZ1e8JZWz)

### Các hàm thông dụng 

Trong Java, lớp `ArrayList` cung cấp nhiều phương thức để thao tác với danh sách các phần tử. Dưới đây là một số phương thức thông dụng trong `ArrayList`:

1. **Thêm phần tử:**
   - `add(element)`: Thêm phần tử vào cuối danh sách.
   - `add(index, element)`: Thêm phần tử vào vị trí cụ thể trong danh sách.

2. **Truy cập phần tử:**
   - `get(index)`: Trả về phần tử ở vị trí chỉ định.
   
3. **Xóa phần tử:**
   - `remove(index)`: Xóa phần tử ở vị trí chỉ định.
   - `remove(element)`: Xóa phần tử cụ thể khỏi danh sách.
   
4. **Kích thước danh sách:**
   - `size()`: Trả về số lượng phần tử trong danh sách.
   
5. **Chèn phần tử:**
   - `add(index, element)`: Chèn phần tử vào vị trí chỉ định, dời các phần tử còn lại sang phải.
   
6. **Cập nhật phần tử:**
   - `set(index, element)`: Cập nhật phần tử ở vị trí chỉ định.
   
7. **Kiểm tra sự tồn tại của phần tử:**
   - `contains(element)`: Kiểm tra xem phần tử có tồn tại trong danh sách không.
   
8. **Tìm vị trí của phần tử:**
   - `indexOf(element)`: Trả về vị trí đầu tiên của phần tử trong danh sách.
   - `lastIndexOf(element)`: Trả về vị trí cuối cùng của phần tử trong danh sách.
   
9. **Kiểm tra danh sách rỗng:**
   - `isEmpty()`: Kiểm tra xem danh sách có rỗng không.

10. **Sắp xếp danh sách:**
    - `sort(Comparator)` hoặc `sort(null)`: Sắp xếp danh sách sử dụng bộ so sánh được cung cấp hoặc theo thứ tự mặc định nếu không có bộ so sánh.

Và còn nhiều phương thức khác nữa. Việc tùy thuộc vào nhu cầu sử dụng mà  có thể sử dụng các phương thức này để thao tác với `ArrayList`.

ví dụ:

Dưới đây là một số ví dụ cụ thể về cách sử dụng các phương thức trong `ArrayList`:

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Thêm phần tử vào danh sách
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Danh sách các loại hoa quả: " + fruits);

        // Truy cập phần tử
        String secondFruit = fruits.get(1);
        System.out.println("Hoa quả ở vị trí thứ 2: " + secondFruit);

        // Xóa phần tử
        fruits.remove(0);
        System.out.println("Danh sách sau khi xóa phần tử đầu tiên: " + fruits);

        // Kiểm tra sự tồn tại của phần tử
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Có chứa quả chuối trong danh sách: " + containsBanana);

        // Tìm vị trí của phần tử
        int orangeIndex = fruits.indexOf("Orange");
        System.out.println("Vị trí của quả cam: " + orangeIndex);

        // Kiểm tra danh sách rỗng
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Danh sách hoa quả rỗng: " + isEmpty);

        // Thay đổi phần tử
        fruits.set(0, "Grapes");
        System.out.println("Danh sách sau khi thay đổi: " + fruits);

        // Sắp xếp danh sách
        fruits.sort();
        System.out.println("Danh sách sau khi sắp xếp: " + fruits);
    }
}
```

Ví dụ này sử dụng một `ArrayList` để lưu trữ danh sách các loại hoa quả và thực hiện các thao tác thêm, truy cập, xóa, kiểm tra tồn tại, tìm vị trí, kiểm tra danh sách rỗng, thay đổi phần tử và sắp xếp.

# KẾ THỪA

---

Kế thừa là một khái niệm quan trọng trong lập trình hướng đối tượng (OOP) và cũng là một trong các nguyên tắc cơ bản của OOP. Trong Java, kế thừa cho phép một lớp mới (lớp con hoặc lớp dẫn xuất) kế thừa các thuộc tính và phương thức từ một lớp hiện có (lớp cha hoặc lớp cơ sở). Lớp con có thể sử dụng, mở rộng hoặc ghi đè các thành phần của lớp cha.

Một số khái niệm liên quan đến kế thừa trong Java:

- **Lớp cha (Superclass) và Lớp con (Subclass):** Lớp cha là lớp mà lớp con kế thừa từ. Lớp con chứa các thành phần của lớp cha và có thể mở rộng hoặc ghi đè chúng.

- **Mối quan hệ "is-a":** Khi một lớp con kế thừa từ một lớp cha, ta có thể nói rằng lớp con "là một" phiên bản cụ thể của lớp cha. Ví dụ: Nếu có lớp `Dog` kế thừa từ lớp `Animal`, ta có thể nói rằng "Dog is an Animal".

- **Từ khóa `extends`:** Để khai báo một lớp con kế thừa từ một lớp cha, ta sử dụng từ khóa `extends`. Ví dụ: `class Dog extends Animal`.

- **Mở rộng (Inheritance):** Lớp con có thể thừa hưởng các phương thức và thuộc tính của lớp cha và sử dụng chúng mà không cần viết lại.

- **Ghi đè (Method Overriding):** Lớp con có thể ghi đè (override) phương thức của lớp cha bằng cách cung cấp một định nghĩa mới cho phương thức đó. Điều này cho phép lớp con cung cấp hành vi riêng cho phương thức đã được kế thừa từ lớp cha.

- **Super Keyword:** Trong lớp con, từ khóa `super` được sử dụng để truy cập các thành phần của lớp cha.

Ví dụ:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Output: Animal makes a sound
        
        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks
    }
}
```

Trong ví dụ này, lớp `Dog` kế thừa phương thức `sound` từ lớp `Animal` và ghi đè phương thức này để cung cấp hành vi riêng cho lớp con.

# GHI ĐÈ PHƯƠNG THỨC

---

Ghi đè phương thức (Method Overriding) là một khái niệm trong lập trình hướng đối tượng, cho phép lớp con cung cấp một định nghĩa mới cho một phương thức đã được kế thừa từ lớp cha. Khi lớp con ghi đè một phương thức, nó thay thế định nghĩa của phương thức trong lớp cha bằng một định nghĩa mới dựa trên nhu cầu riêng của lớp con.

Để ghi đè một phương thức, lớp con cần tuân theo một số quy tắc:

1. **Phương thức ở lớp con phải có cùng tên, cùng tham số và cùng kiểu trả về với phương thức ở lớp cha.**

2. **Phương thức ở lớp con phải được đánh dấu bằng từ khóa `@Override`.** Điều này giúp biên dịch kiểm tra xem phương thức thực sự đang được ghi đè hoặc không.

3. **Phương thức ghi đè trong lớp con không thể có phạm vi nhỏ hơn phạm vi của phương thức ở lớp cha.** Nghĩa là phạm vi của phương thức ở lớp con phải ít nhất bằng phạm vi của phương thức ở lớp cha.

4. **Lớp con không thể ghi đè các phương thức được đánh dấu là `final` hoặc `static` ở lớp cha.**

Dưới đây là một ví dụ minh họa về ghi đè phương thức:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound
        
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
        
        // Polymorphism: Using the overridden method
        Animal polymorphicDog = new Dog();
        polymorphicDog.makeSound(); // Output: Dog barks
    }
}
```

Trong ví dụ này, lớp `Dog` ghi đè phương thức `makeSound` của lớp `Animal`, và khi bạn tạo một đối tượng `Dog` và gọi phương thức `makeSound`, định nghĩa trong lớp `Dog` được thực thi thay vì định nghĩa trong lớp `Animal`.
