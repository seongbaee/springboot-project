package com.group.libraryapp.repository.user;

import com.group.libraryapp.dto.user.response.UserResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/** SQL 을 사용해 실제 DB 와의 통신을 담당한다. */
@Repository
public class UserJdbcRepository {

    private final JdbcTemplate jdbcTemplate;

    public UserJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean isUserNotExist(long id) {
        String readSql = "select * from user where id = ?";
        return jdbcTemplate.query(readSql, (rs, rowNum) -> 0, id).isEmpty();
        // (rs, rowNum) -> 0 의미: readSql 사용해서 데이터가 조회 됐을 때 결과가 존재하면 무조건 0을 반환하도록 한다는 의미. // 또한 jdbcTemplate.query() 메서드는 리스트를 반환함.
    }

    public boolean isUserNotExist(String name) {
        String readSql = "select * from user where name = ?";
        return jdbcTemplate.query(readSql, (rs, rowNum) -> 0, name).isEmpty(); // (rs, rowNum) -> 0 의미: readSql 사용해서 데이터가 조회 됐을 때 결과가 존재하면 무조건 0을 반환하도록 한다는 의미. // 또한 jdbcTemplate.query() 메서드는 리스트를 반환함.
    }

    public void saveUser(String name, Integer age) {
        String sql = "insert into user(name, age) values(?, ?)";
        jdbcTemplate.update(sql, name, age);
    }

    public List<UserResponse> getUsers() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            long id = rs.getLong("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            return new UserResponse(id, name, age);
        });
    }

    public void updateUserName(String name, long id) {
        String sql = "update user set name = ? where id = ?";
        jdbcTemplate.update(sql, name, id);
    }

    public void deleteUser(String name) {
        String sql = "delete from user where name = ?";
        jdbcTemplate.update(sql, name);
    }
}
