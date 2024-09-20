public class ArvoreBinaria {
    private Node root;

    // Construtor para inicializar a raiz
    public ArvoreBinaria() {
        this.root = null;
    }

    // insere um valor na árvore
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Método recursivo para inserir um valor na árvore
    private Node insertRec(Node root, int value) {
        // Se a árvore está vazia, cria um novo nó e retorna
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // Aqui serve para ver quando o menor vai para o lado esquerto e o maior para o lado direiro
        if (value < root.value) {
            // Insere no filho esquerdo
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            // Insere no filho direito
            root.right = insertRec(root.right, value);
        }

        // Retorna o nó atual
        return root;
    }

    // buscar um valor na árvore
    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Método  recursivo para buscar um valor na árvore
    private boolean searchRec(Node root, int value) {

        if (root == null || root.value == value) {
            return root != null;
        }

        //  percorre a árvore pela esquerda ou se não pela direita
        if (value < root.value) {

            return searchRec(root.left, value);
        } else {

            return searchRec(root.right, value);
        }
    }

    // Método para percorrer a árvore em ordem
    public void inOrder() {
        inOrderRec(root);
    }

    // Método recursivo para percorrer a árvore em ordem
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left); // Visita o filho esquerdo
            System.out.print(root.value + " "); // Visita o nó atual
            inOrderRec(root.right); // Visita o filho direito
        }
    }
}
