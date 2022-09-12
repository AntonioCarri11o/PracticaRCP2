import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        double numbers[]= new double[5];
        double ordenados[]= new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<numbers.length;i++){
            System.out.println("Ingresa un número");
            numbers[i]=scanner.nextDouble();
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]<numbers[i]){
                    ordenados[i]=numbers[j];
                }
            }
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(ordenados[i]);
        }
    }
}
