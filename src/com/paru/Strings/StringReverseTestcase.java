package com.paru.Strings;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.paru.Strings.StringRevers;


public class StringReverseTestcase {
	StringRevers stringRevers = null;
	//StringReverseTestcase stringReverseTestcase = null;
	WordCount wordCount = null;
	
	@Before
	public void setUp() throws Exception { 
		stringRevers = new StringRevers();
		//stringReverseTestcase = new StringReverseTestcase();
		wordCount = new WordCount();
	}

	@After
	public void tearDown() throws Exception {
		stringRevers = null;
		//stringReverseTestcase = null;
		wordCount = null;
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void getStringRevUsingSb() {
		String base = "ravi";
		String expected	= "ivar";
		String generated = stringRevers.StringRevUsingSb(base);
		assertEquals(expected, generated);
	}
	@Test
	public void getwordCountInSentence(){
		String sentence = "java is a programing language. java is simple. java is used for many apllications.";
		String word = "java";
		int generated = wordCount.wordCountInSentence(sentence, word);
		System.out.println(generated);
		int exp = 3;
		assertEquals(generated , exp);
	}
	
	@Test
	public void getRemoveWhiteSpace () {
		String sentence = "paramesh  mekala";
		String generated = stringRevers.removeWhiteSpace(sentence);
		String expected = "parameshmekala";
		assertEquals(generated , expected);
	}

}
