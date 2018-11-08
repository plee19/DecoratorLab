/**
 * Concrete class implementing Character with its required getName() and getHealth() methods.
 * @author plee19
 * @version 1.0
 */
public class BasicCharacter implements Character {
    String name;
    double health;

    /**
     * Constructor method requiring a name.
     * @param name String name of BasicCharacter
     */
    public BasicCharacter(String name) {
        this.name = name;
        this.health = 0;
    }

    /**
     * Character's Name getter method as required by Character.
     * @return String name of Character
     */
    public String getName() {
        return name;
    }

    /**
     * Character's Health getter method as required by Character.
     * @return double health of Character
     */
    public double getHealth() {
        return health;
    }
}
