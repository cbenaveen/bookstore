package com.learnings.bookstore.repositories.users;

import java.util.List;
import java.util.Map;

import com.learnings.bookstore.model.User;

/**
 * Memory based user repository which stores all the user account in memory.
 * As things are stored in memory when the application is stopped/shutdown the information will be wiped out.
 * 
 * What you will learn here:
 * =================
 * 1) Understand what is Map interface
 * 2) Understand various map implementations 
 * 3) How to create a map
 * 4) Basic CRUD operations with map.
 * 
 * TODO:
 * This class does not marked with any access modifiers, which means its default
 * Understand about that. 
 * 
 * @author nkanagar
 */
class MemoryBasedUserRepository extends AbstractUserRepository {
	
	/**
	 * TODO:
	 * Create appropriate instance of map.
	 * Make sure you use understand about the map which you are going to use here. 
	 */
	private Map<String, User> userAccounrMemoryTable = null;
	
	/**
	 * TODO:
	 * Method should insert the given user account into userAccounrMemoryTable.
	 * get the email id from the User object and use that as key and user object as value.
	 * 
	 * If you insert is successful return true; else you may return false.
	 */
	public boolean create(final User user) throws IllegalArgumentException {
		return false;
	}

	/**
	 * TODO:
	 * Method should delete the given user account form userAccounrMemoryTable.
	 * 
	 * If you delete is successful return true; else you may return false.
	 */
	public void delete(final User user) throws IllegalArgumentException {
	}

	/**
	 * TODO:
	 * Method should delete the given user account form userAccounrMemoryTable using email id
	 * 
	 * If you delete is successful return true; else you may return false.
	 */
	public void delete(final String emailId) throws IllegalArgumentException {
	}

	/**
	 * TODO:
	 * Return all the user account
	 */
	public List<User> getAllUsers() {
		return null;
	}

	/**
	 * TODO:
	 * Return the user account whoes email id is equals to given id
	 */
	public User getUser(final String emailId) throws IllegalArgumentException {
		return null;
	}
}
