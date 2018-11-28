package modelo;

public class Nodo {
	
	private Nodo proximo;
	private Nodo anterior;
	private Object dado;
	
	public Nodo(Object dado) {
		super();
		this.proximo = null;
		this.anterior = null;
		this.dado = dado;
	}
	
	
	public Nodo getProximo() {
		return proximo;
	}
	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	public Nodo getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	public Object getDado() {
		return dado;
	}
	public void setDado(Object dado) {
		this.dado = dado;
	}
	
	
	
}
