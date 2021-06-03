package com.bridgelabz.birdsanctuary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	 void givenBird_IfNull_ShouldThrowBirdSan()throws BirdSanctuaryException {
		BirdSanctuaryManager birdsan = new BirdSanctuaryManager();
		Birds bird = new Parrot(null);
		birdsan.add(bird);
		Assertions.assertThrows(BirdSanctuaryException.class, () -> birdsan.add(bird));
	}
}
