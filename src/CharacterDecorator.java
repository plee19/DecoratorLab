/**
 * Abstract Decorator class implementing Character with its required getName() and getHealth() methods. Consists of an instance
 * of a Character.
 * @author plee19
 * @version 1.0
 */
abstract class CharacterDecorator implements Character {
    protected Character tempCharacter;

    /**
     * Constructor method requiring a Character instance.
     * @param tempCharacter Character instance to be decorated
     */
    public CharacterDecorator(Character tempCharacter) {
        this.tempCharacter = tempCharacter;
    }

    /**
     * Character's Name getter method as required by Character.
     * @return String name of Character
     */
    public String getName() {
        return tempCharacter.getName();
    }

    /**
     * Character's Health getter method as required by Character.
     * @return double health of Character
     */
    public double getHealth() {
        return tempCharacter.getHealth();
    }
}
