package caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {
	
	private CaesarsCipher caesarCipher = new CaesarsCipher();
	

	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("Z   S W     V [ Y   VS ", caesarCipher.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesarCipher.cipher("", 12));
	}

}
