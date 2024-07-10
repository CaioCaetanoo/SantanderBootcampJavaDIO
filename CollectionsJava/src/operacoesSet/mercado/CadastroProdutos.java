package operacoesSet.mercado;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //Hashset nao organiza, por isso usamos TreeSet pois ele reconhece o parametro usado pelo comparable. OBS: nao se usa o collections.sort em Set.
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco()); //novamente nao se usa o Hash set, pois já há um comparator para organizar o Set.
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto8", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}