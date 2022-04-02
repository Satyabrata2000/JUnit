package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

	@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	@Tag("Sanity")
	@DisplayName("Positive Test")
	@Test
	
public @interface CustomAnnotation {
	
}
