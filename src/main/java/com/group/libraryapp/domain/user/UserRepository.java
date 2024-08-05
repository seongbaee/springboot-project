package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name); // select * from user where name = ?; 과 동일

    boolean existsByName(String name); // 쿼리 결과가 존재하는지 여부 확인.

    long countByAge(Integer age); // 해당 age에 맞는 유저의 명 수를 모두 세서 반환.
}
