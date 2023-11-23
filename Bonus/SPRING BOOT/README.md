# Tổng quan về Spring Boot
Spring boot là 1 trong các module của Spring, cung cấp tính năng RAD (Rapid Application Development) => tạo 1 ứng dụng độc lập dựa trên spring mà có thể chạy ngay với rất ít cấu hình => không cần sử dụng XML để cấu hình mà thay vào đó nó sử dụng quy ước để cấu hình (vd : annotation...) => giảm tải công việc cho lập trình viên.

Ưu điểm: 
- cung cấp sẵn các thư viện "starter" để đơn giản hóa cấu hình maven/gradle
- tự cấu hình spring khi có thể => không yêu cầu cấu hình bằng xml
- Được nhúng sẵn Tomcat, Jetty hoặc Undertow. Khống cần triển khai các tệp file war
- Tạo ứng dụng Spring độc lập có thể được chạy bằng cách sử dụng lệnh java
- Cung cấp các tính năng "ăn liền": đo đếm số liệu, kiểm tra cấu hình của ứng dụng.
# Giới thiệu về Converter và Formatter
- Chuyển đổi dữ liệu nhập vào thành kiểu dữ liệu thích hợp.
- Converter có thể sự dugnj chung cho toàn bộ các tầng của ứng dụng nhưng formatter thì chỉ sử dụng được tầng web (web tier) 