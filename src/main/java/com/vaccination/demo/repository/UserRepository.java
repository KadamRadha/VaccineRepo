package com.vaccination.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	@Autowired
	public EntityManager entityManager;
	
	@Transactionl
	public User addUser(User user) {
		user.setUid(null);
		userEntity userEntity = UserTransformUser(user);
		entityManager.persist(userEntity);
		return UserTransformUserEntity(userEntity);
		
	}

}
