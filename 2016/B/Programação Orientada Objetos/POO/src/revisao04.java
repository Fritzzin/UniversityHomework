/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augusto.fritz
 */
public class revisao04
{

    public static void main(String[] args)
    {
        double[] cordX = new double[10];
        double[] cordY = new double[10];

        for (int c = 0; c < 10; c++)
        {
            cordX[c] = Entrada.leiaDouble((c + 1) + "ª Coordenada X:");
            cordY[c] = Entrada.leiaDouble((c + 1) + "ª Coordenada Y:");
        }

        for (int c = 0; c < 9; c++)
        {
            System.out.println("A distância entre o " + (c + 1) + "º e o " + (c + 2) + "º ponto é : " + (distancia(cordX, cordY, c)));
        }

    }

    public static double distancia(double[] cordX, double[] cordY, int c)
    {
        double distancia = Math.sqrt((Math.pow((cordX[c + 1] - cordX[c]), 2) + (Math.pow((cordY[c + 1] - cordY[c]), 2))));
        return distancia;
    }
}
