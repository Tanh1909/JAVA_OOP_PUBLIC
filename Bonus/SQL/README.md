# INDEX

---

## Index là gì ?
Index (hay chỉ mục) là một cấu trúc dữ liệu để tăng hiệu suất truy vấn của cơ sở dữ liệu. Index cho phép cơ sở dữ liệu thực hiện một số câu truy vấn có điều kiện nhanh hơn so với thông thường. Nhưng index cũng được lưu trên bộ nhớ và tiêu tốn không gian bộ nhớ và thời gian để tạo, cập nhật index nên khi sử dụng index cần phải suy xét kĩ.

## Một số điểm quan trọng về index

1. Tăng tốc truy cập dữ liệu: Index giúp giảm thời gian cần thiết để tìm kiếm và truy xuất dữ liệu từ bảng, đặc biệt là khi bạn có các bảng lớn chứa hàng nghìn hoặc hàng triệu bản ghi.

2. Sắp xếp dữ liệu: Index thường được sắp xếp theo một trật tự cụ thể, giúp cho việc truy vấn sắp xếp dữ liệu nhanh hơn.

3. Cách tạo index: Bạn có thể tạo index trên một hoặc nhiều trường trong bảng. Cách tạo index khác nhau tùy thuộc vào hệ quản trị cơ sở dữ liệu bạn đang sử dụng (ví dụ: MySQL, PostgreSQL, SQL Server) nhưng thường sử dụng lệnh SQL như `CREATE INDEX`.

4. Nhược điểm: Mặc dù index giúp tăng tốc truy cập dữ liệu, nhưng chúng cũng có nhược điểm. Chúng tốn thời gian và tài nguyên để cập nhật khi bạn thêm, sửa đổi hoặc xóa dữ liệu. Do đó, việc quản lý index cũng là một yếu tố quan trọng trong việc tối ưu hóa cơ sở dữ liệu.

Khi thiết kế cơ sở dữ liệu hoặc viết các truy vấn SQL phức tạp, bạn cần xem xét cẩn thận việc sử dụng index để đảm bảo rằng chúng được áp dụng một cách hiệu quả để cải thiện hiệu suất hệ thống của bạn.
## Khi nào sử dụng index ?
Index giúp tăng tốc độ truy vấn của một số câu lệnh select có điều kiện vì vậy nó đặc biệt hữu dụng khi câu lệnh truy vấn được sử dụng thường xuyên (hoặc cột được tạo index thường được truy vấn) và số lượng bản ghi lớn.

Khó để xác định khi nào sử dụng index, nó phụ thuộc nhiều vào các bài toán thực tế tuy nhiên có một số quy luật thường thấy khi chọn một cột (hoặc tập các cột) để tạo index:

