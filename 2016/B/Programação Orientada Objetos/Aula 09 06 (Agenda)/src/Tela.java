
/**
 *
 * @author augusto.fritz
 */
public class Tela
{

    public void exibir()
    {
        String menu = ("MENU \n"
                + "1. Agendar um novo compromisso: \n"
                + "2. Deletar um compromisso:\n"
                + "3. Listar todos os compromissos:\n"
                + "4. Listar compromissos entre duas datas:\n"
                + "0. Desligar o sistema");

        char op = ' ';
        Compromisso[] compr = new Compromisso[10000];
        int total = 0;
        while (op != '0')
        {
            op = Entrada.leiaChar(menu);

            if (op == '1')
            {
                Data data = new Data();
                boolean ok = false;
                while (ok == false)
                {
                    data.setDia(Entrada.leiaInt("Digite o dia"));
                    data.setMes(Entrada.leiaInt("Digite o mês:"));
                    data.setAno(Entrada.leiaInt("Digite o ano:"));
                    if (data.validarData())
                    {
                        ok = true;
                    } else
                    {
                        System.out.println("Digite um data válida!");
                    }
                }
                Compromisso compromisso = new Compromisso(data);
                //compromisso.setHoras(Entrada.leiaInt("Digite as horas:"));
                //compromisso.setMinutos(Entrada.leiaInt("Digite os minutos:"));
                compromisso.setLocal(Entrada.leiaString("Digite o local:"));
                compromisso.setInfo(Entrada.leiaString("Informações adicionais:"));
                compr[total] = compromisso;
                total++;
            }

            if (op == '2')
            {
                int deletar = Entrada.leiaInt("Digite o código do compromisso que deseja deletar:");
                for (int i = 2; i < total - 1; i++)
                {
                    compr[i] = compr[i + 1];
                }
                total--;
            }

            if (op == '3')
            {
                for (int i = 0; i < total; i++)
                {
                    System.out.println(i + ".Dia: " + compr[i].getData().getDia()
                            + "\n  Mês: " + compr[i].getData().getMes()
                            + "\n  Ano: " + compr[i].getData().getAno()
                            + "\n  Local: " + compr[i].getLocal()
                            + "\n  Informações: " + compr[i].getInfo());
                    System.out.println("");
                }
            }

            if (op == '4')
            {
                int diaA = Entrada.leiaInt("1º dia:");
                int mesA = Entrada.leiaInt("1º mes:");
                int anoA = Entrada.leiaInt("1º ano:");
                int diaB = Entrada.leiaInt("2º dia:");
                int mesB = Entrada.leiaInt("2º mes:");
                int anoB = Entrada.leiaInt("2º ano:");

                for (int i = 0; i < total; i++)
                {
                    boolean ok = false;
                    if (Math.min(anoA, anoB) <= compr[i].getData().getAno() && Math.max(anoA, anoB) >= compr[i].getData().getAno())
                    {
                        ok = true;
                    }
                    if (Math.min() <= compr[i].getData().getAno() && Math.max(anoA, anoB) >= compr[i].getData().getAno())
                    {
                        ok = true;
                    }
                    }
                }
            }
        }
    }
