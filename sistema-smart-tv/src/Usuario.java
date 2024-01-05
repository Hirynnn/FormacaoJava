public class Usuario {
    public static void main(String[] args) {
        /// Criando objeto
        SmartTv smartTv = new SmartTv();

        System.out.println("Status da tv: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("----------");

        /// Alterando objeto

        smartTv.ligar();
        System.out.println("Status da tv: " + smartTv.ligada);

        smartTv.mudarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

    }
}
