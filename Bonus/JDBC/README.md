# JDBC

---

JDBC - Java Database Connectivity, là một API chuẩn để kết nối giữa ngôn ngữ lập trình Java và các database. Nó là một phần của JavaSE (Java Standard Edition). API JDBC sử dụng JDBC drivers để kết nối với cơ sở dữ liệu.

## KIẾN TRÚC JDBC

---

![](https://media.techmaster.vn/api/static/bq0a8rs51co78aldi4p0/diuws9Lf)

- JDBC API: Cho phép chương trình Java thực thi các câu lệnh SQL và truy xuất kết quả. Một số lớp và interface quan trọng được định nghĩa trong JDBC API như sau:

- DriverManager: Đóng vai trò quan trọng trong kiến trúc JDBC. Nó sử dụng một số quy trình điều khiển dành riêng cho cơ sở dữ liệu để kết nối hiệu quả các ứng dụng doanh nghiệp với database
- JDBC Driver: Để giao tiếp với nguồn dữ liệu thông qua JDBC, bạn cần JDBC Driver để giao tiếp với nguồn dữ liệu tương ứng. Có 4 loại JDBC drivers:
    -   JDBC - ODBC Bridge Driver
    -  Native Drive
    -  Network Protocol Driver
    -   Thin driver

## CÁC THÀNH PHẦN CHÍNH TRONG JDBC

---

- DriverManager: Là một class dùng để quản lý danh sách các Driver
- Driver: Là một interface, chịu trách nhiệm xử lý các hoạt động giao tiếp giữa ứng dụng và database
- Connection: Là một interface, cung cấp các phương thức cho việc thao tác với database
- Statement: Là một interface, để thực thi các câu lệnh SQL xuống database
- ResultSet: Là một bảng dữ liệu mà biểu diễn tập kết quả từ cơ sở dữ liệu trả về bởi các lệnh SQL
- SQLException: Xử lý ngoại lệ xảy ra trong database

## KẾT NỐI JAVA ĐẾN DB

---

### CÁC THÔNG TIN KHI CONNECT JAVA ĐẾN DB

### SỰ KHÁC NHAU GIỮA STATEMENT VÀ PREPAREDSTATEMENT

# TRANSACTION VÀ CALLABLESTATEMENT
---

## MỤC ĐÍCH VÀ CÁCH SỬ DỤNG CALLABLESTATEMENT





# TÀI LIỆU THAM KHẢO

- https://topdev.vn/blog/huong-dan-ket-noi-co-so-du-lieu-voi-java-jdbc/
