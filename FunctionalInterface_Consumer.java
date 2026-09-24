import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface_Consumer {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(11,12,13,14,15,16);

        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.print(i+", ");
            }
        };

        values.forEach(c);
        System.out.println();

        Consumer<Integer> d= j-> System.out.print(j+", ");
        values.forEach(d);

        System.out.println();

        values.forEach(k -> System.out.print(k+", "));

        System.out.println();

        List <Integer> filteredValues=
               values.stream().filter(value-> value%2==0).toList();


        filteredValues.forEach(z-> System.out.print(z+", "));


    }
}
