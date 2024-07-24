// PedidoFactory.java
public interface PedidoFabrica {
    Pedido criarPedido(String id, String descricao);
}

public class PedidoOnlineFabrica implements PedidoFabrica {
    @Override
    public Pedido criarPedido(String id, String descricao) {
        return new PedidoOnline(id, descricao);
    }
}

public class PedidoLojaFabrica implements PedidoFabrica {
    @Override
    public Pedido criarPedido(String id, String descricao) {
        return new PedidoLoja(id, descricao);
    }
}
