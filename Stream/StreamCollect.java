import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {

    public static void main(String[] arg){

        List<Integer> values = Arrays.asList(10, 20, 30, 40);

        List<Integer> result = values.stream()
                .filter(x -> x > 20)
                .map(x->x*2)
                .collect(Collectors.toList());

        System.out.println(result);


    }
}
