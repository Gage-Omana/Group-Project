package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.Player;

public class PlayerTest {
	
	
		
	Player testPlayer = new Player("Mark", 5, "Horror");
	

	@Test
	public void testGetPlayerName() {
		
    	assertEquals("Mark", testPlayer.getPlayerName());
		
	}
	
	@Test
	public void testGetScores(){
		assertEquals(5, testPlayer.getScores());
	}
	
	@Test
	public void testGetCategory(){
    	assertEquals("Horror", testPlayer.getCategory());

	}
	
	@Test
	public void testToString(){
		
		assertEquals("Mark,5,Horror", testPlayer.toString());
	}

}
