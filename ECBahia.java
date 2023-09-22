package JUnitBahia;

import java.util.ArrayList;
import java.util.List;

public class ECBahia {
    private String nome;
    private List<Jogador> jogadores;
    private int proximaId;
    
    public ECBahia(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.proximaId = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
    	jogador.setId(proximaId);
    	jogadores.add(jogador);
    	proximaId++;
    }

    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public void pagarSalarios() {
        for (Jogador jogador : jogadores) {
            
            System.out.println("Salário pago para " + jogador.getNome() + ": R$" + jogador.getSalario());
        }}
        public void listarJogadores() {
            System.out.println("Lista de jogadores do time " + nome + ":");

            for (Jogador jogador : jogadores) {
                System.out.println(jogador);
            }
        
    }
        @Override
        public String toString() {
            return "TimeDeFutebol{" +
                    "nome='" + nome + '\'' +
                    ", jogadores=" + jogadores +
                    '}';
        }

    public static void main(String[] args) {
    	ECBahia meuTime = new ECBahia("EC Bahia");

        Jogador jogador1 = new Jogador("Cauly", 8, 300000);
        Jogador jogador2 = new Jogador("Ademir", 11, 300000);
        Jogador jogador3 = new Jogador("Biel", 10, 400000);

        meuTime.adicionarJogador(jogador1);
        meuTime.adicionarJogador(jogador2);
        meuTime.adicionarJogador(jogador3);
        
        meuTime.listarJogadores();
                 
    }
}