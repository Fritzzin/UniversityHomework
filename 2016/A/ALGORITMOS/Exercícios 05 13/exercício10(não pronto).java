public class exercício10(não pronto)
{
    public static void main(String[] args)
    {
        int[] v1 = {1,2,3,4,5,6,7,8,9,10};
        int[] v2 = {1,2,3,4,5};
        int pares = 0;
        int x =0;
        
        while (x<10)
        { 
            for (int c=0;c<5;c++)
            {
                if(v1[x] % v2[c] == 0)
                {
                    pares++;
                }
            }
            x += 1;
        }
        
        
        System.out.println("PARES:..........."+pares);
        int[] vr1= new int[pares];
        while (x<5)
        {
            int soma = 0;
            
            for(int i=0;i<5;i++)
            {
                soma += v2[i];
            }
            
            for (int c=0;c<15;c++)
            {
                if(v1[c] % v2[x] == 0)
                {
                    vr1[c] = v1[c] + soma;
                }
            }
            x += 1;
        }
        for(int c = (pares-1) ; c<(pares-1);c++)
        {
            System.out.println(vr1[c]);
        }
    }
}