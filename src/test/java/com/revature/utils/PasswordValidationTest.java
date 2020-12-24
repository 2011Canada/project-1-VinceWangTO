package com.revature.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

	@Test
	public void VerifyProvidedPassword() {

		String myPassword = "password";

		String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword);

		System.out.println(mySecurePassword);

		boolean passwordMatch = PasswordUtils.verifyUserPassword(myPassword, mySecurePassword);

		assertEquals(passwordMatch, true);

	}
}
