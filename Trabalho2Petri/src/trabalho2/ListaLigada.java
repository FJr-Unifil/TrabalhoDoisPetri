package trabalho2;

public class ListaLigada<T> {

	private No<T> primeiro;
	private int tamanho;
	private int contador = 0;

	public ListaLigada() {
		primeiro = null;
		tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void adicionaInicio(T conteudo) {
		No<T> novoNo = new No<T>(conteudo, null);
		if (tamanho == 0) {
			primeiro = novoNo;
		} else {
			No<T> anterior = novoNo;
			No<T> atual = anterior;
			while (atual.getProximo() != null) {
				atual.setConteudo(conteudo);;
			}
			
		}
		tamanho++;
	}

	public void adicionaFinal(T conteudo) {
		No<T> novoNo = new No<T>(conteudo, null);
		if (tamanho == 0) {
			primeiro = novoNo;
		} else {
			No<T> atual = primeiro;
			while (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			atual.setProximo(novoNo);
		}
		tamanho++;
	}

	public void mostraNos() {
		if (tamanho != 0) {
			No<T> atual = primeiro;
			// atual = atual.getProximo();
			contador = 0;
			while (atual.getProximo() != null) {
				System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
				atual = atual.getProximo();
				contador++;
			}
			System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
		} else {
			System.out.println("Não existe nenhum elemento na lista.");
		}
	}

}