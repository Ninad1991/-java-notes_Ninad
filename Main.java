import java.util.*;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<Person> people =  new ArrayList<>(List.of(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        ));

        // 1. Sort the list with LastName
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });

        //Lambda implemenetation
        System.out.println("<===============xxx==================>");
        System.out.println("Sorted_With_Lamda");
        Collections.sort(people, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));



        // 2.  Create method that prints all the elements in the list
        System.out.println("<===============xxx==================>");
 //       printAll(people);
        printConditonally(people,p -> true);


        System.out.println("<===============xxx==================>");
        // 3. Create a method that prints all the people whose last name starts with C

        printLastNameBeginswithC(people);

        System.out.println("<===============xxx==================>");
//        printConditonally(people, new Condition() {
//            public boolean test(Person p) {
//                return p.getLastName().startsWith("C");
//            }
//        });

        printConditonally(people, p->p.getLastName().startsWith("C"));


    }


    private static void printConditonally(List<Person> people, Predicate<Person> predicate) {
        for(Person p:people){
            if(predicate.test(p)){
                System.out.println(p);
            }
        }
    }


//    private static void printConditonally(List<Person> people, Condition condition) {
//        for(Person p:people){
//            if(condition.test(p)){
//                System.out.println(p);
//            }
//        }
//    }

//    private static void printAll(List<Person> people) {
//        for (Person p : people) {
//            System.out.println(p);
//        }
//
//    }

    private static void printLastNameBeginswithC(List<Person> people) {
        for (Person i : people) {
            if (i.getLastName().startsWith("C")) {
                System.out.println(i);
            }
        }
    }

}

//interface Condition {
//    boolean test(Person p);
//
//}

