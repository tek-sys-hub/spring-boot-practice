import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(4,5,6,7,8,9,10); // A list of integer

        List<Integer> even = num.stream()
                .filter(n -> n % 2 == 0)
                /*We are taking n as parameter and return the value which satisfy the
                * condition*/
                .toList();

        System.out.println(even);

    }
}