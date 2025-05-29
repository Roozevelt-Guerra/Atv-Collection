import java.util.HashSet;
import java.util.Set;

public class Q7 {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        for (int i = 0; i < numeros.size();){
            if (numeros.contains(15)){
                System.out.println("Há o número 15.");
                break;
            }
            System.out.println("Não há número 15");
            break;
        }

    }
}
