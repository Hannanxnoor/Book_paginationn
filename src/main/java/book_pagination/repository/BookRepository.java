package book_pagination.repository;


import book_pagination.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
