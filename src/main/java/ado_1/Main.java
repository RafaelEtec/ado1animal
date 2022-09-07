package ado_1;
/** 
   por Rafael Ferreira Goulart
**/
public class Main {
    public static void main(String[] args) {
        
        System.out.println("| Aí ó:                            |");
        
        Rapoza rapozaLarissa = new Rapoza();
        Rapoza rapozaAmanda = new Rapoza();
        
        rapozaLarissa.setNome("Larissa");
        rapozaLarissa.setCor("Laranja");
        rapozaLarissa.setIdade(5);
        rapozaLarissa.setVelocidadeAtual(0);
        rapozaLarissa.setPeso(26.85);
        rapozaLarissa.setAltura(1.10);
        
        rapozaAmanda.setNome("Amanda");
        rapozaAmanda.setCor("Laranja");
        rapozaAmanda.setIdade(7);
        rapozaAmanda.setVelocidadeAtual(60);
        rapozaAmanda.setPeso(29.40);
        rapozaAmanda.setAltura(1.40);
        
        rapozaLarissa.acelerar(60);
        rapozaAmanda.diminuirVelocidade(20);
        rapozaLarissa.parar();
        rapozaAmanda.parar();
        
        System.out.println("| As Rapozas são: " + rapozaLarissa.getNome() + " e " + rapozaAmanda.getNome() + " |");
    }
}