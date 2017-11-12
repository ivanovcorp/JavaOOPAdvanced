package rpg_lab;

public class Axe implements Weapon {

    private int attackPoints;
    private int durabilityPoints;

    public Axe(int attack, int durability) {
        this.attackPoints = attack;
        this.durabilityPoints = durability;
    }

    /* (non-Javadoc)
	 * @see rpg_lab.Weapon#getAttackPoints()
	 */
    public int getAttackPoints() {
        return this.attackPoints;
    }

    /* (non-Javadoc)
	 * @see rpg_lab.Weapon#getDurabilityPoints()
	 */
    public int getDurabilityPoints() {
        return this.durabilityPoints;
    }

    /* (non-Javadoc)
	 * @see rpg_lab.Weapon#attack(rpg_lab.Dummy)
	 */
    public void attack(Target target) {
        if (this.durabilityPoints <= 0) {
            throw new IllegalStateException("Axe is broken.");
        }

        target.takeAttack(this.attackPoints);
        this.durabilityPoints -= 1;
    }
}
