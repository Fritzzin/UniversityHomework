package cafeteira.negocio;

public class Cafeteira
{
    private int nívelÁgua;
    private int nívelCapuccino;
    private int nívelCafé;
    private int nívelChocolate;
    private int contador;

    public Cafeteira()
    {
        this.nívelÁgua = 0;
        this.nívelCapuccino = 0;
        this.nívelCafé = 0;
        this.nívelChocolate = 0;
        this.contador = 0;
    }

    public int getNívelÁgua()
    {
        return nívelÁgua;
    }

    public void abastecerÁgua()
    {
        this.nívelÁgua = 20000;
    }

    public int getNívelCapuccino()
    {
        return nívelCapuccino;
    }

    public void abastecerCapuccino()
    {
        this.nívelCapuccino = 1000;
    }

    public int getNívelCafé()
    {
        return nívelCafé;
    }

    public void abastecerCafé()
    {
        this.nívelCafé = 1000;
    }

    public int getNívelChocolate()
    {
        return nívelChocolate;
    }

    public void abastecerChocolate()
    {
        this.nívelChocolate = 1000;
    }

    public int getContador()
    {
        return contador;
    }

    public void reinizializarContador()
    {
        this.contador = 0;
    }
    
    public boolean servirCapuccino()
    {
        boolean ok = false;
        if (this.nívelÁgua >= 150 && this.nívelCapuccino >= 50)
        {
            this.nívelÁgua -= 150;
            this.nívelCapuccino -= 50;
            this.contador ++;
            ok = true;
        }
        return ok;
    }
    
    public boolean servirCafé()
    {
        boolean ok = false;
        if (this.nívelÁgua >= 150 && this.nívelCafé >= 50)
        {
            this.nívelÁgua -= 150;
            this.nívelCafé -= 50;
            this.contador ++;
            ok = true;
        }
        return ok;
    }
    
    public boolean servirChocolate()
    {
        boolean ok = false;
        if (this.nívelÁgua >= 150 && this.nívelChocolate >= 50)
        {
            this.nívelÁgua -= 150;
            this.nívelChocolate -= 50;
            this.contador ++;
            ok = true;
        }
        return ok;
    }
    
}