1. Khóa và các cột có giá trị độc nhất (unique): Database thường sẽ tự động tạo index cho các cột này nên để tranh việc trùng lặp và tiêu tốn bộ nhớ ta không nên tạo thêm index cho chúng.
2. Tần suất được sử dụng: Khi tần suất sử dụng câu truy vấn càng lớn thì việc tạo index sẽ giúp làm giảm càng nhiều thời gian truy vấn (tính tổng).
3. Số lượng bản ghi của bảng: Số lượng bản ghi của bảng càng nhiều thì tốc độ truy vấn sẽ càng giảm lợi thế của việc sử dụng index trên các bảng này lại càng rõ ràng so với những bảng có số lượng bản ghi ít. Đặc biệt đối với trường hợp một bảng có ít bản ghi (100 - vài nghìn) ta không nên tạo chỉ mục cho chúng.
4. Dữ liệu của bảng tăng trưởng nhanh: Index sẽ tự động cập nhật khi có một bản ghi được thêm vào cơ sở dữ liệu, vì vậy khi đánh chỉ mục cho 1 bảng nó sẽ làm chậm lại các hành động thêm sửa xóa bản ghi. Vậy nên một bảng thường xuyên được cập nhật nên có ít index hơn một bảng hiếm khi cập nhật.
5. Không gian bộ nhớ: Khi tạo index sẽ sử dụng chính không gian bộ nhớ của cơ sở dữ liệu nên khi cơ sở dữ liệu có kích thước lớn ta cần lựa chọn cẩn thận trường nào sẽ sử dụng làm index.
6. Dữ liệu có đa dạng giá trị: Index được tạo dựa trên các giá trị trong cột mà nó trỏ tới ví dụ như cột index được tạo chỉ có 3 giá trị A, B, C thì index được tạo sẽ có giá trị nhỏ hơn nhiều so với cột có dải giá trị trải dài cả bảng chữ cái. Index trên cột có ít giá trị ví dụ cột sex sẽ không làm tăng nhiều tốc độ truy vấn tuy nhiên đối với những cột có nhiều giá trị riêng biệt như cột name sẽ làm tăng tốc độ truy vấn đáng kể.
## Ưu điểm của việc sử dụng index.
1. Thường sẽ làm tăng hiệu năng truy vấn khi điều kiện rơi vào các cột được đánh chỉ mục.
2. Giúp ta có thể truy vấn dữ liệu nhanh hơn.
3. Có thể được sử dụng để sắp xếp dữ liệu.
4. Các chỉ mục độc nhất đảm bảo tính duy nhất của trường trong cơ sở dữ liệu.
## Nhược điểm của sử dụng index.
Làm giảm hiệu năng các câu lệnh insert, update ,delete.
Chiếm dụng bộ nhớ.
## Các tạo index trong PostgreSQL.
Để tạo chỉ mục trong PostgreSQL ta dùng câu lệnh:

```
CREATE INDEX ten_index ON [TABLE NAME] (COLUMN1, COLUMN2, ...)

Nếu muốn tạo chỉ mục độc nhất (không cho phép chèn dữ liệu trùng lặp nào vào bảng):

CREATE UNIQUE INDEX ten_index ON [TABLE NAME] (COLUMN1, COLUMN2, …)
```

Khi không cần dùng index nữa có thể xóa theo cú pháp:

```
DROP INDEX ten_index
```
# Partition Table

---

## Partition Table là gì
Bảng phân vùng (Partition Table) trong cơ sở dữ liệu là một kỹ thuật được sử dụng để chia nhỏ một bảng lớn thành các phần nhỏ hơn gọi là các phân vùng (partitions) dựa trên một hoặc nhiều cột trong bảng. Mỗi phân vùng chứa một tập hợp con của dữ liệu và thường được quản lý bởi hệ quản trị cơ sở dữ liệu (DBMS) như Oracle, PostgreSQL, SQL Server, MySQL, và nhiều hệ thống quản lý cơ sở dữ liệu khác.

## Một số điểm quan trọng về bảng phân vùng

1. **Tối ưu hiệu suất**: Mục tiêu chính của bảng phân vùng là tối ưu hiệu suất truy vấn và quản lý dữ liệu trên các bảng lớn. Bằng cách chia nhỏ dữ liệu thành các phân vùng nhỏ hơn, việc truy xuất và xử lý dữ liệu có thể trở nên nhanh chóng hơn.

2. **Phân vùng dựa trên cột**: Phân vùng có thể được thực hiện dựa trên giá trị của một hoặc nhiều cột trong bảng. Ví dụ, bạn có thể phân vùng một bảng khách hàng theo mã quốc gia để lưu trữ các khách hàng từ cùng một quốc gia trong cùng một phân vùng.

3. **Tích hợp dữ liệu lịch sử**: Bảng phân vùng cũng có thể được sử dụng để quản lý dữ liệu lịch sử bằng cách chuyển dữ liệu cũ từ bảng gốc sang các phân vùng lưu trữ dữ liệu lịch sử.

