package modelo;

public class TAD_Lista { // duplamente encadeada

	
	private Nodo primeiro, ultimo;
	
	public TAD_Lista() {
		super();
		primeiro = null;
		ultimo = null;
	}

	/**
	 * Este m�todo insere o elemento no final da lista
	 * @param element
	 */
	public void addEnd(Object element) {
		Nodo novoNodo = new Nodo (element); 		
    	if (primeiro == null) {					// preenche primeira e ultima posi��o na primeira declara��o, quando a lista est� vazia
    	    primeiro = novoNodo; 				// elemento ocupa primeira posi��o 
    	    ultimo = novoNodo;   				// elemento ocupa ultima posi��o
    	} else { 								// se houver mais de um elemento na lista
    		ultimo.setProximo(novoNodo); 		// usa um novo endere�o de mem�ria apontado posterior ao ultimo para colocar o novo elemento (encadeamento simples)
    		novoNodo.setAnterior(ultimo); 		// a posi��o anterior ao novo elmento armazenado passa a ser apontada por ele (encadeamento duplo)
    		ultimo = novoNodo; 					// o ultimo passa a ser o novo elemento
    	}										// fim do else
	}											// fim do m�todo
	
	/**
	 * Este m�todo insere o elemento no in�cio da lista
	 * @param element
	 */
	public void addBegin(Object element) {
		Nodo novoNodo = new Nodo (element);
    	if (primeiro == null){				 	// preenche primeira e ultima posi��o na primeira declara��o, quando a lista est� vazia
    		primeiro = novoNodo;			 	// elemento digitado ocupa primeira posi��o 
     	    ultimo = novoNodo;   			 	// elemento digitado ocupa ultima posi��o
    	} else {								// se houver mais de um elemento na lista
    	   primeiro.setAnterior(novoNodo);		// usa um novo endere�o de mem�ria apontado anterior ao primiero para colocar o novo elemento (encadeamento simples)
    	   novoNodo.setProximo(primeiro);		// a posi��o posterior ao novo elmento armazenado passa a ser apontada por ele (encadeamento duplo)
    	   primeiro = novoNodo;					// o primeiro passa a ser o novo elemento
    	}										// fim do else
	}											// fim do m�todo
	
	/**
	 * Este m�todo remove o elemento contido em determinada <br>
	 * posi��o da lista, recebida por par�metro
	 * @param position
	 */
	public void removePosition(int position) {
		 Nodo aux = primeiro;								// v�riavel auxiliar do tipo Nodo recebe o endere�o de mem�ria da primeira posi��o							
         for (int i=0; i<position; i++){					// la�o que avan�a o endere�o da v�riavel auxiliar at� a posi��o desejada 
        	 if (aux != null){								// se a lista estiver vazia a v�riavel auxiliar n�o passa adiante e armazena a primeira posi��o at� o final
        		 aux = aux.getProximo();					// a v�riavel auxiliar armazena o endere�o de mem�ria da posi��o seguinte
        	 }												// fim do if
         }													// fim do la�o, for
         aux.getAnterior().setProximo(aux.getProximo());	// aponta o endere�o anterior ao auxiliar ao pr�ximo
         aux.getProximo().setAnterior(aux.getAnterior());	// aponta o endere�o posterior ao auxiliar ao anterior
	}														// fim do m�todo
	
	
	/**
	 * 
	 * @param position
	 * @return Este m�todo retorna o elemento contido em <br>
	 * determinada posi��o, recebida por par�metro, e retorna null, caso n�o exista a <br>
	 * posi��o informada.
	 */
	public Object searchByPosition(int position) {
		Nodo aux = primeiro;
		for (int i=0; i<position; i++){						// la�o que avan�a o endere�o da v�riavel auxiliar at� a posi��o desejada 
			if (aux != null){								// se a lista estiver vazia a v�riavel auxiliar n�o passa adiante e armazena a primeira posi��o at� o final
				aux = aux.getProximo();						// a v�riavel auxiliar armazena o endere�o de mem�ria da posi��o seguinte
			}												// fim do if
        }													// fim do la�o, for
		if (aux != null) {									// se a lista n�o estiver vazia
			return aux.getDado();							// retorna o valor contido na posi��o
		}else {												// se a lista estiver vazia
			return null;									// retorna null
		}													// fim do else
	}														// fim do m�todo
	
	/**
	 * 
	 * @param id
	 * @return Este m�todo retorna o elemento cujo paciente tenha o n�mero <br>
	 * de cpf recebido por par�metro, e retorna null, caso n�o exista um paciente com <br>
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