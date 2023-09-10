package repository.repositoryImpl;

import entity.Author;
import entity.Book;
import repository.BaseRepository;
import repository.BookRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    private Connection connection=BaseRepository.connection();
    @Override
    public List<Book> findAll() {
        List<Book> books=new ArrayList<>();
        String sql="select *\n" +
                "from Book";

        try {
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                books.add(new Book(resultSet.getString("id"), resultSet.getString("name"),resultSet.getString("authorId") ));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public Book create(Book book) {
        String sql="insert into book values(?,?,?)";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, book.getId());
            preparedStatement.setString(2, book.getName());
            preparedStatement.setString(3, book.getAuthorId());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete() {

    }
}
