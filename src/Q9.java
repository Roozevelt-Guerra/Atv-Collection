import java.util.HashMap;
import java.util.Map;

public class Q9 {
    public static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("João", 18);
        pessoas.put("Maria", 20);
        pessoas.put("Pedro", 25);

        if (pessoas.containsKey("João")){
            System.out.println(pessoas.get("João"));
        } else {
            System.out.println("Não há esse nome");
        }

    }
}
