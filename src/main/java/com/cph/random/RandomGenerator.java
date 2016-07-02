package com.cph.random;

import java.util.UUID;

public class RandomGenerator {

	public static String getRandomEmail() {
		return UUID.randomUUID().toString() + "@" + UUID.randomUUID().toString() + ".com";
	}
}
