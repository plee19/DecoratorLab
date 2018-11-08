/**
 * Spear decorator concrete class to extend CharacterDecorator.
 * @author plee19
 * @version 1.0
 */
public class Spear extends CharacterDecorator {
    /**
     * Spear constructor method requiring a Character instance.
     * @param tempCharacter Character instance to be wrapped by Spear
     */
    public Spear(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Character's Name getter method as required by Character, with custom output for Spear.
     * @return String name of Spear character
     */
    public String getName() {
        return tempCharacter.getName() + " The Spear Thrower";
    }

    /**
     * Character's Health getter method as required by Character, with custom output for Spear.
     * @return double health of Spear character
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 5;
    }
}