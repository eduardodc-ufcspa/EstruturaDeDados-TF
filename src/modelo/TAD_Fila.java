package modelo;

public class TAD_Fila {

	private Nodo primeiro;
	private Nodo ultimo;
	
	public TAD_Fila() {
		super();
	}

	/**
	 * Este metodo insere o elemento no final da fila
	 * @param elemento
	 * 
	 */
	public void enqueue (Object elemento) {
		
		Nodo novoNodo = new Nodo(elemento);
		
		if(primeiro == null) {
			primeiro = novoNodo;
			ultimo = novoNodo;
		} else {
			ultimo.setProximo(novoNodo);
			ultimo = novoNodo;
		}
	}
	
	/**
	 * @return Este metodo remove e retorna o elemento e do inicio da fila, e retorna null <br>
	 * se a fila estiver vazia
	 */
	public Object dequeue () {
		
		Nodo retorno = primeiro;
		
		if(primeiro == ultimo) {
			primeiro = null;
			ultimo = null;
		} else if (primeiro != null) {
			primeiro = primeiro.getProximo();
		}
		
		return retorno;
	}
	
	/**
	 * @return Este metodo retorna, mas nao remove, o primeiro elemento da fila, e retorna <br>
	 * null se a fila estiver vazia
	 */
	public Object head() {
		
		return primeiro.getDado();
	}
	
	/**
	 * 
	 * @return Este metodo retorna o numero de elementos da fila
	 */
	public int size() {
		
		int i = 0;
		Nodo aux = primeiro;
		
		while(aux != null) {
			i++;
			aux = aux.getProximo();
		}
		
		return i;
	}
	
	/**
	 * 
	 * @return Este metodo retorna true se a fila estiver vazia, e false caso contrario
	 */
	public boolean isEmpty() {
		if(primeiro == null) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Este metodo esvazia a fila.
	 */
	public void clear() {
		primeiro = null;
		ultimo = null;
	}
}
