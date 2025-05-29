import java.util.HashMap;

public class Q20 {
    public static void main(String[] args) {

        HashMap<Integer, String> diasSemana = new HashMap<>();
        diasSemana.put(1, "Domingo");
        diasSemana.put(2, "Segunda");
        diasSemana.put(3, "Terça");
        diasSemana.put(4, "Quarta");
        diasSemana.put(5, "Quinta");
        System.out.println(diasSemana);

        diasSemana.put(3, "Quarta-feira");

        System.out.println(diasSemana);

    }
}
