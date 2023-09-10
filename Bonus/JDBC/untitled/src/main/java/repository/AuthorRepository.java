package repository;

import entity.Author;

import java.util.List;

public interface AuthorRepository {
    public List<Author> findAll();
    public Author create();
    public void delete();
}
