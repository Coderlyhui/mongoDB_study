package com.example.countWord;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lyh.bean.User;
import com.lyh.dao.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	UserDao userDao;
	
	@Test
	public void test() {
		User user = new User();
		user.setId(2);
		user.setAge(66);
		user.setName("rain");
		
		userDao.insertUser(user);
	}

	@Test
	public void test2() {
		User user = new User();
		user.setId(1);
		user.setAge(86);
		user.setName("hfahgiu");
		user.setStatus("open");
		
		userDao.updateUser(user);
	}
	
	@Test
	public void test3() {
		User user = new User();
		user.setName("hfahgiu");
		User queryUser = userDao.queryUser(user.getName());
		System.out.println(queryUser);
	}
	
	@Test
	public void test4() {
		userDao.deleteUser(1);
	}
}
