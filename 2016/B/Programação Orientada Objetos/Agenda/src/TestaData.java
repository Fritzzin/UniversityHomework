public class TestaData
{
    public static void main(String[] args)
    {
        Data dt1 = new Data(8,2,2006);
        Data dt2 = new Data(2,2,2010);
        
        if (dt1.compareTo(dt2) > 0)
        {
            System.out.println( dt1.getDataFormatada(1) );
        }
        else
        {
            System.out.println( dt2.getDataFormatada(1) );
        }
        
    }
}
