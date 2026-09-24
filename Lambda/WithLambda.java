import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class WithLambda {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        ));

        // 1. Sort by last name — lambda implementing Comparator
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        // Equivalent, more idiomatic: people.sort(Comparator.comparing(Person::getLastName));

        System.out.println("<==== sorted ====>");
        printAll(people);

        System.out.println("<==== last name starts with C ====>");
        printConditionally(people, p -> p.getLastName().startsWith("C"));
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    // Predicate<Person> replaces the custom Condition interface entirely
    private static void printConditionally(List<Person> people, Predicate<Person> condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}
