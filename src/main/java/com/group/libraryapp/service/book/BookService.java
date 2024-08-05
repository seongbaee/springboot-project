package com.group.libraryapp.service.book;

import com.group.libraryapp.repository.book.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    /* @Repository 어노테이션을 통해 스프링 빈 등록하게 되면 생성자를 통해 BookRepository 를 받아오게 됨 */
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook() {
        bookRepository.saveBook();
    }

}
