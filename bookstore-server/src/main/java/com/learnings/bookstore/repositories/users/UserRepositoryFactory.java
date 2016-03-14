package com.learnings.bookstore.repositories.users;

/**
 * Factory implementation returns the {@link UserRepository} implementation based
 * on give key.
 * 
 * TODO:
 * 1) I have marked this class with final key word. Understand why i am doing like that?
 * 2) I have used enum here to define repository types. Understand more about enum's.
 * 3) I am using factory pattern here. Should understand that as well.
 * 
 * @author nkanagar
 */
public final class UserRepositoryFactory {
	public static enum  RPO_TYPE {
		MEMORY,
		DB
	}
	
	public static final UserRepository getRepository(final RPO_TYPE type){
		if(RPO_TYPE.MEMORY == type){
			return new MemoryBasedUserRepository();
		} else {
			throw new UnsupportedOperationException("No DB Based repository available at the moment");
		}
	}
}
