# AOP - Aspect oriented Programming - lập trình hướng khía cạnh

## KHÁI NIỆM VỀ AOP

---

> Aspect Oriented Programming (AOP) – lập trình hướng khía cạnh: là một kỹ thuật lập trình (kiểu như lập trình hướng đối tượng) nhằm phân tách chương trình thành cách moudule riêng rẽ, phân biệt, không phụ thuộc nhau.

![AOP](https://images.viblo.asia/1abc0e2f-0989-4cf7-8183-b413d66ffe35.jpg)


AOP không phải dùng để thay thế OOP mà để bổ sung OOP (tách 1 dự án thành nhiều module nhỏ và mỗi module vẫn sử dụng OOP để code)

## ƯU VÀ NHƯỢC ĐIỂM CỦA AOP

---

### ƯU ĐIỂM:
- Thiết kế đơn giản: **“You aren’t gonna need it (YAGNI)”** – chúng ta chỉ cài đặt những thứ chúng ta thực sự cần.

- Cài đặt chương trình một cách dễ đọc, khoa học và dễ bảo trì: mỗi một module chỉ làm cái mà nó cần phải làm, giải quyết được hai vấn đề **code tangling** và **code scattering**.

- Tái sử dụng dễ dàng.

### NHƯỢC ĐIỂM
- Khái nhiệm khá trừu tượng, độ trừu tượng của chương trình cao
- Luồng chương trình phức tạp.

###### Một số từ khóa và thuật ngữ sử dụng
- *"You Aren't Gonna Need It" (YAGNI) là một nguyên tắc trong phát triển phần mềm. Nguyên tắc này khuyến nghị rằng bạn không nên thêm vào hệ thống những tính năng hoặc chức năng mà bạn cho rằng có thể sẽ cần trong tương lai, nhưng thực tế thì không có nhu cầu thực sự hoặc không có khả năng sẽ được sử dụng.*
- *"Code tangling" là một khái niệm trong lĩnh vực phát triển phần mềm, đề cập đến tình trạng mà các phần của mã nguồn mà thực hiện các chức năng hoặc nhiệm vụ khác nhau bị "ghép vào nhau", làm cho mã nguồn trở nên khó đọc, hiểu và bảo trì. Mã nguồn bị "ghép vào nhau" khi các khối mã có quan hệ logic hoặc chức năng khác nhau lại được viết gần nhau, gộp chung trong cùng một vùng của mã nguồn.*
- *"Code scattering" là một khái niệm có liên quan đến phát triển phần mềm, đặc biệt là trong việc quản lý cấu trúc của mã nguồn. Code scattering đề cập đến tình trạng khi các phần của mã nguồn mà liên quan chức năng hoặc nhiệm vụ cùng nhau lại bị phân tán ra xa nhau trong mã nguồn, làm cho mã nguồn trở nên khó đọc, hiểu và bảo trì.*

## CÁC THUẬT NGỮ QUAN TRỌNG TRONG AOP

---

- Core concerns: hàm chính của chương trình. Có 2 loại concern

  - Core concern/primary concern: là requirement, logic xử lý chính của chương trình ( ví dụ: CRUD, tìm kiếm,...)

  - Cross-cutting concern: là logic xử lý phụ - những chức năng khác của chương trình (ví dụ: bắt ngoại lệ, bảo mật, ghi log, theo dõi, giám sát, ... )

- Joinpoint: là 1 điểm trong chương trình, là nơi mà có thể chèn cross-cutting concern, 1 join point có thể là 1 phương thức được gọi, 1 throw được ném ra hoặc là field bị thay đổi.

- Pointcut: có nhiều cách để xác định joinpoint, những cách như thế được gọi là Pointcut -> kiểm tra nó có khớp với joinpoint hay không -> nếu khớp thì advice sẽ được thực hiện

- Advice: Những xử lý phụ được thêm vào xử lý chính, code đó được gọi là advice

- Target object: Đây là đối tượng trong ứng dụng mà advice sẽ được áp dụng.

- Weaving: Weaving (Kết nối) là một kỹ thuật để tạo kết nối giữa các aspect tại thời điểm tải, biên dịch hoặc thời gian chạy của chương trình.

- Aspect: là những mối qua tâm xuyên suốt AOP. Lập trình AOP -> phân tách các module -> mỗi module sẽ thực hiện 1 nhiệm vụ thì aspect là 1 class thực hiện nhiệm vụ này. ( Tương tự như một java class. Một aspect đóng gói toàn bộ cross-cutting concern và có thể chứa các joinPoint, pointCut, advice.) Aspect: Có 2 thành phần chính: advice và join point.

    - Before: thưc hiện trước các joinpoint trong method

    - After: thực hiện sau các joinpoint trong method

    - After returning: thực hiện sau khi method thực hiện và trả về kết quả

    - After Throwing: thực thi sau khi chương trình ném ra lỗi

    - Around: chạy khi method được thực thi (bao gồm 3 cái trên)

## Một vài cross-cutting concern thường thấy trong ứng dụng:

---

- exception handling

- Logging

- Monitoring

- Access control

- Error handling

- Transaction management

- Session management

- Input/Output validation

## Demo trong spring

---

#### Normal Class
```
@Entity
public class NormalClass {
	
	public Employee joinPointMethod(){
		// do things in JoinPoint method
	}
}
```

#### Aspect Class
```
@Aspect
public class EmployeeAspect {

	@Before("execution(public String joinPointMethod())")
	public void executeBeforeAdviceWhenDoJointPointMethod(){
		// do things on Advice method
	}
	
	@Before("execution(* pacage.*.get*())")
	public void executeBeforeAdviceWhenDoAnyMethodInPackage(){
		// Thực hiện advice khi bất kỳ function nào trong package được chỉ định execute
	}
    
    Tương tự cho các advice khác cũng có cấu trúc tương tự
}
```


## GIỚI THIỆU VỀ @ControllerAdvice và @ExceptionHandler

---
1. Exception là gì?

Exception cơ bản là đối tượng đại diện cho một lỗi xảy ra khi chạy chương trình. Lỗi này có thể do tác động bên ngoài hoặc chính trong code ném ra. Nhiệm vụ của chúng ta là phải "bắt" và "xử lý" chúng một cách thích hợp (đưa ra thông báo lỗi,...). Nếu exception không được xử lý, nó có thể làm chương trình bị dừng.

Cách bắt exception phổ biến là dùng try catch.
```
try {
    // Do something
} catch (Exception e) {
    // Xử lý lỗi
}
```
Với Spring Boot, nếu dùng try catch như trên cho mọi nơi có exception, thì thực sự không hay. Sẽ rất khó để bảo trì hay chỉnh sửa vì vậy chúng ta sẽ áp dụng AOP vào để xử lý.

2. @ControllerAdvice và @ExceptionHandler

Spring Boot sử dụng hai annotation @ControllerAdvice và @ExceptionHandler bên trong để thực hiện bắt mọi exception xuất hiện trong ứng dụng.

Thường thì class controller để bắt exception và các class exception khác được đặt trong thư mục exception/.

```
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({ ExceptionA.class, ExceptionB.class })  // Có thể bắt nhiều loại exception
    public ResponseEntity<String> handleExceptionA(Exception e) {
        return ResponseEntity.status(432).body(e.getMessage());
    }
    
    // Có thêm các @ExceptionHandler khác...
    
    // Nên bắt cả Exception.class
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleUnwantedException(Exception e) {
        // Log lỗi ra và ẩn đi message thực sự 
        e.printStackTrace();  // Thực tế người ta dùng logger
        return ResponseEntity.status(500).body("Unknow error");
    }
}
```
Nếu có exception ở bất cứ đâu, sẽ được chuyển tới method có @ExceptionHandler tương ứng. Thứ tự đặt chúng không quan trọng, Spring sẽ tự động tìm cái phù hợp nhất, nếu không có thì chuyển dần lên các exception class cha (do đó, nên có một @ExceptionHandler để bắt Exception class, dành cho các exception còn lại).

Các method này viết tương ứng với method của Controller, nhưng thay vì trả data về thì chúng ta trả về message lỗi.



### TÀI LIỆU SỬ DỤNG
- https://viblo.asia/p/java-developer-phai-biet-ve-aop-tro-thu-cho-oop-trong-spring-framework-p2-018J268aJYK

- https://viblo.asia/p/xu-ly-exception-phat-sinh-trong-ung-dung-spring-boot-6J3ZgWkLZmB