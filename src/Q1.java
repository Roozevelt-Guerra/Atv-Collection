import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {


        ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();
        numerosInteiros.add(10);
        numerosInteiros.add(20);
        numerosInteiros.add(30);
        numerosInteiros.add(40);
        numerosInteiros.add(50);

        for (int i = 0; i < numerosInteiros.size(); i++) {
            System.out.println(numerosInteiros.get(i));
        }



    }
}
