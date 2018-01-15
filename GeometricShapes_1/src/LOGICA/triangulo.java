package LOGICA;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class triangulo {
    
    static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

    private int lado;
    private int altura;

    public triangulo () {
    }

    public int getAltura () {
        return altura;
    }

    public void setAltura (int val) {
        this.altura = val;
    }

    public int getLado () {
        return lado;
    }

    public void setLado (int val) {
        this.lado = val;
    }

    public void perimetroTriangulo () {
        int res,num;
        res=2*altura+lado;
        System.out.println("El perimetro del triangulo es:"+res);
    }

    public int areaTriangulo () {
        int res;
        res=(lado*altura)/2;
        return res;
        
        
    }

}

