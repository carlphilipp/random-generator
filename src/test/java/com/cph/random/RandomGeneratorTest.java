package com.cph.random;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RandomGeneratorTest {

	@Test
	public void testGetRandomUniqueEmail() {
		String email = RandomGenerator.getRandomUniqueEmail();
		assertNotNull(email);
		assertThat(email.matches(".*@.*\\.com"), is(true));
	}

	@Test
	public void testGetRandomUniqueEmailWithoutDash() {
		String email = RandomGenerator.getRandomUniqueEmailWithoutDash();
		assertNotNull(email);
		assertThat(email.matches(".*@.*\\.com"), is(true));
		assertThat(email.contains("-"), is(false));
	}
}
