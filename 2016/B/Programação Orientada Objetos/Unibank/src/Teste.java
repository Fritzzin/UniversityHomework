public class Teste
{
    public static void main(String[] args)
    {
        ContaCorrente c1 = new ContaCorrente("João");
        System.out.println( c1.getNúmero() );
        
        ContaCorrente c2 = new ContaCorrente("João");
        System.out.println( c2.getNúmero() );
    }
    
    
}
