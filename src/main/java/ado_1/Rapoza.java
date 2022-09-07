package ado_1;
/** 
   por Rafael Ferreira Goulart
**/
public class Rapoza {
    
    private String nome;
    private String cor;
    private int idade;
    private int velocidadeAtual;
    private double peso;
    private double altura;
    
    public Rapoza() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void acelerar(int vel) {
        this.velocidadeAtual += vel;
    }
    
    public void diminuirVelocidade(int vel) {
        this.velocidadeAtual -= vel;
    }
    
    public void parar() {
        this.velocidadeAtual = 0;
    }
}