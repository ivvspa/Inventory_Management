public class Main {

    public static void main(String[] args) {
        Habitat h1 = new Habitat ("Forest", 34, 12.5);
        Habitat h2 = new Habitat ("Savannah", 50, 24.5);
        Habitat h3 = new Habitat ("Tundra", 20, 17.5);

        Staff s1 = new Staff("Clarissa", "Zookeeper");
        s1.assignStaff(h1);
        Staff s2 = new Staff("Viktor", "Feeder");
        s2.assignStaff(h2);
        Staff s3 = new Staff("Ivan", "Animal Specialist");
        s3.assignStaff(h3);


        Zoo zoo = new Zoo();
        zoo.addAnimal1("Rodrick", "Squirrel", 22, new Habitat("Forest", 34,12.5));
        zoo.addAnimal2("Lara", "Puma", 22, new Habitat("Savannah", 50,24.5));
        zoo.addAnimal3("Stew", "Mice", 22, new Habitat("Tundra", 20,17.5));
        zoo.addAnimal4("Patrick", "Woodpecker", 22, new Habitat("Forest", 34,12.5));


    }
}

class Animal {
    private String name;
    private String type;
    private int age;
    private Habitat habitat;

    public Animal (String name, String type, int age, Habitat habitat) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.habitat = habitat;
    } //association

    public void Eat (String food, Staff staff){
        System.out.println(name + " is being fed " + food + " by " + staff.getName());
    }

}

class Habitat {
    private String type;
    private int size;
    private double temperature;

    public Habitat (String type, int size, double temperature) {
        this.type = type;
        this.size = size;
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    } //composition
}

class Zoo {

    private Animal a1;
    private Animal a2;
    private Animal a3;
    private Animal a4;

    public void addAnimal1 (String name, String type, int age, Habitat habitat) {

        a1 = new Animal (name, type, age, habitat);

    }

    public void addAnimal2 (String name, String type, int age, Habitat habitat) {

        a2 = new Animal (name, type, age, habitat);

    }

    public void addAnimal3 (String name, String type, int age, Habitat habitat) {

        a3 = new Animal (name, type, age, habitat);

    }

    public void addAnimal4 (String name, String type, int age, Habitat habitat) {

        a4 = new Animal (name, type, age, habitat);

    }


    }


class Staff {
    private String name;
    private String role;
    private Habitat assignedHabitat;

    public Staff (String name, String role) {
        this.name = name;
        this.role = role;
    }

    void assignStaff (Habitat habitat){
        this.assignedHabitat = habitat;
        System.out.println(getName() + " is responsible for the " + habitat.getType());
    }

    public String getName() {
        return name;
    }
    }



