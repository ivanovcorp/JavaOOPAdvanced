package rpg_lab;

public class Dummy implements Target {

    private int health;
    private int experience;

    public Dummy(int health, int experience) {
        this.health = health;
        this.experience = experience;
    }

    /* (non-Javadoc)
	 * @see rpg_lab.Target#getHealth()
	 */
    public int getHealth() {
        return this.health;
    }

    /* (non-Javadoc)
	 * @see rpg_lab.Target#takeAttack(int)
	 */
    public void takeAttack(int attackPoints) {
        if (this.isDead()) {
            throw new IllegalStateException("Dummy is dead.");
        }

        this.health -= attackPoints;
    }

    /* (non-Javadoc)
	 * @see rpg_lab.Target#giveExperience()
	 */
    public int giveExperience() {
        if (!this.isDead()) {
            throw new IllegalStateException("Target is not dead.");
        }

        return this.experience;
    }

    /* (non-Javadoc)
	 * @see rpg_lab.Target#isDead()
	 */
    public boolean isDead() {
        return this.health <= 0;
    }
}
