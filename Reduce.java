import java.util.List;
import java.util.Arrays;
import java.util.Optional;
class Reduce{
    public static void main(String args[]) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        int sum = arr.stream().reduce(0, (total,elm)->  total + elm);
        System.out.println("Total ::"+sum);


        // Another good example 
        List<Integer> numbers = Arrays.asList(4, 9, 2, 7);
        int max = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Max is :" + max);
    }
}