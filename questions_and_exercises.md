# https://docs.oracle.com/javase/tutorial/getStarted/QandE/questions.html

## Questions

1. bytecode - the platform-independent code that a Java Virtual Machine can understand, converted to by the compiler from the human-readable source file
2. c (`/* comment`) is not a valid comment
3. Maybe the filename of the source file? "Check your classpath. Your class cannot be found." I think this is the same thing.
4. `public static void main(String[] args)`
5. ~~`public`~~ "They can be in either order, but the convention is `public static`."
6. ~~The parameters that the `main` method defines are the *command-line arguments*.~~ The `main` method defines a single parameter, usually named `args`, whose type is an array of `String` objects.

## Exercises

1. See the following code:

```java
class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!"); // Display the string.
    }
}
```

2. The error was that the string literal was unclosed. Needed to add another set of quotation marks before the closing parenthesis.

# https://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html

## Questions

1. Real-world objects contain **behaviors** and **states**.
2. A software object's state is stored in **variables**.
3. A software object's behavior is exposed through **methods**.
4. Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data **encapsulation**.
5. A blueprint for a software object is called a **class**.
6. Common behavior can be defined in a **class** and inherited into a **subclass** using the **extends** keyword.
7. A collection of methods with no implementation is called an **implementation**.
8. A namespace that organizes classes and interfaces by functionality is called a **package**.
9. The term API stands for **Application Programming Interface**.

## Exercises

1. Objects I've seen in this trail:

- dog
  - state
    - name, color, breed, hungry
  - behavior
    - barking, fetching, wagging tail
- desk
- television set
- bicycle

Let's try making a Dog class.

2. I made a Dog interface and a Dog class, but I haven't tested it yet because I don't know how to package them such that I can call the Dog class from a different Java file.
