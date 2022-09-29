
/**
 *
 * @author augusto.fritz
 */
public class Tela
{

    public void exibir()
    {
        Conta[] conta = new Conta[1000];
        String menu = "MENU \n"
                + "1. Criar conta \n"
                + "2. Listar contas \n"
                + "3. Verificar saldo \n"
                + "4. Realizar um depósito \n"
                + "5. Realizar uma transferência \n"
                + "6. Realizar um saque \n"
                + "7. Realizar um pagamento \n"
                + "0. Fechar o programa";
        char op = ' ';
        int c = 0;

        while (op
                != '0')
        {
            op = Entrada.leiaChar(menu);
            if (op == '1')
            {
                String nome = Entrada.leiaString("Digite o nome do titular da conta:");
                conta[c] = new Conta(nome);
                c++;
            }
            if (op == '2')
            {
                for (int i = 0; i < c; i++)
                {
                    System.out.println("");
                    System.out.println("Número da conta: " + (i + 1) + " \n"
                            + "Titular da conta: " + conta[i].getTitular() + " \n"
                            + "Saldo total: " + conta[i].getSaldo());
                }
                System.out.println("- - - - - - - - - - - - - - - - - - -");
            }
            if (op == '3')
            {
                int i = Entrada.leiaInt("Digite o código da conta que deseja verificar o saldo");
                System.out.println(conta[i - 1].getSaldo());
            }
            if (op == '4')
            {
                int i = Entrada.leiaInt("Código da conta que deseja depositar:");
                double valor = Entrada.leiaDouble("Valor a ser depositado:");
                conta[i - 1].deposito(valor);
            }
            if (op == '5')
            {
                int contaA = Entrada.leiaInt("Digite a conta que irá sacar:");
                int contaB = Entrada.leiaInt("Digite a conta que receberá:");
                double valor = Entrada.leiaDouble("Valor a ser transferido:");
                if (conta[contaA - 1].transferencia(conta[contaB - 1], valor))
                {
                    System.out.println("Transferência concluída com sucesso!");
                } else
                {
                    System.out.println("Transferência não pode ser concluída!");
                }
            }
            if (op == '6')
            {
                int i = Entrada.leiaInt("Código da conta que deseja sacar:");
                double valor = Entrada.leiaDouble("Valor a ser sacado:");
                conta[i - 1].saque(valor);
            }
            if (op == '7')
            {
                int i = Entrada.leiaInt("Código da conta que deseja sacar:");
                double valor = Entrada.leiaDouble("Valor a ser sacado para o pagamento da conta:");
                conta[i - 1].pagarConta(valor);
            }
        }
    }
}
