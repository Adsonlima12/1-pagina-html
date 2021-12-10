
public class Cliente {
	
	//Propriedades ou Atributos
	private String nome;
	private double salario;
	private int idade;
	
	//Construtor com os atributos
	public Cliente(String nome, double salario, int idade) {
		this.nome = nome;
		this.salario = salario;
		this.idade = idade;
	}
	
	//Métodos Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
