package com.tianxingshuke.MySQLReadAndWrite;

import java.util.List;

public interface UserDaoInterface {
	@DataSource(value = "write")
	public int addUser(User user);
	@DataSource(value="read")
	public List<User> getUser();
	@DataSource(value="write")
	public int delete();
}
