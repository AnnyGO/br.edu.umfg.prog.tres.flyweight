import java.util.HashMap;
import java.util.Map;

// Criando a Classe Cor Factory
public class CorFactory {
    //Hashmap para armazenar as instâncias de cor reutilizáveis
    private static final Map<String,Cor> cores = new HashMap<>();

    //Método que retornará a cor correspondente ou criará uma nova se não existir
    public static Cor getCor(String nome){

        //Verificando se a cor já existe no mapa
        Cor cor = cores.get(nome);

        //Se não existir, cria uma nova instância e armazena no mapa
        if (cor == null){
            cor = new Cor(nome);
            cores.put(nome, cor);
        }
        return cor;
    }
}
