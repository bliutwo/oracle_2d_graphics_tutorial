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
