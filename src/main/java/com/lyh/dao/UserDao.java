package com.lyh.dao;

import com.lyh.bean.User;

public interface UserDao {

	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(Integer id);
	User queryUser(String name);
}
