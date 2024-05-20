import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {

        FilaSimples filaSimples = new FilaSimples(5);
        filaSimples.adicionarElemento(1);
        filaSimples.adicionarElemento(2);
        filaSimples.adicionarElemento(3);
        filaSimples.adicionarElemento(3);
        filaSimples.adicionarElemento(3);
        filaSimples.adicionarElemento(3);
        filaSimples.exibirElementos();
        filaSimples.();
    }
}