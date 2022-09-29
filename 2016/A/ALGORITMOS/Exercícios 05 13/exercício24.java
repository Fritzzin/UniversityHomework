public class exercício24
{
    public static void main(String[] args)
    {
        int[] n = {3,4,5,8,11,14,16,17,19,20,24,27,29,31,37};
        String primos = "";
        
        for(int i=0;i<15;i++)
        {
            int calculo = 0;
            int resposta = 0;
            for (int c =(n[i]-1);c>1;c--)
            {
                calculo = n[i] % c;
                if (calculo == 0)
                {
                    resposta = 1;
                }
            }
            if (resposta == 0)
            {
                primos += n[i] + " ";
            }
        }
        System.out.println("Primos : "+primos);
    }
}

