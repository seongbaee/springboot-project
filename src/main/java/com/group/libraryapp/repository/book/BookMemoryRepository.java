package com.group.libraryapp.repository.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.ArrayList;

@Repository
public class BookMemoryRepository implements BookRepository {

    @Override
    public void saveBook() {
        System.out.println("MemoryRepository");
    }

}