4. **Quản lý dữ liệu dễ dàng hơn**: Việc quản lý dữ liệu trên các bảng lớn có thể trở nên phức tạp. Bảng phân vùng giúp đơn giản hóa quản lý và bảo trì dữ liệu bằng cách chia thành các phần nhỏ hơn.

5. **Backup và Restore**: Backup và khôi phục dữ liệu cũng có thể được thực hiện dễ dàng hơn trên các bảng phân vùng.

Mỗi hệ quản trị cơ sở dữ liệu có cách triển khai phân vùng riêng, và cú pháp để tạo và quản lý bảng phân vùng cũng khác nhau. Tuy nhiên, ứng dụng bảng phân vùng đòi hỏi sự thiết kế cơ sở dữ liệu cẩn thận để đảm bảo rằng các phân vùng được sử dụng hiệu quả để cải thiện hiệu suất và quản lý dữ liệu.

## Khi nào nên sử dụng Partition Table

Bảng phân vùng (Partition Table) thường được sử dụng trong các trường hợp sau đây:

1. **Dữ liệu lớn**: Khi bạn có một bảng dữ liệu lớn với hàng triệu hoặc hàng tỷ bản ghi, việc sử dụng bảng phân vùng có thể giúp cải thiện hiệu suất truy vấn và quản lý dữ liệu. Phân vùng cho phép hệ quản trị cơ sở dữ liệu (DBMS) tối ưu hóa truy cập dữ liệu bằng cách chia nhỏ bảng thành các phần nhỏ hơn.

2. **Truy vấn theo cột**: Khi truy vấn của bạn thường dựa trên giá trị của một hoặc vài cột cụ thể trong bảng, bạn có thể sử dụng bảng phân vùng để phân chia dữ liệu dựa trên các cột đó. Điều này giúp truy vấn trở nên nhanh chóng hơn vì DBMS chỉ cần quét các phân vùng chứa dữ liệu cần thiết.

3. **Quản lý lịch sử dữ liệu**: Nếu bạn cần theo dõi lịch sử thay đổi của dữ liệu và lưu trữ dữ liệu lịch sử, bạn có thể sử dụng bảng phân vùng để chuyển dữ liệu cũ vào các phân vùng riêng biệt để tiện cho việc duyệt và bảo quản dữ liệu lịch sử.

4. **Backup và Restore**: Bảng phân vùng cũng có lợi cho việc sao lưu và khôi phục dữ liệu. Bạn có thể sao lưu và khôi phục từng phân vùng một thay vì toàn bộ bảng, giúp tiết kiệm thời gian và tài nguyên.

5. **Quản lý dữ liệu dễ dàng hơn**: Việc quản lý dữ liệu trên các bảng lớn có thể trở nên phức tạp. Bảng phân vùng giúp đơn giản hóa việc quản lý và bảo trì dữ liệu bằng cách chia thành các phần nhỏ hơn.

Tuy nhiên, việc sử dụng bảng phân vùng cũng đòi hỏi sự thiết kế cơ sở dữ liệu cẩn thận và quản lý thông minh. Nó không phải lúc nào cũng là lựa chọn tốt và phụ thuộc vào yêu cầu cụ thể của dự án. Đối với các bảng nhỏ hoặc các trường hợp sử dụng dữ liệu đơn giản, không cần sử dụng bảng phân vùng có thể là một lựa chọn tốt hơn.

Bảng phân vùng (Partition Table) có những ưu điểm và nhược điểm riêng biệt, và việc sử dụng chúng nên được xem xét cẩn thận dựa trên yêu cầu cụ thể của dự án và hệ thống cơ sở dữ liệu. Dưới đây là một số ưu điểm và nhược điểm chính của bảng phân vùng:

## Ưu điểm của Partition Table

1. **Tối ưu hiệu suất**: Giúp cải thiện hiệu suất truy vấn và thao tác dữ liệu bằng cách chia dữ liệu thành các phân vùng nhỏ hơn. Điều này làm giảm thời gian truy xuất dữ liệu vì DBMS chỉ cần quét các phân vùng chứa dữ liệu cần thiết.

