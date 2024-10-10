import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> formas; // Lista que armazena as instâncias de Forma
    private CorFactory corFactory;

    public FormaManager() {
        formas = new ArrayList<>();
        corFactory = new CorFactory();
    }

    // Método que adiciona uma nova forma à lista
    public void addForma(String nomeCor, String posicao, int tamanho){
        if (nomeCor == null || nomeCor.isEmpty()){
            throw new IllegalArgumentException("O nome da cor não pode ser vazio ou nulo!");
        }

        if (tamanho <= 0){
            throw new IllegalArgumentException("O tamanho não pode ser zero ou negativo!");
        }

        if (posicao == null || posicao.isEmpty()){
            throw new IllegalArgumentException("A posição não pode ser vazia!");
        }
        // Obtém a cor correspondente da CorFactory
        Cor cor = CorFactory.getCor(nomeCor);

        // Cria uma nova instância de Forma e a adiciona à lista
        Forma forma = new Forma(cor, posicao, tamanho);
        formas.add(forma);
    }

    public void apresentar (){
        for (Forma forma: formas){
            System.out.println(forma.toString());
        }
    }
}
