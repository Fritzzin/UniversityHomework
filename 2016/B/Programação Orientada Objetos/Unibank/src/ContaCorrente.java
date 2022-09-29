
public class ContaCorrente
{

    private int número;
    private double saldo;
    private String titular;
    private Movimento[] extrato;
    int contador = 0;
    private static int númeroSequencial = 0;

    public ContaCorrente(String titular)
    {
        ContaCorrente.númeroSequencial++;
        this.número = ContaCorrente.númeroSequencial;
        this.saldo = 0;
        this.titular = titular;
    }

    public static void setContador(int cont)
    {
        númeroSequencial = cont;
    }

    public String getTitular()
    {
        return titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    public int getNúmero()
    {
        return número;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void depositar(double valor, Data data, String operação)
    {
        if (valor > 0)
        {
            this.saldo += valor;
            extrato[contador] = new Movimento(data, operação, valor);
            contador++;
        }
    }

    public boolean sacar(double valor, String operação, Data data)
    {
        boolean ok = false;
        if (valor > 0 && saldo >= valor)
        {
            this.saldo -= valor;
            ok = true;
            contador++;
        }
        return ok;
    }

    public boolean pagarConta(double valor, String operação, Data data)
    {
        return this.sacar(saldo, operação, data);
    }

    public boolean transferir(ContaCorrente conta,
            double valor, String operação, Data data)
    {
        boolean ok = this.sacar(valor, operação, data);
        if (ok)
        {
            conta.depositar(valor, data, operação);
        }
        return ok;
    }

    public void getExtrato(int numero)
    {
        for (int i = 0; i < contador; i++)
        {
            System.out.println("Nº operação: " + i + "\n"
                    + "Data: " + extrato[i].getData() + "\n"
                    + "Operação: " + extrato[i].getOperação() + "\n"
                    + "Valor: " + extrato[i].getValor());
        }
    }
}
