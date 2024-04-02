public class Livro
{
    // Nome do autor
    private String autor;
    
    // Nome do livro
    private String titulo;
    
    // Número de paginas do livro
    private int paginas;
    
    // Número de referência do livro
    private String numeroRef = ("");
    
    // Número de quantas vezes o livro foi emprestado
    private int emprestado;
    
    // Insira os dados do livro
    public Livro(String nomeAutor, String nomeTitulo, int qntPaginas) {
        autor = nomeAutor;
        titulo = nomeTitulo;
        paginas = qntPaginas;
    }
    
    // Coloque o número de referência do livro 
    public String setNumeroRef (String metNumeroRef) {
        // O código deve ser maior que 3 caracteres
        if (metNumeroRef.length() < 3) {
            System.out.println("ERRO: Número de Referência pequeno demais.");
            System.out.println("Utilize de 3 a mais caracteres.");
        }
        else {
            numeroRef = metNumeroRef;
        }
        return numeroRef;
    }
    
    // Retorna o nome do autor
    public String getAutor() {
        return autor;
    }
    
    // Retorna o nome do livro
    public String getTitulo() {
        return titulo;
    }
    
    // Retorna o número de páginas do livro
    public int getPaginas() {
        return paginas;
    }
    
    // Retorna o numero de referência do livro
    public String getNumeroRef() {
        return numeroRef;
    }
    
    // Imprime o nome do autor no terminal
    public void printAutor() {
        System.out.println("O nome do autor é " + autor + ".");
    }
    
    // Imprime o nome do livro no terminal
    public void printTitulo() {
        System.out.println("O nome do livro é " + titulo + ".");
    }
    
    // Empresta o livro
    public void emprestar() {
        emprestado += 1;
    }
    
    // Imprime todos os detalhes do livro
    public void printDetalhes() {
        if (numeroRef.length() > 0) {
            System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas);
            System.out.println("Número de Referência: " + numeroRef + ", Emprestado " + emprestado + " vez(es).");
        }
        else {
            System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas + ", Número de Referência: ZZZ");
            System.out.println("Número de Referência: ZZZ, Emprestado " + emprestado + " vez(es).");
        }
    }
}
