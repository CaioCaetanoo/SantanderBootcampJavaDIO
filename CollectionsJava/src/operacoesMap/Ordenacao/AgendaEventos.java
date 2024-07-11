package operacoesMap.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() { this.eventosMap = new HashMap<>(); }

    public void adicionarEventos(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap); //quando é criado o evento map, eles já são ordenados em ordem crescente. Extends de comparable.
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento () {
        /* Set<LocalDate, Evento> dateSet = eventosMap.keySet(); //as coleções são independentes, portanto, não há como relaciona-las para este metodo
        Collection<Evento> values = eventosMap.values(); */

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) { //este laço percorre o treemap contendo a ligação entre os elementos
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEventos(LocalDate.of(2022, Month.JULY, 15), "Evento1", "Atração1");
        agendaEventos.adicionarEventos(LocalDate.of(2022, 7, 15), "Evento2", "Atração2");
        agendaEventos.adicionarEventos(LocalDate.of(2024, Month.JULY, 10), "Evento3", "Atração3");
        agendaEventos.adicionarEventos(LocalDate.of(2024, Month.JULY, 12), "Evento4", "Atração4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
