import java.util.Map;
import java.util.TreeMap;

public class Q10 {
    public static void main(String[] args) {
        Map<String, Integer> pessoas = new TreeMap<>();

        pessoas.put("João", 18);
        pessoas.put("Maria", 20);
        pessoas.put("Pedro", 25);
        pessoas.put("Aldebaran", 45);
        pessoas.put("Ragnar", 50);

        System.out.println(pessoas);
    }
}
