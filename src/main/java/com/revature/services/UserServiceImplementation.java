package com.revature.services;

import com.revature.models.User;
import com.revature.repositories.UserDAOImplementation;
import com.revature.utils.PasswordUtils;

public class UserServiceImplementation implements UserService {

	private UserDAOImplementation userd;

	public UserServiceImplementation(UserDAOImplementation userd) {
		this.userd = userd;
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		User user = userd.findUserByName(username);
		if (user != null) {
//			String securePassword = PasswordUtils.generateSecurePassword(password);
//			System.out.println(securePassword);
			boolean passwordMatch = PasswordUtils.verifyUserPassword(password, user.getPassword());

			if (passwordMatch)
				return user;
		}
		return null;
	}

}
