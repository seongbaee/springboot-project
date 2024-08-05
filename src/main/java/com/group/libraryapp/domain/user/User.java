package com.group.libraryapp.domain.user;

import javax.persistence.*;

@Entity // @Entity: 스프링이 User 객채와 user 테이블을 같은 것으로 바라본다. 라는 의미
public class User {

    @Id // 이 필드를 primary key로 간주한다는 의미.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // primary key는 자동 생성되는 값이라는 의미 / MySql의 auto_increment 와 동일
    private Long id = null;

    @Column(nullable = false, length = 20) // name varchar(20) / @Column:  null이 들어갈 수 있는지 여부, 길이 제한, DB에서의 column 이름 등등 설정
    private String name;

    private Integer age;

    protected User() {} // JPA를 사용하기 위해서는 기본 생성자가 꼭! 필요하다.

    public User(String name, Integer age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.", name));
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public void updateName(String name) {
        this.name = name;
    }
}
