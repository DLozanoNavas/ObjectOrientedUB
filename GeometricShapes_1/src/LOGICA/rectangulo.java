package LOGICA;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class rectangulo {
     static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

    private int base;
    private int altura;

    public rectangulo () {
    }

    public int getAltura () {
        return altura;
    }

    public void setAltura (int val) {
        this.altura = val;
    }

    public int getBase () {
        return base;
    }

    public void setBase (int val) {
        this.base = val;
    }

    public int areaRectangulo () {
        int res;
        res=base*altura;
        return res;
    }

    public void perimetroRectangulo () {
        int res,num;
        res=2*base+2*altura;
        System.out.println("El perimetro del rectangulo es:"+res);
    }

}

