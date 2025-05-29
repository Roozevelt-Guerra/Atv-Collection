import java.util.LinkedList;
import java.util.Queue;

public class Q14 {
    public static void main(String[] args) {

        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        while (!numbers.isEmpty()){
            int num = numbers.remove();
            System.out.println(num);
        }

    }
}
