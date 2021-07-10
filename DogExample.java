import dog.Dog;

public class DogExample {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Dog shiba = new Dog("Fido", "black", "Shiba Inu", true);
        System.out.println("Our dog's name is " + shiba.getName());
        System.out.println("Our dog is a " + shiba.getColor() + " " + shiba.getBreed());
        shiba.bark();
        shiba.fetch();
        shiba.wagTail();
    }
}
