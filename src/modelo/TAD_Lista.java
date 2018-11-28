package modelo;

public class TAD_Lista { // duplamente encadeada

	
	private Nodo primeiro, ultimo;
	
	public TAD_Lista() {
		super();
		primeiro = null;
		ultimo = null;
	}

	/**
	 * Este método insere o elemento no final da lista
	 * @param element
	 */
	public void addEnd(Object element) {
		Nodo novoNodo = new Nodo (element); 		
    	if (primeiro == null) {					// preenche primeira e ultima posição na primeira declaração, quando a lista está vazia
    	    primeiro = novoNodo; 				// elemento ocupa primeira posição 
    	    ultimo = novoNodo;   				// elemento ocupa ultima posição
    	} else { 								// se houver mais de um elemento na lista
    		ultimo.setProximo(novoNodo); 		// usa um novo endereço de memória apontado posterior ao ultimo para colocar o novo elemento (encadeamento simples)
    		novoNodo.setAnterior(ultimo); 		// a posição anterior ao novo elmento armazenado passa a ser apontada por ele (encadeamento duplo)
    		ultimo = novoNodo; 					// o ultimo passa a ser o novo elemento
    	}										// fim do else
	}											// fim do método
	
	/**
	 * Este método insere o elemento no início da lista
	 * @param element
	 */
	public void addBegin(Object element) {
		Nodo novoNodo = new Nodo (element);
    	if (primeiro == null){				 	// preenche primeira e ultima posição na primeira declaração, quando a lista está vazia
    		primeiro = novoNodo;			 	// elemento digitado ocupa primeira posição 
     	    ultimo = novoNodo;   			 	// elemento digitado ocupa ultima posição
    	} else {								// se houver mais de um elemento na lista
    	   primeiro.setAnterior(novoNodo);		// usa um novo endereço de memória apontado anterior ao primiero para colocar o novo elemento (encadeamento simples)
    	   novoNodo.setProximo(primeiro);		// a posição posterior ao novo elmento armazenado passa a ser apontada por ele (encadeamento duplo)
    	   primeiro = novoNodo;					// o primeiro passa a ser o novo elemento
    	}										// fim do else
	}											// fim do método
	
	/**
	 * Este método remove o elemento contido em determinada <br>
	 * posição da lista, recebida por parâmetro
	 * @param position
	 */
	public void removePosition(int position) {
		 Nodo aux = primeiro;								// váriavel auxiliar do tipo Nodo recebe o endereço de memória da primeira posição							
         for (int i=0; i<position; i++){					// laço que avança o endereço da váriavel auxiliar até a posição desejada 
        	 if (aux != null){								// se a lista estiver vazia a váriavel auxiliar não passa adiante e armazena a primeira posição até o final
        		 aux = aux.getProximo();					// a váriavel auxiliar armazena o endereço de memória da posição seguinte
        	 }												// fim do if
         }													// fim do laço, for
         aux.getAnterior().setProximo(aux.getProximo());	// aponta o endereço anterior ao auxiliar ao próximo
         aux.getProximo().setAnterior(aux.getAnterior());	// aponta o endereço posterior ao auxiliar ao anterior
	}														// fim do método
	
	
	/**
	 * 
	 * @param position
	 * @return Este método retorna o elemento contido em <br>
	 * determinada posição, recebida por parâmetro, e retorna null, caso não exista a <br>
	 * posição informada.
	 */
	public Object searchByPosition(int position) {
		Nodo aux = primeiro;
		for (int i=0; i<position; i++){						// laço que avança o endereço da váriavel auxiliar até a posição desejada 
			if (aux != null){								// se a lista estiver vazia a váriavel auxiliar não passa adiante e armazena a primeira posição até o final
				aux = aux.getProximo();						// a váriavel auxiliar armazena o endereço de memória da posição seguinte
			}												// fim do if
        }													// fim do laço, for
		if (aux != null) {									// se a lista não estiver vazia
			return aux.getDado();							// retorna o valor contido na posição
		}else {												// se a lista estiver vazia
			return null;									// retorna null
		}													// fim do else
	}														// fim do método
	
	/**
	 * 
	 * @param id
	 * @return Este método retorna o elemento cujo paciente tenha o número <br>
	 * de cpf recebido por parâmetro, e retorna null, caso não exista um paciente com <br>
	 * o cpf informado.
	 */
	public Object searchByID (String cpf) {
		Nodo aux = primeiro;
		
		while(aux != null) {
			Paciente atual = Paciente.class.cast(aux.getDado());
			if(atual.getCpf().equalsIgnoreCase(cpf)) {
				return aux.getDado();
			}
			aux = aux.getProximo();
		}
		
		return null;
		
	}	
}