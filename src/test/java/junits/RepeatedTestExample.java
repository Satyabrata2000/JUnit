package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestExample {

	
	@RepeatedTest(3)
	public void subTest1() {
		assertEquals(1, Calculator.sub(5,4));
	}
}
