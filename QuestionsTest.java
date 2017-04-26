package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Questions;

public class QuestionsTest {
	
	Questions question = new Questions("Action","What movie is Sylvester Stallone the main Character?",
			"Over the top","Babe","Star Wars","Titanic");

	@Test
	public void testGetCategory() {
		assertEquals("Action", question.getCategory());
	}
	
	@Test
	public void testGetQuestion(){
		assertEquals("What movie is Sylvester Stallone the main Character?", question.getQuestion());
	}
	
	@Test
	public void testGetAnswer(){
		assertEquals("Over the top", question.getAnswer());
	}
	
	@Test
	public void testGetWrong1() {
		assertEquals("Babe", question.getWrong1());
	}
	
	@Test
	public void testGetWrong2() {
		assertEquals("Star Wars", question.getWrong2());
	}
	/**
	 * @return the wrong3
	 */
	public void testGetWrong3() {
		assertEquals("Titanic", question.getWrong3());
	}

}
