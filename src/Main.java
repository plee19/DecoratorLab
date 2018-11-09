public class Main {
    public static void main(String[] args) {
        Character basicCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
        Character testCharacter = new Sword(new Starving(new Shield((new BasicCharacter("Hungry Swordsman")))));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Health: " + basicCharacter.getHealth());
        System.out.println("Name: " + testCharacter.getName());
        System.out.println("Health: " + testCharacter.getHealth());
    }
}
