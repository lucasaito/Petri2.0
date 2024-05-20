public class FilaSimples {
    private int tamanho;
    private Integer fila[];


    public FilaSimples(int tamanho) {
        if (tamanho <= 0) {
            System.out.println("Tamanho inválido.");
        } else {
            this.tamanho = tamanho;
            this.fila = new Integer[this.tamanho];
            System.out.println("A fila simples foi criada.");
        }
    }

    public void exibirElementos() {
        for (int i = 0; i < this.tamanho ; i++) {
            System.out.println(fila[i]);
        }
    }

    public void adicionarElemento(Integer valor){
        if (fila[this.tamanho-1] == null){
            for (int i = 0; i < this.tamanho; i++) {
                if (fila[i] == null){
                    fila[i] = valor;
                    break;
                }
            }
        } else {
            System.out.println("CHEIO.!.!.!");
        }
        espacosLivres();
    }

    public void espacosLivres(){
        int contador = 0;
        for(int i = 0; i < this.tamanho; i++){
            if (fila[i] == null){
                contador++;
            }
        }
        System.out.println("Há " + contador + " espaços livres.");
    }



    public boolean existeElemento(Integer elemento) {
        for (int i = 0; i < this.tamanho ; i++) {
            if(fila[i] == elemento) {
                System.out.println("O elemento " + elemento + " está presente na lista.");
                return true;
            }
        }
        System.out.println("O elemento " + elemento + " não está presente na lista.");
        return false;
    }

    public int verificarPosicaoDisponivel() {
        for (int i = 0; i < this.tamanho; i++) {
            if(fila[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void adicaoPorSubstituicao(int indice, Integer valor) {
        if(indice >= 0 && indice < this.tamanho) {
            this.fila[indice] = valor;
            System.out.println("O elemento " + valor + " foi adicionado com sucesso!");
        } else {
            System.out.println("O índice informado não é válido.");
        }

    }

}