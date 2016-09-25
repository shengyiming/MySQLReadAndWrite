package com.tianxingshuke.MySQLReadAndWrite;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class AppTest {
	@Resource 
	UserDao userDao;

	@Test
	public void testGetTest(){
		List<User> list = userDao.getUser();
		for(User user : list){
			System.out.println(user.toString());
		}
	}

	@Test
	public void testMyTest(){
		User user = new User();
		user.setName("xxxxxxxx");
		int result = userDao.addUser(user);
		System.out.println(result);
	}
	
	@Test
	public void testDelete(){
		int delete = userDao.delete();
		System.out.println(delete);
	}
}
