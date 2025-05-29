import java.util.Stack;

public class Q15 {
    public static void main(String[] args) {

        Stack<String> letras = new Stack<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");

        while (!letras.isEmpty()){
            String resultado = letras.pop();
            System.out.println(resultado);
        }


    }
}
