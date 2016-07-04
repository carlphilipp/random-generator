package com.cph.random;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author cpharmant
 * @since 0.0.1
 */
public class RandomNamesTest {

	@Test
	public void testGenerateFirstName() {
		String firstName = RandomGenerator.generateFirstName();
		assertNotNull(firstName);
	}

	@Test
	public void testGenerateLastName() {
		String lastName = RandomGenerator.generateLastName();
		assertNotNull(lastName);
		String lastName2 = RandomGenerator.generateLastName();
	}
}
