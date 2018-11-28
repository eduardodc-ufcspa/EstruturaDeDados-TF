package modelo;

public class Atendimento {


	private Paciente pessoa;
	private int horaChegada;
	private int minutoChegada;
	private int horaAtendimento;
	private int minutoAtendimento;
	private int horaSaida;
	private int minutoSaida;
	private int prioridade;
	private double temperatura;
	private String parecer;

	/**
	 * Registro do atendimento
	 * @param pessoa Referência ao cadastro do paciente que está sendo atendido
	 * @param horaChegada Hora da chegada do paciente na emergência
	 * @param minutoChegada Minuto da chegada do paciente na emergência
	 */
	
	public Atendimento(Paciente pessoa, int horaChegada, int minutoChegada) {
		
		super();
		this.pessoa = pessoa;
		this.horaChegada = horaChegada;
		this.minutoChegada = minutoChegada;
		
	}
	
	/**
	 * @return Referência ao cadastro do paciente que está sendo atendido
	 */
	
	public Paciente getPessoa() {
		return pessoa;
	}
	
	/**
	 * @return Hora da chegada do paciente na emergência
	 */
	
	public int getHoraChegada() {
		return horaChegada;
	}
	
	/**
	 * @return Minuto da chegada do paciente na emergência
	 */
	
	public int getMinutoChegada() {
		return minutoChegada;
	}

	/**
	 * @return Hora em que o paciente foi encaminhado para emergência
	 */
	
	public int getHoraAtendimento() {
		return horaAtendimento;
	}
	
	
	/**
	 * @param horaAtendimento Hora em que o paciente foi encaminhado para emergência
	 */
	public void setHoraAtendimento(int horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}
	
	/**
	 * @return Minuto em que o paciente foi encaminhado para emergência
	 */
	
	public int getMinutoAtendimento() {
		return minutoAtendimento;
	}

	/**
	 * @param minutoAtendimento Minuto em que o paciente foi encaminhado para emergência
	 */
	
	public void setMinutoAtendimento(int minutoAtendimento) {
		this.minutoAtendimento = minutoAtendimento;
	}
	
	/**
	 * @return Hora em que o paciente recebeu alta
	 */
	
	public int getHoraSaida() {
		return horaSaida;
	}

	/** 
	 * @param horaSaida Hora em que o paciente recebeu alta
	 */
	
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	/**
	 * @return Minuto em que o paciente recebeu alta
	 */
	
	public int getMinutoSaida() {
		return minutoSaida;
	}

	/**
	 * @param minutoSaida Minuto em que o paciente recebeu alta
	 */
	
	public void setMinutoSaida(int minutoSaida) {
		this.minutoSaida = minutoSaida;
	}
	
	/**
	 * @return Temperatura medida durante a triagem
	 */
	
	public double getTemperatura() {
		return temperatura;
	}
	
	/**
	 * @param temperatura Temperatura medida durante a triagem
	 */
	
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	/**
	 * @return Parecer médico sobre o atendimento
	 */
	
	public String getParecer() {
		return parecer;
	}
	
	/**
	 * @param parecer Parecer médico sobre o atendimento
	 */
	
	public void setParecer(String parecer) {
		this.parecer = parecer;
	}
	
	/**
	 * @return Classificação da prioridade do paciente de acordo com a triagem
	 */
	public int getPrioridade() {
		return prioridade;
	}
	
	/**
	 * @param prioridade Classificação da prioridade do paciente de acordo com a triagem
	 */
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	
	

	
}
