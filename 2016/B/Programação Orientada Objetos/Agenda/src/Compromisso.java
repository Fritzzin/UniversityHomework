public class Compromisso
{
   private Data data;
   private String descrição;

    public Compromisso(Data data, String descrição)
    {
        this.data = data;
        this.descrição = descrição;
    }

    public String getDescrição()
    {
        return descrição;
    }

    public void setDescrição(String descrição)
    {
        this.descrição = descrição;
    }

    public Data getData()
    {
        return data;
    }

    public void setData(Data data)
    {
        this.data = data;
    }
}
