package com.cph.random;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author cpharmant
 * @since 0.0.1
 */
public class RandomStringTest {

	@Test
	public void testGenerateRandomString() {
		String randomString = RandomGenerator.generateRandomString();
		assertNotNull(randomString);
		assertThat(randomString.contains("-"), is(false));
	}
}
