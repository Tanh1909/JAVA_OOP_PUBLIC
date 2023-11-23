# Khái niệm về AJAX
AJAX là chữ viết tắt của Asynchronous JavaScript and XML. Nó là một bộ các kỹ thuật thiết kế web giúp cho các ứng dụng web hoạt động bất đồng bộ – xử lý mọi yêu cầu tới server từ phía sau. Để hiểu rõ hơn, mình sẽ giải thích với từng thuật ngữ một cho bạn biết AJAX là gì?
**Asynchronous**, hay nói ngắn hơn là Async – bất đồng bộ. Bất đồng bộ có nghĩa là một chương trình có thể xử lý không theo tuần tự các hàm, không có quy trình, có thể nhảy đi bỏ qua bước nào đó. Ích lợi dễ thấy nhất của bất đồng bộ là chương trình có thể xử lý nhiều công việc một lúc.

**JavaScript** là một ngôn ngữ lập trình nổi tiếng. Trong số rất nhiều chức năng của nó là khả năng quản lý nội dung động của website và hỗ trợ tương tác với người dùng.

**XML** là một dạng của ngôn ngữ markup như HTML, chữ đầy đủ của nó là eXtensible Markup Language. Nếu HTML được dùng để hiển thị dữ liệu, XML được thiết kế để chứa dữ liệu.

Cả JavaScript và XML đều hoạt động bất đồng bộ trong AJAX. Kết quả là, nhiều ứng dụng web có thể sử dụng AJAX để gửi và nhận data từ server mà không phải toàn bộ trang

Với AJAX người dùng có thể tiếp tục sử dụng trang web, trong khi các chương trình trên client tạo request và lấy thông tin từ Server
ưu điểm:
- nhanh không phải load lại trang
nhược điểm:
- khó kiểm soát
- 1 thành phần lỗi thì tất cả những thành phần còn lại đều bỏ
# Bất đồng bộ là gì? cơ chế xử lý bất đồng bộ trong JavaScript
- https://viblo.asia/p/co-che-bat-dong-bo-trong-javascript-jvElaO1zKkw
Quá trình thực thi code từ trên xuống dưới được gọi là đồng bộ. Ngược lại, xử lý bất đồng bộ là những xử lý mà đoạn code ở dưới có thể tiếp tục chạy mặc dù đoạn code bên trên chưa được xử lý hết và trả về kết quả
# Các thành phần cơ bản trong AJAX
HTML/XHTML, DOM, XML, XNILHttpRequest, JavaScript
- HTML & CSS trong việc hiện thị thông tin
- JavaScript
- Document Object Model (DOM): Tương tác với thông tin được hiện thị thông qua JavaScript
- Đối tượng XMLHttpRequest: Trao đổi dữ liệu bất đồng bộ với server
- XML hoặc JSON: định dạng kiểu dữ liệu truyền đi
# Cơ chế xử lý của AJAX
![](https://fptcloud.com/wp-content/uploads/2022/05/ajax-hoat-dong-nhu-the-nao-1.jpg)
# Ưu nhược điểm của AJAX
- Nhược điểm:
    - Nó không lưu lịch sử duyệt web -> do đó nút back sẽ mất tác dụng
    - Không thay đổi đường dẫn URL -> không thể bookmark trang ajax
    - Nếu trình duyệt không hỗ trợ js -> không chạy đc
    - Dễ bị tấn công bởi các đoạn mã độc mà những nhà phát triển wb không kiểm thử hết được
- Ưu điểm:
    - Cập nhật lại trang nếu sự có thay đổi dữ liệu - > giảm băng thông và thời gian load trang
    - Việc dùng request bất đồng bộ thì cho phép giao diện người dùng hiện thị trên trình duyệt giúp người dùng trải nghiệm sự tương tác cao với các thành phần riêng lẻ.
    - Làm giảm kết nối đến server, do các mã js và css chỉ yêu cầu 1 lần.

# Demo sử dụng AJAX