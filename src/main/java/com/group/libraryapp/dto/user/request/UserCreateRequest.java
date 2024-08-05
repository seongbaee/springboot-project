package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; // int = null을 표현할 수 없음 / Integer = null을 표현할 수 있음

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
