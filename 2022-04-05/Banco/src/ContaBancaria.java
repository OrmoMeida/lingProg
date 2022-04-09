public class ContaBancaria{
    private String cliente; 
    private int numConta;
    private double saldo;
    private static int qntContas = 1;
    
    // Construtor sem argumentos
    public ContaBancaria() {
        cliente = "";
        numConta = 0;
        saldo = 0;
    }
    // Construtor com argumentos
    public ContaBancaria(String cliente, double saldo) {
        this.cliente = cliente; 
        this.saldo = saldo;
        numConta = qntContas;
        qntContas++;
    }
    
    public double sacar(double valor) {
        valor = verifySaldo(valor);

        if (valor > saldo) {
            System.out.println("Não é possível sacar.");
            return 0;
        }

        saldo -= valor;
        return valor;
    }

    public void depositar(double valor) {
        saldo += verifySaldo(valor);
    }

    protected double verifySaldo(double valor) {
        if (valor < 0) {
            return 0;
        }
        return valor;
    }


    // Um monte de set e get
    public int getNumConta() {
        return this.numConta;
    }

    public String getcliente() {
        return this.cliente;
    }
    public void setcliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = verifySaldo(saldo);
    }
}