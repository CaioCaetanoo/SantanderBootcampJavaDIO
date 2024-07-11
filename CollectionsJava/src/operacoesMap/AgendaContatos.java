package operacoesMap;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone); //key e value. OBS: Put pode servir para inserir, ou atualizar o valor informado, no caso de uma outra função para atualizar contato
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome); //nao se usa o laço para percorrer a map, pois a key é unica.
        }
    }

    public void exibirCOntatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Caio", 456123);
        agendaContatos.adicionarContato("Caio Caetano", 789456);
        agendaContatos.adicionarContato("Iago", 456789);
        agendaContatos.adicionarContato("Lucas", 963852);
        agendaContatos.adicionarContato("Matheus", 147258);

        agendaContatos.exibirCOntatos();

        agendaContatos.removerContato("Iago");
        agendaContatos.exibirCOntatos();

        System.out.println("O numero é: " + agendaContatos.pesquisaPorNome("Caio Caetano"));
    }
}
