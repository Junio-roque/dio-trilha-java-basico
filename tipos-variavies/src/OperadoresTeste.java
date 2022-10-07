public class OperadoresTeste {
    public static void main(String[] args) {
        
        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);//Não vai imprimir negativo

        //tem que dizer para ele que o numero e igual a negativo
        numero = - numero;
        System.out.println(numero);
        //converter o numero para positivo
        numero = + numero;
        System.out.println(numero);//Nao ficou positivo pois tem usar parametros matematico para fica positivo
        numero = numero * -1;
        System.out.println(numero);

        //repetição de numeros
        int numeros = 5;
        //numeros = numeros + 1;
        //incrementa
        numeros++;
        System.out.println(numeros);
        System.out.println(++numeros);
        System.out.println(--numeros);

        //variavel boolean
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;//forma correta de negar variavel
        System.out.println(variavel);

      System.out.println(".................................");
        
        int a, b;
        a = 5;
        b = 6;

        String resultado = "";

        if(a == b)
         resultado = "Verdadeiro";
        else
         resultado = "Falso";
        
        System.out.println(resultado);
        //Operador ternário
        String resolucao = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resolucao);

        //Relacionais
        int numero1 = 1;
        int numero2 = 2;
 
        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 e igual a numero 2? " +simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 e diferente de numero 2? " +simNao);
        
        simNao = numero1 > numero2;
        System.out.println("Numero 1 e maior que numero 2? " +simNao);
    
        boolean condicao1 = true;
        boolean condicao2 = true;
        if(condicao1 && condicao2){
            System.out.println("As duas condição são verdadeira.");
        }
        System.out.println("Fim");
    
    }
}
