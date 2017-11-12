package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import rpg_lab.Axe;
import rpg_lab.Dummy;
import rpg_lab.Target;
import rpg_lab.Weapon;

public class AxeTests {
	
	private static final int AXE_ATACK = 10;
	private static final int AXE_DURABILITY = 10;
	
	private static final int DUMMY_HEALTH = 10;
	private static final int DUMMY_XP = 10;
	
	private static final String WRONG_DURABILITY_MESSAGE = "Wrong durability.";
	
	private static final int EXPECTED_DURABILITY = 9;
	
	private Weapon axe;
	private Target dummy;
	
	@Before
	public void initializeTestObjects() {
		// Arrange
		this.axe = new Axe(AXE_ATACK, AXE_DURABILITY);
		this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
	}
	
	@Test
	public void axeDurabilityTest() {
		// Act
		this.axe.attack(this.dummy);
		
		// Assert
		Assert.assertEquals(WRONG_DURABILITY_MESSAGE, EXPECTED_DURABILITY, this.axe.getDurabilityPoints());
	}
	
	@Test(expected = IllegalStateException.class) // Assert
	public void attackWithBrokenAxe() {
		while (this.axe.getDurabilityPoints() > 0) {
			// Act
			axe.attack(dummy);
		}
	}
}
