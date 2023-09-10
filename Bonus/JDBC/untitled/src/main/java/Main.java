import entity.Book;
import repository.BaseRepository;
import repository.BookRepository;
import repository.repositoryImpl.BookRepositoryImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Connection connection= BaseRepository.connection();
//        try {
//            boolean isConnected = connection.isValid(5); // Kiểm tra kết nối trong 5 giây
//            if (isConnected) {
//                System.out.println("Connect Successfully");
//            } else {
//                System.out.println("Connect Fail!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        Scanner scanner=new Scanner(System.in);
        String id;
        System.out.println("NHAP ID");
        id= scanner.nextLine();
        String name;
        System.out.println("NHAP NAME");
        name= scanner.nextLine();
        String authorId;
        System.out.println("NHAP AUTHOR ID");
        authorId= scanner.nextLine();
        Book book=new Book(id,name,authorId);

        BookRepository bookRepository=new BookRepositoryImpl();
        bookRepository.create(book);
        List<Book> books=bookRepository.findAll();
        for(Book x: books){
            System.out.println(x.getId()+" - "+x.getName());
        }

    }
}
