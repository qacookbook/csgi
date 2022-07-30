import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CountingWordsDemoTest {
	

	/**
	 * Test method to test for Equals with assertEquals after passing empty non null data
	 */
	@Test
	public void testWithEmptyList() {
		List<String> words = new ArrayList<String>();
		List<String> startsWith = new ArrayList<String>();
		List<String> actual = CountingWordsDemo.getWords(words,startsWith,1);
		List<String> expected = null;
		assertEquals(expected, actual);
	}
	
	/**
	 * Test method to test for Equals with assertEquals after passing Data(List of Strings & business rules) to getWords
	 */
	@Test
	public void testWithValidData() {
		List<String> words = new ArrayList<String>();
		words.add("Monkey");
		words.add("monday");
		words.add("example");
		List<String> startsWith = new ArrayList<String>();
		startsWith.add("M");
		startsWith.add("m");
		List<String> actual = CountingWordsDemo.getWords(words,startsWith,5);
		List<String> result = new ArrayList<String>();
		result.add("Monkey");
		result.add("monday");
		List<String> expected = result;
		assertEquals(expected, actual);
	}
	
	/**
	 * Test method to test for Equals with assertEquals after passing Data(List of Strings & business rules) to getWords
	 */
	@Test
	public void testWithInvalidData() {
		List<String> words = new ArrayList<String>();
		words.add("  Max");
		words.add("min");
		words.add("test");
		words.add("example");
		List<String> startsWith = new ArrayList<String>();
		startsWith.add("M");
		startsWith.add("m");
		List<String> actual = CountingWordsDemo.getWords(words,startsWith,5);
		List<String> result = new ArrayList<String>();
		List<String> expected = result;
		assertEquals(expected, actual);
	}
}
