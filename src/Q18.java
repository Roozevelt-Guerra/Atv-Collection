import java.util.LinkedHashMap;

public class Q18 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> pessoa = new LinkedHashMap<>();
        pessoa.put("João", 22);
        pessoa.put("Maria", 20);
        pessoa.put("Pedro", 25);
        pessoa.put("Ana", 33);
        pessoa.put("Douglas", 54);
        System.out.println(pessoa);

        pessoa.remove("João");
        System.out.println(pessoa);

    }
}
