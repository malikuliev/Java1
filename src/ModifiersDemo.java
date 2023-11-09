import java.util.*;
public class ModifiersDemo {

    public static void main(String[] args) {

        Person person = new Person("John", 25);

        person.accessPublic(); 
        person.accessPrivate(); 
        person.accessProtected();
        person.accessDefault(); 

        person.finalMethod(10);

        System.out.println("Static deyisen: " + Person.staticVariable);
    }
}

class Person {
    public String publicField;
    private int privateField;
    protected boolean protectedField;
    int defaultField;

    public Person(String name, int age) {
        this.publicField = name;
        this.privateField = age;
    }

    private Person(String name) {
        this.publicField = name;
    }

    protected Person(int age) {
        this.privateField = age;
    }

    Person(boolean isAdult) {
        this.protectedField = isAdult;
    }

    public void accessPublic() {
        System.out.println("Public method called.");
    }

    void accessPrivate() {
        System.out.println("Private method called.");
    }

    protected void accessProtected() {
        System.out.println("Protected method called.");
    }

    void accessDefault() {
        System.out.println("Default method called.");
    }

    public final void finalMethod(final int value) {
        System.out.println("Final method called with value: " + value);
    }

    public static int staticVariable = 5;
}
