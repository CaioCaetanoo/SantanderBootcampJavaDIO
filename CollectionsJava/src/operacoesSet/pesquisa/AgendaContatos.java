package operacoesSet.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adcionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adcionarContato("Caio", 123456);
        agendaContatos.adcionarContato("Camila", 5665);
        agendaContatos.adcionarContato("Caio Caetano", 11111111);
        agendaContatos.adcionarContato("Catia", 654123);
        agendaContatos.adcionarContato("Claudio", 11111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarContato("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Caio Caetano", 123456));

        agendaContatos.exibirContato();
    }
}
