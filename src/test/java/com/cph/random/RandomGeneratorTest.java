/**
 * Copyright 2016 Carl-Philipp Harmant
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cph.random;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author cpharmant
 * @since 0.0.1
 */
public class RandomGeneratorTest {

	private static String EMAIL_REGEX = ".*@.*\\.com";

	@Test
	public void testGetRandomEmail() {
		String email = RandomGenerator.getRandomEmail();
		assertNotNull(email);
		assertThat(email.matches(EMAIL_REGEX), is(true));
	}

	@Test
	public void testGetRandomUniqueEmailWithoutDash() {
		String email = RandomGenerator.getRandomEmailWithoutDash();
		assertNotNull(email);
		assertThat(email.matches(EMAIL_REGEX), is(true));
		assertThat(email.contains("-"), is(false));
	}
}
