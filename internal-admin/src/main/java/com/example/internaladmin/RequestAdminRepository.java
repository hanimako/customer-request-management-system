package com.example.internaladmin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RequestAdminRepository {
    
    private final JdbcTemplate jdbcTemplate;

    public RequestAdminRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Request> findAll() {
        String sql = """
                SELECT *
                FROM requests
                """;

        return jdbcTemplate.query(sql, this::mapRowToRequest);
    }

    private Request mapRowToRequest(ResultSet rs, int rowNum) throws SQLException { 
        return new Request(
            rs.getInt("id"),
            rs.getTimestamp("request_datetime").toLocalDateTime(),
            rs.getBoolean("approved"),
            rs.getString("requester_name"),
            rs.getString("requester_address"),
            rs.getString("content")
        );
    }
}
