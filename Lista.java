import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        //*criando um array list
        List<String> list = new ArrayList<>();

        //*adicionando elementos na lista
        list.add("Kilson");
        list.add("Iran");
        list.add("Vitor");
        list.add("Lara");
        list.add("Karina");

        //*adicionando uma lista na posição que desejada
        list.add(2, "Carlos");


        System.out.println(list.size());

        //*for para percorrer a lista
        for (String x: list){
            System.out.println(x);

        }

    }
}
