package javalibs;

import java.util.ArrayList;
import java.util.List;

public class Crencas {
    
    private List<Religiao> religioes;

    public Crencas() {        
        religioes = new ArrayList<Religiao>();
        religioes.add(new Religiao("Cristianismo", 0));
        religioes.add(new Religiao("Islamismo", 0));
        religioes.add(new Religiao("Agnostico", 0));
        religioes.add(new Religiao("Outros", 0));
    }

    public List<Religiao> getReligioes() {
        return religioes;
    }

    @Override
    public String toString() {
        String retorno="";
        for (Religiao religiao : religioes) {
             retorno += religiao.getNome() + ": " + religiao.getQuantidade() + "\n"; 
        }
        return retorno;
    }
    
    public int total(){
        int totalPessoas=0;
        for (Religiao religiao : religioes) {
            totalPessoas +=  religiao.getQuantidade();
        }
        return totalPessoas;
    }
}
