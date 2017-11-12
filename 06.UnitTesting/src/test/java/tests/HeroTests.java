package tests;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

import rpg_lab.Axe;
import rpg_lab.Hero;
import rpg_lab.Target;
import rpg_lab.Weapon;

public class HeroTests {
	
	private static final int WEAPON_ATACK = 10;
	private static final int WEAPON_DURABILITY = 10;
	private static final String HERO_NAME = "Hero";
	protected static final int TARGET_XP = 10;

	private Weapon weapon;
	private Hero hero;
	private Target target;
	
	@Before
	public void initializeTestObjects() {
		this.weapon = new Axe(WEAPON_ATACK, WEAPON_DURABILITY);
		this.hero = new Hero(HERO_NAME, this.weapon);
		this.target = Mockito.mock(Target.class);
		Mockito.when(this.target.isDead()).thenReturn(true);
		Mockito.when(this.target.giveExperience()).thenReturn(TARGET_XP);
	}
	
	@Test
	public void heroGainsXPWhenTargetDies() {
		this.hero.attack(target);
		Assert.assertEquals("Wrong XP", TARGET_XP, this.hero.getExperience())	;
	}
}
