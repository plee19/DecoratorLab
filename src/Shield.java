/**
 * Shield decorator concrete class to extend CharacterDecorator.
 * @author plee19
 * @version 1.0
 */
public class Shield extends CharacterDecorator {

    /**
     * Shield constructor method requiring a Character instance.
     * @param tempCharacter Character instance to be wrapped by Shield
     */
    public Shield(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Character's Name getter method as required by Character, with custom output for Shield.
     * @return String name of Shield character
     */
    public String getName() {
        return tempCharacter.getName() + " The Shield Bearer";
    }

    /**
     * Character's Health getter method as required by Character, with custom output for Shield.
     * @return double health of Shield character
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 5;
    }
}