2. **Quản lý dễ dàng**: Giúp đơn giản hóa việc quản lý và bảo trì dữ liệu trên các bảng lớn. Việc tạo và quản lý các phân vùng có thể được thực hiện dễ dàng.

3. **Phân vùng dựa trên cột**: Cho phép phân vùng dữ liệu dựa trên giá trị của một hoặc nhiều cột, giúp tối ưu hóa truy vấn dựa trên các cột đó.

4. **Backup và Restore dễ dàng**: Cho phép sao lưu và khôi phục dữ liệu theo từng phân vùng, giúp tối ưu hóa thời gian và tài nguyên khi thực hiện các hoạt động này.

5. **Lưu trữ dữ liệu lịch sử**: Dễ dàng quản lý và lưu trữ dữ liệu lịch sử bằng cách chuyển dữ liệu cũ vào các phân vùng riêng biệt.

## Nhược điểm của Partition Table

1. **Phức tạp trong thiết kế**: Thiết kế và triển khai bảng phân vùng có thể phức tạp và đòi hỏi sự xem xét kỹ lưỡng. Việc quyết định cách phân vùng dữ liệu cũng là một nhiệm vụ quan trọng.

2. **Tiêu tốn tài nguyên**: Mỗi phân vùng sẽ tiêu tốn một lượng tài nguyên nhất định, bao gồm không gian lưu trữ và bộ nhớ hệ thống. Vì vậy, nếu bạn chia nhỏ quá nhiều, có thể dẫn đến lãng phí tài nguyên.

3. **Khó khăn trong quản lý thay đổi**: Khi bạn cần thay đổi cấu trúc hoặc phân vùng của bảng, việc quản lý các thay đổi này có thể phức tạp và đòi hỏi sự cân nhắc kỹ lưỡng.

4. **Không phù hợp cho bảng nhỏ**: Đối với các bảng dữ liệu nhỏ hoặc không có yêu cầu truy vấn phức tạp, sử dụng bảng phân vùng có thể là quá phức tạp và không cần thiết.

5. **Khó di chuyển dữ liệu**: Khi bạn muốn di chuyển dữ liệu giữa các hệ thống hoặc cơ sở dữ liệu khác nhau, việc di chuyển dữ liệu từ các phân vùng có thể đòi hỏi sự quản lý cẩn thận để đảm bảo tính toàn vẹn của dữ liệu.

Tóm lại, việc sử dụng bảng phân vùng là một quyết định quan trọng và phụ thuộc vào tình huống cụ thể của dự án và yêu cầu về hiệu suất và quản lý dữ liệu.

# Backup

---

Trong SQL (Structured Query Language), "backup" là một quá trình tạo ra một bản sao lưu (copy) của cơ sở dữ liệu hoặc một phần của cơ sở dữ liệu nhằm đảm bảo an toàn và khả năng khôi phục dữ liệu trong trường hợp sự cố, lỗi, hoặc mất dữ liệu không mong muốn. Bản sao lưu này thường được lưu trữ trong một vị trí an toàn khác với cơ sở dữ liệu gốc.

## Một số điểm quan trọng về backup trong SQL:

1. **Loại backup**: Có hai loại chính của backup trong SQL: full backup (sao lưu đầy đủ) và differential backup (sao lưu chênh lệch). 

    - **Full Backup**: Sao lưu toàn bộ dữ liệu của cơ sở dữ liệu vào một thời điểm cụ thể. Đây là loại backup đầu tiên thường được thực hiện và nó bao gồm toàn bộ dữ liệu trong cơ sở dữ liệu.

    - **Differential Backup**: Sao lưu chỉ các thay đổi từ lúc sao lưu đầy đủ gần nhất. Điều này giúp giảm dung lượng và thời gian cần thiết cho việc sao lưu.

