public class MSNMessenger {
    public static void main(String[] args) throws Exception {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }


    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private static void validarConectadoInternet() {
        System.out.println("Validar se está conectado à internet");
    }

    private static void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico da mensagem");
    }
}
