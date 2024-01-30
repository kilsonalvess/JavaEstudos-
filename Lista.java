import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        list.add("Acario");
        list.add("Alan");
        list.add("Acassio");
        //*removendo dados de uma lista
        list.remove("Karina");



        //*adicionando uma lista na posição que desejada
        list.add(2, "Carlos");


        System.out.println(list.size());

        //*for para percorrer a lista
        for (String x: list){
            System.out.println(x);

        }
        list.remove(1);

        System.out.println("-----------------------------------------------");
        //*Remove dados de uma lista com a inicial da letra I
        list.removeIf(x -> x.charAt(0)=='I');
        for (String x: list){
            System.out.println(x);
        }

        System.out.println("----------------------------------------------------");
        //*Fala em que posição está na lista a String desejada
        System.out.println("Index of está na posição" + ":"+ list.indexOf("Kilson"));

        System.out.println("------------------------------------------------------");
        //*cria uma lista e joga e faz um filtro com a inicial de nome que você quer para a lista
        List<String> result= list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x: result){
            System.out.println(x);
        }

        System.out.println("------------------------------------------------------------------------------");
        //*Para encontrar o primeiro nome com inicial K se não tiver retorna null
        String name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
        System.out.println(name);
    }
}
