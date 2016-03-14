package com.learnings.bookstore.repositories.users;

import java.util.List;

import com.learnings.bookstore.model.User;

/**
 * Interface represents  possible operations to be taken care against a user account.
 * 
 * @author nkanagar
 */
public interface UserRepository {
	
	/**
	 * Create a user account 
	 * 
	 * @param user User account POJO with user details
	 * @return true, if user account creation is successful.
	 * 				  false, in case of any failures
	 * @throws IllegalArgumentException if the User account does not set with email id, as the 
	 * 	email id is the unique key to identify the account either in memory or db.
	 */
	public boolean create(final User user) throws IllegalArgumentException;
	
	/**
	 * Deletes the user account
	 * 
	 * @param user User account POJO with user details
	 * @throws IllegalArgumentException if the User account does not set with email id, as the 
	 * 	email id is the unique key to identify the account either in memory or db.
	 */
	public void delete(final User user) throws IllegalArgumentException;
	
	/**
	 * Just a convenient method to Delete the user account just by giving the email id.
	 * 
	 * @param emailId Email ID of the user which uniquely identifies the user account in the repoistory
	 * @throws IllegalArgumentException if the email id is invalid
	 */
	public void delete(final String emailId) throws IllegalArgumentException;
	
	/**
	 * Returns all the users from repository. 
	 * 
	 * Ideally this method should take start index, offset value to limit the result set. 
	 * However since this learning project i am omitting this as of now.
	 * 
	 * @return {@link List} of User accounts with all the required fields are populated
	 */
	public List<User> getAllUsers();
	
	/**
	 * Retrieve a particular user by user's mail id from repository.
	 * 
	 * @param emailId Email ID of th user
	 * @return {@link User} User account
	 * @throws IllegalArgumentException if the email id is not valid
	 */
	public User getUser(final String emailId) throws IllegalArgumentException;
	
	/**
	 * Update the user account.
	 * At this moment i dont see any valid need of this method. But keeping it just to support CRUD.
	 * 
	 * @param user {@link User} User account
	 * @return true/false
	 */
	public boolean update(final User user);
}
