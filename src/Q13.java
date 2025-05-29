import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q13 {
    public static void main(String[] args) {

        ArrayList<Pessoa> pesooas = new ArrayList<>();
        pesooas.add(new Pessoa("Debi",69));
        pesooas.add(new Pessoa("Lóide", 24));
        pesooas.add(new Pessoa("Tomas Turbando", 33));

        Collections.sort(pesooas, Comparator.comparingInt(Pessoa::getIdade));

        System.out.println(pesooas);

    }
}
