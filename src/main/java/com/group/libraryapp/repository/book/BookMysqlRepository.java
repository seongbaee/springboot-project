package com.group.libraryapp.repository.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary // ** @Primary: 우선권을 결정하는 어노테이션
@Repository
public class BookMysqlRepository implements BookRepository {

    @Override
    public void saveBook() {
        System.out.println("MysqlRepository");
    }

}
