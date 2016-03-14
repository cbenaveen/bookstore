package com.learnings.bookstore.repositories.users;

import com.learnings.bookstore.model.User;

/**
 * TODO:
 * This class does not marked with any access modifiers, which means its default
 * Understand about that. 
 *
 * @author nkanagar
 *
 */
abstract class AbstractUserRepository implements UserRepository {
	public boolean update(final User user) {
		throw new UnsupportedOperationException("User Repository update operation is not supported");
	}
}
