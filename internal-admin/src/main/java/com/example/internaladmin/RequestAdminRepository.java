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
                FROM applications
                """;

        return jdbcTemplate.query(sql, this::mapRowToRequest);
    }

    private Request mapRowToRequest(ResultSet rs, int rowNum) throws SQLException { 
        return new Request(
            rs.getInt("application_id"),
            rs.getTimestamp("application_datetime").toLocalDateTime(),
            rs.getBoolean("approved_flag"),
            rs.getString("applicant_name"),
            rs.getString("applicant_address"),
            rs.getString("application_details")
        );
    }
}
