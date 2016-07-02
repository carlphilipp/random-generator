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

import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author cpharmant
 * @since 0.0.1
 */
public class RandomGenerator {

	static final String PHONE_NUMBER_REGEX = "^(1-?)?(\\([2-9]\\d{2}\\)|[2-9]\\d{2})-?[2-9]\\d{2}-?\\d{4}$";
	private static final Pattern PATTERN_PHONE_NUMBER = Pattern.compile(PHONE_NUMBER_REGEX);
	private static final Random RANDOM = new Random();

	public static String getRandomEmail() {
		return UUID.randomUUID().toString() + "@" + UUID.randomUUID().toString() + ".com";
	}

	public static String getRandomEmailWithoutDash() {
		return getRandomEmail().replace("-", "");
	}

	public static String getRandomPhoneNumber() {
		String phoneNumber = generatePhoneNumber();
		while (!isValidUSPhoneNumber(phoneNumber)) {
			phoneNumber = generatePhoneNumber();
		}
		return phoneNumber;
	}

	private static String generatePhoneNumber() {
		final int areaCode = generateRandomNumberInRange(0, 1000);
		final int subscriberNumber = generateRandomNumberInRange(0, 10_000_000);
		return String.format("%03d", areaCode) + String.format("%07d", subscriberNumber);
	}

	private static int generateRandomNumberInRange(final int lower, final int upper) {
		return RANDOM.nextInt(upper - lower) + lower;
	}

	private static boolean isValidUSPhoneNumber(final String phoneNumber) {
		final Matcher matcher = PATTERN_PHONE_NUMBER.matcher(phoneNumber);
		return matcher.find();
	}
}
