package server;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {
    public String operaciones(double n1,double n2,double n3,double n4){
        double producto = n1*n2*n3*n4;
        double suma=n1+n2+n3+n4;
        double promedio=suma/4;
        return "Hola, le producto es: "+producto+"\n" +"La suma es: "+suma+"\n"+"El promedio es: "+promedio;
    }
    public String sumar(double n1, double n2){
        double suma=0;
        for (double i=n1+1; i<n2;i++){
            suma+=i;
        }
        String sumaToString=String.valueOf(suma);
        return "La suma es: "+sumaToString;
    }
    public String ordenar(double n1,double n2,double n3,double n4,double n5){
        double ordenados[]={n1,n2,n3,n4,n5};
        Arrays.sort(ordenados);
        String datos="";
        for (int i=0;i<ordenados.length;i++){
            datos=datos+" "+ordenados[i];
        }
        return "Los datos ordenados son: "+ datos;
    }
}
