public class ComputadorPedrinho {
    public static void main(String[] args) {
        
    MSNMessenger msn = new MSNMessenger();
    System.out.println("MSN");
    msn.enviarMensagem();
    msn.receberMensagem();

    FacebookMessenger fcb = new FacebookMessenger();
    System.out.println("FACEBOOK MESSENGER");
    fcb.enviarMensagem();
    fcb.receberMensagem();

    TelegramMessenger tlg = new TelegramMessenger();
    System.out.println("TELEGRAM");
    tlg.enviarMensagem();
    tlg.receberMensagem();

    }
}