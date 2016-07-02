package com.cph.random;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RandomGeneratorTest {

	@Test
	public void testGetRandomEmail() {
		String email = RandomGenerator.getRandomEmail();
		assertNotNull(email);
	}
}
