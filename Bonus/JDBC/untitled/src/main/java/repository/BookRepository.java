package repository;

import entity.Book;

import java.util.List;

public interface BookRepository {
    public List<Book> findAll();
    public Book create(Book book);
    public void delete();
}
