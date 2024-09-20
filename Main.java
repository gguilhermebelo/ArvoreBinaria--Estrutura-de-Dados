public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvorezinha = new ArvoreBinaria();

        // insere
        arvorezinha.insert(50);
        arvorezinha.insert(30);
        arvorezinha.insert(70);
        arvorezinha.insert(20);
        arvorezinha.insert(40);
        arvorezinha.insert(60);
        arvorezinha.insert(80);

        // Percorre
        System.out.println("Percorrendo a árvore em ordem:");
        arvorezinha.inOrder();

        // Busca
        System.out.println("\n\nBusca por 40: " + (arvorezinha.search(40) ? "Encontrado" : "Não encontrado"));
        System.out.println("Busca por 100: " + (arvorezinha.search(100) ? "Encontrado" : "Não encontrado"));
    }
}
