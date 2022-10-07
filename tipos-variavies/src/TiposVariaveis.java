public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
        int numero = 5;
        numero = 10;

        System.out.println(numero);

        double VALOR_PI = 3.14;
        VALOR_PI = 12.2;
        //Para não altera a variavel 
        //tem que colocar a palavra chave Final
        //para não alterar o valor.
        System.out.println(VALOR_PI);
        final double VALOR_PI2 = 3.14;
        //VALOR_PI2 = 12.2; //A propria IDE já da error.
        System.out.println(VALOR_PI2);

    
    }
}
