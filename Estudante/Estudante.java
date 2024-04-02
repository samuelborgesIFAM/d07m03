public class Estudante {
    // ID da pessoa
    private String id;

    // Nome da pessoa
    private String nome;

    /**
     * Construtor para objetos da classe Estudante. Recebe os dados do estudante que são o nome e o
     * codigo.
     *
     * @param nomeEstudante é o nome do estudante
     * @param idEstudante é o codigo do estudante
     */
    public Estudante(String nomeEstudante, String idEstudante) {
        if (nomeEstudante.length() < 4 || idEstudante.length() < 3) {
            System.out.println("Nome e/ou ID inválido(s)");
        } else {
            nome = nomeEstudante;
            id = idEstudante;
        }
    }

    /**
     * Retoran o nome do estudante.
     *
     * @return o nome do estudante
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set a new name for this person
     */
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    /**
     * Return the ID of this person.
     */
    public String getID() {
        return id;
    }

    /**
     * Return the login name of this student. The login name is a combination of the first four
     * characters of the student's name and the first three characters of the student's ID number.
     */
    public String getLoginName() {
        String loginNome = nome.length() >= 4 ? nome.substring(0, 4) : nome;
        String loginID = id.length() >= 3 ? id.substring(0, 3) : id;
        return loginNome + loginID;
    }

    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(nome + " (" + id + ")");
    }
}
