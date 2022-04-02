package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class StringFunctionsTest {
	
	@CustomAnnotation
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
	}

	@CustomAnnotation
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrome("test"));
	}
}
