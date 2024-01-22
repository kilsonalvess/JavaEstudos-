public class CondicaoTernaria {
    public static void main(String[] args) {
        double preco = 34.05;
        double desconto;

        desconto = (preco < 20.0) ? preco * 0.1: preco * 0.5;
    }
}
