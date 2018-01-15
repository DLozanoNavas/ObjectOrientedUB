package LOGICA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class cuadrado {
    
    static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    private int lado;

    public cuadrado () {
    }

    public int getLado () {
        return lado;
    }

    public void setLado (int val) {
        this.lado = val;
    }

    public int areaCuadrado ()  {
        int res;
        res=lado*lado;
        return res;
    }

    public void perimetroCuadrado () {
        int res,num;
        res=4*lado;
        System.out.println("El perimetro del cuadrado es:"+res);
               
    }

}

