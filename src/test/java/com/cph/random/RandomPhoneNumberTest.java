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
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author cpharmant
 * @since 0.0.1
 */
@RunWith(Parameterized.class)
public class RandomPhoneNumberTest {

	public RandomPhoneNumberTest() {
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[1000][0]);
	}

	@Test
	public void test() {
		final String phoneNumber = RandomGenerator.getRandomPhoneNumber();
		assertNotNull("Phone number generated null", phoneNumber);
		assertThat("Phone number generated is not valid",
				phoneNumber.matches(RandomGenerator.PHONE_NUMBER_REGEX),
				is(true));
	}
}
