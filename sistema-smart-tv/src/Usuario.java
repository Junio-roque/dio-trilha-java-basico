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
    }
}
