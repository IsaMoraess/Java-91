public class ComputadorPedrinho {
    public static void main(String[] args) {
		//abrindo MSN Messenger
        System.out.println("-------------------------------------------");
        System.out.println("MSNM:");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem(); // user ver ESCONDIDO  (ENCAPSULAMENTO)
		msn.receberMensagem(); // user ver ESCONDIDO (ENCAPSULAMENTO)
        System.out.println("-------------------------------------------");

        System.out.println("Facebook:");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem(); 
		fcb.receberMensagem(); 
        System.out.println("-------------------------------------------");

        System.out.println("Telegram:");
		Telegram tele = new Telegram();
		tele.enviarMensagem(); 
		tele.receberMensagem(); 
        System.out.println("-------------------------------------------");
	}
}
