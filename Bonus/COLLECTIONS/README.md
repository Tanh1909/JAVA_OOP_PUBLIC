# COLLECTIONS TRONG JAVA ( note: cần bổ sung thêm về cách truy xuất và cách khai báo)
## Phần 1. Tìm hiểu về Java Collections Framework

---

Java Collections Framework cung cấp một tập hợp các interfaces (giao diện) và class (lớp) để triển khai các cấu trúc dữ liệu và thuật toán khác nhau.

Java Collection framework cung cấp nhiều interfaces (Set, List, Queue, Deque) và nhiều lớp (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

Ví dụ, class LinkedList của Collections Framework cung cấp một tập hợp các interfaces để triển khai cấu trúc dữ liệu danh sách được liên kết kép.

### Collection trong Java là gì?
Collection trong Java là một framework cung cấp kiến trúc để lưu trữ và thao tác một nhóm các đối tượng nhất định.

Java Collection có thể thực hiện được tất cả các hoạt động mà bạn có thể thực hiện trên dữ liệu, chẳng hạn như tìm kiếm, sắp xếp, chèn, thao tác và xóa.

Java Collection đại diện một đơn vị đối tượng riêng lẻ, chẳng hạn như nhóm

### Framework trong Java là gì?
Framework trong Java có các đặc tính dưới đây:

Cung cấp kiến trúc được làm sẵn
Đại diện cho một tập hợp các class và interface.
Mang tính tùy chọn
Collection framework là gì?
Collection framework đại diện cho một kiến trúc thống nhất để lưu trữ và thao tác một nhóm đối tượng. Nó có:

Interface và các cách triển khai của nó, chính xác là các lớp (class)
Thuật toán
Collections Framework với Collection Interface
Không ít người thường bị nhầm lẫn giữa Collections Framework và Collection Interface.

Collection Interface là interface gốc của collections framework.

Framework bao gồm nhiều interface như: Map và Iterator. Các interface này cũng có thể có các Subinterface (interface con).
## LIST
### ARRAYLIST
> Lớp ArrayList sử dụng một mảng động để lưu trữ các phần tử. Nó kế thừa lớp AbstractList và implement interface List.
###### Những điểm cần ghi nhớ về lớp ArrayList:
* Có thể chứa các phần tử trùng lặp.
* Duy trì thứ tự của phần tử được thêm vào.
* Không đồng bộ (non-synchronized).
* Cho phép truy cập ngẫu nhiên, tốc độ truy xuất (get) phần tử nhanh vì nó lưu dữ liệu theo index.
* Vì bản chất của ArrayList vẫn sử dụng mảng để lưu trữ dữ liệu nên các thao tác xóa hay thêm phần tử sẽ chậm.
***==> Nên sử dụng ArrayList trong các trường hợp cần nhiều việc truy xuất các phần tử.***
### LINKEDLIST
> Lớp LinkedList sử dụng một danh sách liên kết đôi để lưu trữ phần tử. Nó cung cấp một cấu trúc dữ liệu danh sách liên kết. Nó kế thừa lớp AbstractList và thực hiện các giao diện List và Deque.
###### Những điểm cần ghi nhớ về lớp LinkedList:
* Có thể chứa các phần tử trùng lặp.
* Duy trì thứ tự của phần tử được thêm vào.
* Không đồng bộ (non-synchronized).
* Thao tác thêm/ xóa (add/ remove) phần tử nhanh hơn Arraylist vì không cần phải dịch chuyển nếu bất kỳ phần tử nào thêm/ xoá khỏi danh sách.
* Truy xuất phần tử chậm hơn so với ArrayList
* LinkedList có thể được sử dụng như danh sách (list), stack (ngăn xếp) hoặc queue (hàng đợi).
* Các phần tử trong LinkedList có thể nằm cách ly nhau (không liên tục) trong bộ nhớ. Nó là một liên kết có tính hai chiều giữa các phần tử. Mỗi phần tử trong danh sách cầm giữ một tham chiếu đến đối phần tử đằng trước nó và tham chiếu đến phần tử ngay sau nó.
***==> Nên sử dụng LinkedList trong trường hợp cần nhiều thao tác thêm xóa phần tử.***
## Vector
> Tương tự ArrayList điểm khác nhau là vector đồng bộ hóa (synchronized)

**Lưu ý rằng trong các phiên bản Java gần đây, ArrayList đã được cải tiến để cung cấp hiệu năng gần như tương tự như Vector, nhưng vẫn không được đồng bộ hóa. Vì vậy, nếu bạn không cần đồng bộ hóa, ArrayList thường là sự lựa chọn ưa thích hơn vì nó có hiệu năng tốt hơn trong các trường hợp đơn luồng.**

## SET
### HASHSET
> Lớp Java Hashset được sử dụng để tạo một collection sử dụng bảng băm để lưu trữ. Nó kế thừa lớp AbstractSet và implement interface Set.
###### Những điểm cần ghi nhớ về lớp HashSet:
*  Hashset lưu trữ các phần tử bằng cách sử dụng một cơ chế gọi là hashing. HashSet dựa vào giá trị hashcode() để phân biệt các phần tử
*  Không chứa các phần tử trùng lặp.
* HashSet cho phép chứa giá trị null.
* Không đồng bộ
* Không duy trì thứ tự chèn.
* Được sử dụng trong các hoạt động tìm kiếm
### TREESET
> Lớp TreeSet được implement interface Set. Nó lưu trữ các phần tử dưới dạng cây.
###### Những điểm cần ghi nhớ về lớp TreeSet:
* Không chứa các phần tử trùng lặp ( tương tự HashSet).
* Thời gian truy xuất phần tử nhanh.
* Không cho phép phần tử null do cần phải sắp xếp các phần tử.
* Không đồng bộ.
* Sắp xếp các phần tử theo thứ tự tăng dần.
#### MỘT VÀI ĐIỀU LƯU Ý VỀ HASHSET VÀ TREESET
Trong ngữ cảnh của Java, giao diện Set không đảm bảo thứ tự của các phần tử trong tập hợp (Set). Set là một tập hợp không chứa các phần tử trùng lặp, và việc sắp xếp thứ tự của các phần tử không phải là điều được quy định hoặc đảm bảo trong Set.

Có hai lớp chính thực hiện giao diện Set trong Java là HashSet và TreeSet:

1. HashSet: Lớp này triển khai Set bằng cách sử dụng bảng băm (hash table). HashSet không bảo đảm thứ tự của các phần tử. Các phần tử được lưu trữ trong HashSet dựa trên các giá trị hash code của chúng, do đó, thứ tự các phần tử không phụ thuộc vào giá trị hay thứ tự chèn vào.

2. TreeSet: Lớp này triển khai Set bằng cách sử dụng cây (tree). TreeSet sắp xếp các phần tử theo thứ tự tăng dần hoặc giảm dần. Tuy nhiên, việc sắp xếp thứ tự này không phụ thuộc vào thứ tự chèn phần tử vào, mà là do cơ chế cây đã được xây dựng trong TreeSet.

Dưới đây là một ví dụ minh họa:

```java
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);

        System.out.println("HashSet: " + hashSet); // Không đảm bảo thứ tự

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        System.out.println("TreeSet: " + treeSet); // Đảm bảo thứ tự tăng dần
    }
}
```

Kết quả của đoạn mã trên sẽ có thể thay đổi mỗi lần bạn chạy, nhưng có thể là:

```
HashSet: [1, 2, 3] (Không đảm bảo thứ tự)
TreeSet: [1, 2, 3] (Đảm bảo thứ tự tăng dần)
```

Như bạn có thể thấy, HashSet không đảm bảo thứ tự của các phần tử, trong khi TreeSet sắp xếp các phần tử theo thứ tự tăng dần.
## MAP
### HASH MAP
> Lớp HashMap lưu trữ các phần tử dưới dạng 1 cặp key-value.

Đặc điểm của HashMap:

* Lớp Java HashMap chứa các giá trị dựa trên khóa.

* Các khóa không được trùng lặp.

* Có thể chứa 1 key null và nhiều value null.

* Không đồng bộ.

* Không duy trì thứ tự sắp xếp

Vì các phần tử trong HashMap không duy trì thứ tự sắp xếp vậy khi ta muốn truy xuất phần tử thông qua index thì sẽ làm thế nào?

Một lớp mở rộng của HashMap đó là LinkedHashMap. Lớp này duy trì 1 danh sách liên kết đôi chạy qua tất cả các phần tử bên trong nó vì vậy nó sẽ duy trì được thứ tự chèn các phần tử bên trong Map. Và khi bạn cần truy xuất thông qua index, bạn cần phải convert sang ArrayList để có thể truy xuất.
```
    LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String,String>();
    linkedHashMap.put("key0","value0");
    linkedHashMap.put("key1","value1");
    linkedHashMap.put("key2","value2");
    int pos = 1;
    String value = (new ArrayList<String>(linkedHashMap.values())).get(pos);
```
### TREEMAP
>Lưu trữ các cặp dữ liệu dưới dạng cây.

Đặc điểm của TreeMap:

* Không chứa 1 key null nhưng có thể chứa nhiều value null.

* Không đồng bộ.

* Duy trì thứ tự tăng dần các key.
#### MỘT VÀI ĐIỀU LƯU Ý VỀ TREEMAP VÀ HASHMAP
Trong ngữ cảnh của Java, giao diện Map cũng không đảm bảo thứ tự của các cặp khóa-giá trị trong bản đồ (Map). Map là một cấu trúc dữ liệu lưu trữ các cặp khóa-giá trị, và các khóa là duy nhất, không trùng lặp. Tuy nhiên, việc sắp xếp thứ tự của các cặp khóa-giá trị không phải là điều được quy định hoặc đảm bảo trong Map.

Có hai lớp chính thực hiện giao diện Map trong Java là HashMap và TreeMap:

1. HashMap: Lớp này triển khai Map bằng cách sử dụng bảng băm (hash table). HashMap không bảo đảm thứ tự của các cặp khóa-giá trị. Các cặp khóa-giá trị được lưu trữ trong HashMap dựa trên các giá trị hash code của khóa, do đó, thứ tự các cặp không phụ thuộc vào giá trị hay thứ tự chèn vào.

2. TreeMap: Lớp này triển khai Map bằng cách sử dụng cây (tree). TreeMap sắp xếp các cặp khóa-giá trị theo thứ tự của khóa. Tuy nhiên, việc sắp xếp thứ tự này không phụ thuộc vào thứ tự chèn cặp khóa-giá trị vào, mà là do cơ chế cây đã được xây dựng trong TreeMap.

Dưới đây là một ví dụ minh họa:

```java
import java.util.HashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        System.out.println("HashMap: " + hashMap); // Không đảm bảo thứ tự

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        System.out.println("TreeMap: " + treeMap); // Đảm bảo thứ tự của khóa
    }
}
```

Kết quả của đoạn mã trên sẽ có thể thay đổi mỗi lần bạn chạy, nhưng có thể là:

```
HashMap: {1=One, 2=Two, 3=Three} (Không đảm bảo thứ tự)
TreeMap: {1=One, 2=Two, 3=Three} (Đảm bảo thứ tự của khóa)
```

Như bạn có thể thấy, HashMap không đảm bảo thứ tự của các cặp khóa-giá trị, trong khi TreeMap sắp xếp các cặp theo thứ tự của khóa.

---
Tài liệu tham khảo:
1. https://viblo.asia/p/tong-quan-ve-collections-trong-java-maGK7E0Dlj2
2. https://viblo.asia/p/collection-trong-java-4P8563mAKY3