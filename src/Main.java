import HumanBasicInfoSystem.enums.Religion;
import HumanBasicInfoSystem.enums.Sex;
import HumanBasicInfoSystem.model.Person;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ayobami", 18, "08169453213", Sex.MALE, Religion.CHRISTIANITY);
        System.out.println(person.greetings());
        System.out.println(person.introduce());
    }
}