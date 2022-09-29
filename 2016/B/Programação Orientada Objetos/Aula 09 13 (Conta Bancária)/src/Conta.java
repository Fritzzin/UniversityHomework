
/**
 *
 * @author augusto.fritz
 */
public class Conta
{

    private int numero;
    private double saldo;
    private String titular;

    private static int numeroSequencial = 0;

    public Conta(String titular)
    {
        Conta.numeroSequencial++;
        this.numero = Conta.numeroSequencial;
        this.saldo = 0;
        this.titular = titular;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public double getNumero()
    {
        return numero;
    }

    public boolean deposito(double valor)
    {
        boolean ok = false;
        if (valor >= 0)
        {
            this.saldo += valor;
            ok = true;
        }
        return ok;
    }

    public boolean saque(double valor)
    {
        boolean ok = false;
        if ((this.saldo - valor) >= 0)
        {
            this.saldo -= valor;
            ok = true;
        }
        return ok;
    }

    public boolean transferencia(Conta c, double valor)
    {
        boolean ok = false;
        if (this.saque(valor))
        {
            c.deposito(valor);
            ok = true;
        }
        return ok;
    }

    public String getTitular()
    {
        return titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    public boolean pagarConta(double valor)
    {
        boolean ok = this.saque(valor);
        return ok;
    }
}
