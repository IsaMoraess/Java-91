//(HERANÇA)ta no "ServicoMensagemInstantanea" ñ tem cod aq (SEM ABSTRACT)
public class MSNMessenger extends ServicoMensagemInstantanea{
//estou falando oq cada app faz iss pq usei o abstract
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}

