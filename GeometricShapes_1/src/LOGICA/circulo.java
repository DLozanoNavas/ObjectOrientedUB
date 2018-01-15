package LOGICA;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class circulo {
    
    static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));

    private int radio;

    public circulo () {
    }

    public int getRadio () {
        return radio;
    }

    public void setRadio (int val) {
        this.radio = val;
    }

    public float perimetroCirculo () {
        float res;
        res= (float) (2*(3.14)*radio);
        return res;
    }

    public float areaCirculo () {
        float res;
        res=(float) (Math.PI*Math.pow(radio,2));
        return res;
    }

}

