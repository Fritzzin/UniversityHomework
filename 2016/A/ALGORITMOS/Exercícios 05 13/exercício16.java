public class exerc�cio16
{
    public static void main(String[] args)
    {
        String[] nome = new String[5];
        double[] preco = new double[5];
        int quantidade = 0;
        String menor100 = "";
        double media = 0;
        int cont = 0;
        
        for(int c=0;c<5;c++)
        {
            nome[c] = Entrada.leiaString("Digite o nome do "+(c+1)+"� produto:");
            preco[c] = Entrada.leiaDouble("Digite o valor do "+(c+1)+"� produto:");
            if(preco[c] < 50)
            {
                quantidade++;
            }
            if(preco[c]>50 && preco[c]<100)
            {
                menor100 += nome[c] + " ";
            }
            if(preco[c]>100)
            {
                media += preco[c];
                cont++;
            }
        } 
        System.out.println("Quantidade de produtos com pre�o inferior a R$50,00 :.......  "+quantidade);
        System.out.println("Nome dos produtos com pre�o entre R$50,00 e R$100,00 :......  "+menor100);
        System.out.println("Media dos produtos com pre�o superior a R$100,00:............ "+(media/cont));
    }
}





