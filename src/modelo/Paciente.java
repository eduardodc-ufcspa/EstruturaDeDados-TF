package modelo;

public class Paciente {
	
	private String nome;
	private String cpf;
	private int anoNascimento;

/**
 * Registro do paciente
 * @param nome Nome completo do paciente
 * @param cpf Numero do CPF do paciente
 * @param anoNascimento Ano de nascimento do paciente
 */
	
	public Paciente(String nome, String cpf, int anoNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
}
