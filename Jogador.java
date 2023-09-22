package JUnitBahia;

public class Jogador {
    private String nome;
    private int numeroCamisa;
    private double salario;
    private int id;

    public Jogador(String nome, int numeroCamisa, double salario) {
    	this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.salario = salario;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	  @Override
	    public String toString() {
	        return "{" + "id= " + id +
	                " / nome= " + nome +
	                " / Núumero da Camisa= " + numeroCamisa +
	                " / salario= R$ " + salario +
	                '}';
	    
}
}
