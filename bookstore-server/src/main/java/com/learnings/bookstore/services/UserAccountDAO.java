package com.learnings.bookstore.services;

import com.learnings.bookstore.model.User;
import com.learnings.bookstore.repositories.users.UserRepository;

/**
 * DAO acts as interface between servlet and repository implementation to do all CRUD operation
 * on user account.
 * 
 * TODO:
 * 1) Complete all method implementations.
 * 
 * @author nkanagar
 */
public class UserAccountDAO {

	/**
	 * TODO:
	 * Complete the instance of user repository.
	 */
	private UserRepository userRepository;
	
	public void createUserAccount(User users) {
	}

	public void getAllUserAccounts() {
	}

	public User deleteUserAccount(User user) {
		return null;
	}

	public void updateUserAccount(User user) {
	}
}
