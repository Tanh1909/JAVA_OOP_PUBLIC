# Khái niệm về ORM

ORM (Object Relational Mapping) là 1 kĩ thuật liên kết giữa các đối tượng trong lập trình với các đối tượng trong CSDL.
=> ORM cho phép chúng ta truy xuất dễ dàng đến dữ liệu thông qua đối tượng lập trình mà không cần phải quá quan tâm đến CSDL thực tế đang dùng.

![](https://javabydeveloper.com/wp-content/uploads/2020/02/ORM-object-relational-mapping.png)

# Ưu và nhược điểm của ORM

1. Ưu điểm
- Quản lý dữ liệu tập trung trong code mà không cần để ý quá nhiều đến db
- Tránh được các lỗi liên quan đến SQL
- Hỗ Trợ giao dịch(Transaction)
- Có thể cache dữ liệu để truy xuất nhanh hơn.
2. Nhược điểm
- Lập trình viên dễ rơi vào bẫy truy xuất dữ liệu(vì quá dễ để truy xuất => do sử dụng hàm có sẵn => truy xuất nhiều thuộc tính không cần thiết)=> ảnh hưởng đến hiệu năng chương trình.
- Đối với các thao tác phức tạp có thể cần đến việc sử dụng câu lệnh query thuần

# Khái niệm về JPA và Entity

JPA Java Persistence API cung cấp các đặc tả dùng để duy trì và quản lý, đọc từ đối tượng java đến các quan hệ trong CSDL => JPA chỉ là các phương thức abstract không có phương thức thực thi.(Cần Hibernate để triển khai)
- Hibernate triển khai kỹ thuật ORM trong Spring
=> JPA cung cấp 1 cái mô hình POJO persistence cho phép ánh xạ các table/ mối quan hệ giữa các table trong db sang các class/ mối quan hệ giữa các class
=> JPA quản lý các entity(POJO)
- POJO là 1 đối tượng đại diện cho dữ liệu trong ứng dụng
- Entity thường là 1 POJO
- Entity sẽ được ánh xạ tới 1 bảng trong CSDL
- Để ánh xạ được, thì 1 Entity cần tuân thủ các điều sau:
    - Phải khai báo Annotation Entity trên class
    - Cần 1 Annotation Id
    - Có 1 constructor không tham số và để access modifier là public và các getter, setter
    - Không được khai báo final
    - Các thuộc tính khai báo private

![](https://gpcoder.com/wp-content/uploads/2019/10/jpa-architecture.png)
# Persistence Context và Entity Manager
- Persistence Context là 1 tập các thể hiện của entity được quản lý, tồn tại trong 1 kho dữ liệu
- Entity Manager => khai báo các phương thức để tương tác với các Persistence Context.
