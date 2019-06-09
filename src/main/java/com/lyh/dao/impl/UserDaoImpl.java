package com.lyh.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.lyh.bean.User;
import com.lyh.dao.UserDao;

@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void insertUser(User user) {
		mongoTemplate.save(user);
	}

	@Override
	public void updateUser(User user) {
		Query query = new Query(Criteria.where("id").is(user.getId()));
		Update update = new Update().set("age", user.getAge()).set("status", user.getStatus()).set("name", user.getName());
		//单条
		mongoTemplate.updateFirst(query, update, user.getClass());
		//多条
		//mongoTemplate.updateMulti(query, update, user.getClass());
	}

	@Override
	public void deleteUser(Integer id) {
		Query query = new Query(Criteria.where("id").is(id));
		mongoTemplate.remove(query,User.class);
	}

	@Override
	public User queryUser(String name) {
		Query query = new Query(Criteria.where("name").is(name));
		return mongoTemplate.findOne(query, User.class);
	}

}
