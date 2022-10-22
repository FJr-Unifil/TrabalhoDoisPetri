package trabalho2;

public class Executor {
    public static void main(String[] args) {
//        ListaSimples listaSimples = new ListaSimples(5);
//        //listaSimples.mostrar();
//        listaSimples.adiciona(50, 2);
//        listaSimples.exibeLista();
//        listaSimples.remove(-2);
//        listaSimples.exibeLista();

        ListaLigada listaLigada = new ListaLigada();
        System.out.println(listaLigada.getTamanho());
        
        //Inserindo um elemento na lista ligada
        listaLigada.adicionaInicio(10);
        listaLigada.adicionaFinal(11);
        listaLigada.adicionaFinal(12);
        listaLigada.adicionaInicio(8);
        System.out.println(listaLigada.getTamanho());
        
        //Verificando elementos da minha lista ligada
        listaLigada.mostraNos();
       
        
    }
    
    
}