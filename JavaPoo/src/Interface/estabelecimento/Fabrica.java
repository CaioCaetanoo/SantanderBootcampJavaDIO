package Interface.estabelecimento;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.impressora.Laserjet;
import Interface.multifuncional.EquipamentoMultifuncional;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.impressora.Deskjet;
import Interface.equipamentos.impressora.Impressora;


public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }

}
