package dog;

public class Dog {

    String name = "";
    String color = "";
    String breed = "";
    boolean hungry = false;

    public Dog(String newName, String newColor, String newBreed, boolean hunger) {
        name = newName;
        color = newColor;
        breed = newBreed;
        hungry = hunger;
    }

    void setName(String newName) {
        name = newName;
    }

    String getName() {
        return name;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    String getColor() {
        return color;
    }

    void setBreed(String newBreed) {
        breed = newBreed;
    }

    String getBreed() {
        return breed;
    }

    void setHungerState(boolean newHungerState) {
        hungry = newHungerState;
    }

    boolean getHungerState() {
        return hungry;
    }

    void bark() {
        System.out.println(name + " says, BARK!!!");
    }

    void fetch() {
        System.out.println(name + " returns to you the stick you threw, in a game of fetch!");
    }

    void wagTail() {
        System.out.println(name + " wags its tail.");
    }

    public static void main(String[] args) {
        Dog shiba = new Dog("Fido", "black", "Shiba Inu", true);
        System.out.println("Our dog's name is " + shiba.getName());
        System.out.println("Our dog is a " + shiba.getColor() + " " + shiba.getBreed());
        shiba.bark();
        shiba.fetch();
        shiba.wagTail();
    }
}