2. **Lịch trình backup**: Backup thường được lên lịch trình để thực hiện tự động định kỳ. Lịch trình này có thể hàng ngày, hàng tuần, hoặc theo bất kỳ tần suất nào tùy thuộc vào yêu cầu của hệ thống.

3. **Khôi phục dữ liệu**: Backup không chỉ đảm bảo an toàn dữ liệu mà còn cho phép khôi phục dữ liệu trong trường hợp cần thiết, chẳng hạn như khi xảy ra lỗi, hỏng hóc, hoặc mất dữ liệu.

4. **Nơi lưu trữ backup**: Bản sao lưu thường được lưu trữ ở nơi khác với cơ sở dữ liệu gốc để đảm bảo rằng nó không bị mất cùng với cơ sở dữ liệu trong trường hợp sự cố.

5. **Câu lệnh backup SQL**: Mỗi hệ quản trị cơ sở dữ liệu (ví dụ: SQL Server, MySQL, PostgreSQL) cung cấp các câu lệnh riêng để thực hiện backup. Câu lệnh backup thường đi kèm với các tùy chọn để xác định loại và vị trí lưu trữ của backup.

Việc thực hiện backup là một phần quan trọng trong quản lý cơ sở dữ liệu để đảm bảo tính toàn vẹn và sẵn sàng của dữ liệu trong trường hợp xảy ra sự cố.

# Recover
---
Trong SQL (Structured Query Language), "recover" (khôi phục) là quá trình phục hồi dữ liệu từ các bản sao lưu (backup) sau khi xảy ra sự cố hoặc lỗi trong hệ thống cơ sở dữ liệu. Quá trình này nhằm đảm bảo rằng dữ liệu trong cơ sở dữ liệu có thể được khôi phục về trạng thái trước khi xảy ra sự cố một cách an toàn và chính xác.

## Các điểm quan trọng về khôi phục trong SQL bao gồm:

1. **Backup là điều kiện tiên quyết**: Để khôi phục dữ liệu, bạn cần có các bản sao lưu hợp lệ đã được tạo trước đó. Khôi phục không thể thực hiện nếu không có bản sao lưu.

2. **Loại khôi phục**: Có hai loại chính của khôi phục trong SQL:

   - **Khôi phục toàn bộ (Full Restore)**: Khôi phục toàn bộ cơ sở dữ liệu từ một bản sao lưu đầy đủ. Điều này thường được thực hiện khi cơ sở dữ liệu gốc gặp sự cố nghiêm trọng và bạn muốn trả lại cơ sở dữ liệu về trạng thái hoàn chỉnh nhất từ bản sao lưu gần nhất.

   - **Khôi phục không gian (Point-in-Time Restore)**: Khôi phục cơ sở dữ liệu đến một thời điểm cụ thể trong quá khứ. Điều này có thể hữu ích khi bạn cần lấy lại dữ liệu ở một điểm thời gian trước khi sự cố xảy ra, chẳng hạn như xóa dữ liệu không mong muốn.

3. **Câu lệnh khôi phục SQL**: Mỗi hệ quản trị cơ sở dữ liệu (ví dụ: SQL Server, MySQL, PostgreSQL) cung cấp các câu lệnh riêng để thực hiện quá trình khôi phục. Câu lệnh này thường được sử dụng để chỉ định loại và vị trí của bản sao lưu cần được khôi phục.

4. **Quyền hạn và an toàn**: Để thực hiện quá trình khôi phục, người dùng thường cần có quyền hạn và quyền truy cập đủ trong hệ thống cơ sở dữ liệu.

Quá trình khôi phục dữ liệu rất quan trọng để đảm bảo rằng dữ liệu của bạn được bảo vệ và có thể khôi phục lại trong trường hợp xảy ra sự cố. Việc xây dựng và thực hiện kế hoạch sao lưu và khôi phục là một phần quan trọng của quản lý cơ sở dữ liệu.