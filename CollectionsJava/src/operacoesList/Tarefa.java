package operacoesList;

public class Tarefa {
    //atributo
        private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() { //usado para mostrar a descrição do item, e nao o endereço na memória.
        return  descricao;
    }
}
