/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augus
 */
public class Reservatorio
{

    private double nívelDeÁgua;

    public Reservatorio()
    {
        this.nívelDeÁgua = 0;
    }

    public void setNívelDeÁgua()
    {
        this.nívelDeÁgua -= 100;
    }

    public double getNívelDeÁgua()
    {
        return nívelDeÁgua;
    }
    
     public void reabastecer()
    {
        this.nívelDeÁgua = 20000;
    }

}
