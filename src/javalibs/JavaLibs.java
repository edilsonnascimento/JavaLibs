package javalibs;

import javax.swing.JOptionPane;

public class JavaLibs {

    public static void main(String[] args) {
        
        
        String nomePais = JOptionPane.showInputDialog("Entre com o nome do pais: ");
        String nomeOficialPais = JOptionPane.showInputDialog("Entre com o nome do Oficial do pais: ");
        String continente = JOptionPane.showInputDialog("Entre com o nome do continente que o pais pertence: ");
        double areaTerritorial = Double.parseDouble(JOptionPane.showInputDialog("Entre com o tamanho do pais: "));
        int populacao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a populacao do pais: "));
        String lingua = JOptionPane.showInputDialog("Entre com a lingua do pais: ");
        String curiosidade = JOptionPane.showInputDialog("Entre com alguma curiosidade do pais: ");
        String populacaoOrigem = JOptionPane.showInputDialog("Entre população originada: ");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano da Contituição do pais: "));
        String regimeGoverno = JOptionPane.showInputDialog("Regime Governamental: ");
        String moeda = JOptionPane.showInputDialog("Entre moeda corrente do pais: ");
        double pib = Double.parseDouble(JOptionPane.showInputDialog("Entre o PIB do pais: "));
        double rendaPercapita = pib/populacao;
        Crencas crencas = new Crencas();
        for (Religiao religiao : crencas.getReligioes()) {
            religiao.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade da " + religiao.getNome())));
        }
        
        String texto = nomePais + ", oficialmente " + nomeOficialPais + ", está no " + continente + ", \n"
                     + areaTerritorial + ", " + populacao +". É o único país no " + continente + " onde se fala \n"
                     + "majoritariamente a " + lingua + ", além de " + curiosidade + "\n"
                     + "e etnicamente diversas, em decorrência de "+ populacaoOrigem + ".\n"
                     + "Sua atual Constituição é de "+ ano +" e com um regime de governo " + regimeGoverno + "\n"
                     + "presidencialista," + moeda + ", " + pib + " com renda per capta  $"+ rendaPercapita + " religoes: " + crencas.toString() +"\n"
                     + "total de pessoas que tem alguma crenca: " + crencas.total();
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
