public class MaquinaDeTicket
{
    // O preco de um ticket desta maquina.
    private int preco;
    // A quantia de dinheiro inserida por um cliente até o momento.
    private int saldo;
    // A quantia total de dinheiro coletada por esta máquina.
    private int total;
    // O troco do cliente  
    private int troco;
    
    /* Insira o valor do ticket */
    public MaquinaDeTicket(int vlrTicket)
    {
        preco = vlrTicket;
        saldo = 0;
        total = 0;
    }
    
    /* Valor padrão do ticket */
    public MaquinaDeTicket()
    {
        preco = 5;
        saldo = 0;
        total = 0;
    }
    
    /* Muda o valor do ticket */
    public int mudarPreco(int vlrTicket)
    {
        preco = vlrTicket;
        if (vlrTicket < 0) {
            preco = 0;
        }
        return preco;
    }
    
    /* Incrementa o preco por 2 */
    public int incrementaVlrTicket()
    {
        preco += 2;
        return preco;
    }
    
    /* Decrementa o preco por 2 */
    public int decrementaVlrTicket()
    {
        preco -= 2;
        if (preco <= 0) {
            preco = 0;
        }
        return preco;
    }
    
    /* Retorna o valor do ticket */
    public int getPreco()
    {
        return preco;
    }

    /* Retorna o saldo do dinheiro inserido na máquina */
    public int getSaldo()
    {
        return saldo;
    }
    
    /* Retorna o total */
    public int getTotal()
    {
        return total;
    }
    
    /* Retorna o troco ao usuário e limpa o saldo */
    public int getTroco()
    {
        troco = saldo;
        saldo = 0;
        return troco;
    }

    /* Insira se dinheiro */
    public void inserirDinheiro(int valor)
    {
        saldo = saldo + valor;
    }

    public void imprimirPassagem()
    {
        // Simula a impressão de um ticket.
        if (saldo >= preco) {
            System.out.println("##################");
            System.out.println("# IFAM LP I");
            System.out.println("# Passagem ");
            System.out.println("# R$ " + preco + ",00");
            System.out.println("##################");
            System.out.println();
            
            // Atualize o total coletado com o saldo.
            total = total + preco;
            // Limpar o saldo.
            saldo = saldo - preco;
        }
        else {
            System.out.println("Saldo Insuficiente\n");
        }
    }
    
    public void esvaziarMaquina()
    {
        System.out.println("A máquina vendeu R$ " + total + ",00 Reais nessa sessão");
        total = 0;
        System.out.println("Máquina esvaziada");
    }
}
