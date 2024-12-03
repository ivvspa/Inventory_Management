public class RPG {


    public static void main(String[] args){
        Wizard wizard = new Wizard("Merlin",100, 10,5);
        Warrior warrior = new Warrior("Ragnar",100,7,10);
        Ranger ranger = new Ranger("Loack", 80, 12, 7);
        // Task 5: Create an object/instance of your new character's class.


        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println(ranger.getName()+"'s health: " + ranger.getHealth());
        System.out.println("Game is starting...");
        wizard.setHealth(warrior);
        System.out.println(warrior.getName()+" attacks " + wizard.getName() + ". Health updated: " + wizard.getHealth());
        ranger.setHealth(wizard);
        System.out.println(wizard.getName()+" attacks " + ranger.getName() + ". Health updated: " + ranger.getHealth());
        warrior.setHealth(ranger);
        System.out.println(ranger.getName()+" attacks " + warrior.getName() + ". Health updated: " + warrior.getHealth());


        // Task 6: make the wizard attack your new character.
        // Task 7: display the new stats
        // CHALLENGE: Update your program for all the characters to be able to attack each other.
    }
}


class Wizard {
    private String name;
    private int health;
    private int darkMagic;
    private int wizardArmor;


    public Wizard(String name, int health, int darkMagic, int wizardArmor){
        this.name = name;
        this.health = health;
        this.darkMagic = darkMagic;
        this.wizardArmor = wizardArmor;
    }


    public String getName() {
        return name;
    }


    public int getDarkMagic(){
        return darkMagic;
    }


    public void setHealth(Warrior attack) {
        health = health - (attack.getSword() - wizardArmor);
    }


    public void setHealth(Ranger attack) {
        health = health - (attack.getCrossbow() - wizardArmor);
    }


    public int getHealth() {
        return health;
    }


}


class Warrior {
    private String name;
    private int health;
    private int sword;
    private int metalArmor;


    public Warrior(String name, int health, int sword, int metalArmor){
        this.name = name;
        this.health = health;
        this.sword = sword;
        this.metalArmor = metalArmor;
    }


    public String getName() {
        return name;
    }


    public int getSword() {
        return sword;
    }


    public int getHealth() {
        return health;
    }






    public void setHealth(Wizard attack) {
        health = health - (attack.getDarkMagic() - metalArmor);
    }


    public void setHealth(Ranger attack) {
        health = health - (attack.getCrossbow() - metalArmor);
    }


}


// Task 1: Write another class here for a different type of character (e.g. archer)


class Ranger {
    private String name;
    private int health;
    private int crossbow;
    private int cloakArmor;


    public Ranger (String name, int health, int crossbow, int cloakArmor){
        this.name = name;
        this.health = health;
        this.crossbow = crossbow;
        this.cloakArmor = cloakArmor;
    }


    public String getName(){
        return name;
    }


    public int getCrossbow(){
        return crossbow;
    }


    public int getHealth(){
        return health;
    }


    public int getCloakArmor(){
        return cloakArmor;
    }


    public void setHealth(Wizard attack) {
        health = health - (attack.getDarkMagic() - cloakArmor);
    }


    public void setHealth(Warrior attack) {
        health = health - (attack.getSword() - cloakArmor);
    }
}


// Task 2: Write instance variables


// Task 3: Write the constructor


// Task 4: Write the necessary getter(accessor) and setter(modifier) methods.

