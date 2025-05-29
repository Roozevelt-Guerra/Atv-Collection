import java.util.ArrayList;
import java.util.Objects;

public class Q3 {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        for (int i = 0; i < frutas.size(); i++) {
            if (frutas.contains("banana")){
                System.out.println("existe");
                break;
            } else {
                System.out.println("não existe");
            }
        }



    }
}
