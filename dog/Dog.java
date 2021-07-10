package dog;

public class Dog {

    private String name = "";
    private String color = "";
    private String breed = "";
    private boolean hungry = false;

    public Dog(String newName, String newColor, String newBreed, boolean hunger) {
        name = newName;
        color = newColor;
        breed = newBreed;
        hungry = hunger;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getColor() {
        return color;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    public String getBreed() {
        return breed;
    }

    public void setHungerState(boolean newHungerState) {
        hungry = newHungerState;
    }

    public boolean getHungerState() {
        return hungry;
    }

    public void bark() {
        System.out.println(name + " says, BARK!!!");
    }

    public void fetch() {
        System.out.println(name + " returns to you the stick you threw, in a game of fetch!");
    }

    public void wagTail() {
        System.out.println(name + " wags its tail.");
    }

}
