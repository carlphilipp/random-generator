package com.cph.random;

import java.util.UUID;

public class RandomGenerator {

	public static String getRandomUniqueEmail() {
		return UUID.randomUUID().toString() + "@" + UUID.randomUUID().toString() + ".com";
	}

	public static String getRandomUniqueEmailWithoutDash() {
		return getRandomUniqueEmail().replace("-", "");
	}
}
