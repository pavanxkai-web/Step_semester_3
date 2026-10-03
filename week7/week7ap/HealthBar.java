class Character {
    private int health;
    private final int maxHealth;

    Character(int maxHealth) {
        this.maxHealth = Math.max(0, maxHealth);
        health = this.maxHealth;
    }

    public void takeDamage(int amount) {
        if (amount > 0) {
            health = Math.max(0, health - amount);
        }
    }

    public void heal(int amount) {
        if (amount > 0) {
            health = (int) Math.min(
                (long) maxHealth, (long) health + amount
            );
        }
    }

    public int getHealth() {
        return health;
    }
}

public class HealthBar {
    public static void main(String[] args) {
        Character c = new Character(100);

        c.takeDamage(30);
        System.out.println("Health after damage: " + c.getHealth());

        c.heal(50);
        System.out.println("Health after healing: " + c.getHealth());

        c.takeDamage(150);
        System.out.println("Health after heavy damage: " + c.getHealth());
    }
}