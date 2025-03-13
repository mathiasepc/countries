package kea.iabr.countries.repository;

import kea.iabr.countries.model.Country;
import kea.iabr.countries.model.CountryRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepository {

    private final JdbcTemplate jdbc;

    public CountryRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    public List<Country> findAll() {
        String sql = "SELECT * FROM countries";
        return jdbc.query(sql,new CountryRowMapper());
    }
}







