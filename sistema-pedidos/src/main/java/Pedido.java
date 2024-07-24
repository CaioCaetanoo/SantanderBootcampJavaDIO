// Pedido.java
public abstract class Pedido {
    private String id;
    private String descricao;

    public Pedido(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract void processar();
}

// PedidoOnline.java
public class PedidoOnline extends Pedido {
    public PedidoOnline(String id, String descricao) {
        super(id, descricao);
    }

    @Override
    public void processar() {
        System.out.println("Processando pedido online: " + getDescricao());
    }
}

// PedidoLoja.java
public class PedidoLoja extends Pedido {
    public PedidoLoja(String id, String descricao) {
        super(id, descricao);
    }

    @Override
    public void processar() {
        System.out.println("Processando pedido na loja: " + getDescricao());
    }
}
