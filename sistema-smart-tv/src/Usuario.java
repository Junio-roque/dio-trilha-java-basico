public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println("Teve ligado "+ smartTv.ligada);

        System.out.println("Tv está desligada");
        smartTv.desligar();
        System.out.println("Teve desligada "+ smartTv.ligada);

        System.out.println("Vou diminuir volume");
        System.out.println("O volume estava em: ");
        System.out.println(smartTv.volume);
        System.out.println("E agora diminuir: ");
        smartTv.diminuirVolume();;
        smartTv.diminuirVolume();;
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        System.out.println("Vou aumentar o Volume: ");
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
    }
}
