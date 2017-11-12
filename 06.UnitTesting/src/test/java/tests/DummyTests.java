package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import rpg_lab.Dummy;
import rpg_lab.Target;

public class DummyTests {
	
	private static final int DUMMY_HEALTH = 10;
	private static final int DUMMY_XP = 10;
	
	private static final int ATTACK_POINTS = 10;
	private static final String WRONG_HEALTH_MESSAGE = "Wrong health";
	private static final String WRONG_XP_MESSAGE = "Wrong experience.";
	
	private Target dummy;
	
	@Before
	public void createDummy() {
		this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
	}
	
	@Test
	public void testHealthLoseUponAttack() {
		// Act
		this.dummy.takeAttack(5);
		
		// Assert
		Assert.assertEquals(WRONG_HEALTH_MESSAGE, DUMMY_HEALTH - this.dummy.getHealth(), this.dummy.getHealth());
	}
	
	@Test(expected = IllegalStateException.class) // Assert
	public void attackingDeadDummyThrowsException() {
		// Act
		this.dummy.takeAttack(ATTACK_POINTS);
		this.dummy.takeAttack(ATTACK_POINTS);
	}
	
	@Test
	public void testDeadDummyGivesXPWhenKilled() {
		// Act
		this.dummy.takeAttack(ATTACK_POINTS);		
		
		// Assert
		Assert.assertTrue(this.dummy.giveExperience() == 10);
		Assert.assertEquals(WRONG_XP_MESSAGE, DUMMY_XP, this.dummy.giveExperience());
	}
	
	@Test(expected = IllegalStateException.class) // Assert
	public void testAliveDummyNotGiveXP() {
		dummy.giveExperience();		
	}
}
