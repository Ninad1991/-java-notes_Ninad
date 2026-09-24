import java.util.Arrays;
import java.util.List;

public class Stream1 {

    public static void main (String[] args){

        List<Integer> values = Arrays.asList(11,12,13,14,15,16);

        int result=0;

        for(int i: values){
            result = result+i*2;
        }

        System.out.println(result);

        Integer doubleValue1 =values.stream().map(i -> i*2).reduce(0,(total,nextValue)-> total+nextValue);
        // This is reduce using lamda expression

        System.out.println("doubleValue1= "+doubleValue1);



        Integer doubleValue2 =values.stream().map(i -> i*2).reduce(0, Integer::sum);
        // This is reduce using method-refrence

        System.out.println("doubleValue2= "+doubleValue2);


    }

}
