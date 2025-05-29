import java.util.HashSet;
import java.util.Set;

public class Q6 {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        nomes.add("Cajazeiras");
        nomes.add("Sousa");
        nomes.add("SJP");
        nomes.add("São Gonçalo");
        nomes.add("Pombal");

        for (String nome : nomes){
            System.out.println(nome);
        }

    }
}
