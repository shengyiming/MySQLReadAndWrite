package com.tianxingshuke.MySQLReadAndWrite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDao implements UserDaoInterface{

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(javax.sql.DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public int addUser(User user) {
		return jdbcTemplate.update("insert into user values (null,?)", user.getName());
	}
	public List<User> getUser(){
		return jdbcTemplate.query("select id,name from user", new UserMapper());
	}
	private static final class UserMapper implements RowMapper<User> {
	    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	        User user = new User();
	        user.setId(rs.getInt("id"));
	        user.setName(rs.getString("name"));
	        return user;
	    }
	}
	public int delete() {
		int result = jdbcTemplate.update("delete from user");
		return result;
	}
}
