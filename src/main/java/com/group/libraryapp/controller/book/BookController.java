package com.group.libraryapp.controller.book;

import com.group.libraryapp.service.book.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    /* @Service 어노테이션을 사용하면 BookService 를 직접 인스턴스화 해서 사용하지 않고
    * 아래와 같이 BookService 생성자를 만들어 스프링 빈을 주입받게 된다.
    * (생성자를 통해서 컨테이너가 대신 BookService 를 넣어주게 됨) */
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public void saveBook() {
        bookService.saveBook();
    }
}
