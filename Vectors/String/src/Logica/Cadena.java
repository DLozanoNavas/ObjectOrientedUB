package Logica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cadena {

    private char letra;
    
    BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in)) ;
    char cade[];

    public Cadena () {
    }

    public char getLetra () {
        return letra;
    }

    public void setLetra (char val) {
        this.letra = val;
    }

    public void capturaDatos () throws IOException {
        String ca; 
        System.out.println("Digite la cadena: \n");
        ca=entrada.readLine().toUpperCase();
        separarCadena(ca);
    }
    public void separarCadena (String ca) {
        cade=new char[ca.length()];
        for(int i=0;i<ca.length();i++){
           setLetra(ca.charAt(i));
           cade[i]=getLetra();
        }
    }
    public void contarVocales () {
        int[] vocal=new int[5];
        for(int i=0;i<cade.length;i++){
           switch((int)cade[i]){
               case 65: vocal[0]=vocal[0]+1;
                       break;
               case 69: vocal[1]=vocal[1]+1; 
                       break;
               case 73: vocal[2]=vocal[2]+1; 
                       break;
               case 79: vocal[3]=vocal[3]+1; 
                       break;
               case 85: vocal[4]=vocal[4]+1; 
                       break;          
           }
        }
        conteoVocal(vocal);
    }
    public void conteoVocal(int vocal[]){
        char[] n=new char[5];
        n[0]='A';
        n[1]='E';
        n[2]='I';
        n[3]='O';
        n[4]='U';
        for(int i=0;i<4;i++){
           if(vocal[i]>0)
              System.out.println(n[i]+"="+vocal[i]);
        }
    }       
            
    public int contarCaracteres () {
        char caracteres[]={'.',',',';','/',':',' ','?','(',')'};
        int[] num=new int[9];
        for(int i=0;i<cade.length;i++){
            for (int a=0;a<caracteres.length;a++){
                 if(cade[i]==caracteres[a]) 
                     num[a]=num[a]+1;
            }         
        }
        for(int i=0;i<8;i++){
           if(num[i]>0)
              System.out.println(caracteres[i]+"="+num[i]);
        }
        return 0;
    }

    public int contarRepetidos () {
        
       // Create  space + Uppercase  array
       int[] repetidos = new int[255];
       ///Loop trough cade string
       for(int i=0;i < cade.length; i++){
               repetidos[(int)cade[i]] = repetidos[(int)cade[i]]+1;                        
       }
       if(cade[0] == ' '){
               repetidos[32] = repetidos[32]-1;
       }
       if(cade[cade.length-1]== ' ' ){
            repetidos[32] = repetidos[32]-1;
       }
       for(int i=0;i<cade.length;i++){              
            System.out.println("\""+ cade[i] + "\"" +" se repite: "+repetidos[(int)cade[i]]+" veces");
       }
       return 0;
    }
       

    public int contarPalabras () {
        // Create  space + Uppercase  array
       int[] repetidos = new int[255];
       ///Loop trough cade string
       for(int i=0;i < cade.length; i++){
               repetidos[(int)cade[i]] = repetidos[(int)cade[i]]+1;        
       }
       if(cade[0] == ' '){
               repetidos[32] = repetidos[32]-1;
       }
       if(cade[cade.length-1]== ' ' ){
               repetidos[32] = repetidos[32]-1;
       }   
               System.out.println("Cantidad de palabras: "+ (repetidos[32]+1)+" palabras");
       return 0;
    }

    public char letraMayor () {
        int[] numMax=new int[cade.length];
        for(int i=0;i<cade.length;i++){
            numMax[i]=((int)cade[i]);
        }
        int numm=0,num2;
        for(int a=0;a<numMax.length;a++){
              num2=numMax[a];
              if(num2>numm) 
                  numm=num2;
        }
        System.out.println("La letra mayor es:"+(char)numm);
        return 0;
    }

    public char letraMenor () {
        int[] numMin=new int[cade.length];
        for(int i=0;i<cade.length;i++){
            numMin[i]=((int)cade[i]);
        }
         int numm,num2;
         numm=numMin[0];
         for(int i=0;i<numMin.length;i++){
              num2=numMin[i];
              if(num2<numm) 
                  numm=num2;
             }
        System.out.println("La letra menor es:"+(char)numm);
        return 0;
        
    }

    public void imprimirCadena () {
          for(int i=0;i<cade.length;i++){
              System.out.println("Posicion ["+i+"] "+cade[i]);
          }
    }
}

