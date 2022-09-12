package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner scanner= new Scanner(System.in);
        XmlRpcClientConfigImpl config= new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client=new XmlRpcClient();
        client.setConfig(config);
        int opc=1;
        Object numbers[];
        boolean error;
        String toString;
        String response;
        while (opc!=0){
            System.out.println("-----------Selecciona una opción-----------");
            System.out.println("1.-Operaciones");
            System.out.println("2.-Suma de números");
            System.out.println("3.-Ordena 5 numeros");
            String opcString=scanner.nextLine();
            try{
                opc=Integer.parseInt(opcString);
            }catch (Exception e){
                opc=4;
            }
            switch (opc){
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    System.out.println("------Operaciones------");
                    numbers= new Object[4];
                    for (int i=0;i<numbers.length;i++){
                        error=true;
                        if(i==0){
                            System.out.println("Ingresa un número");
                        }else {
                            System.out.println("Ingresa otro número");
                        }
                        toString=scanner.nextLine();
                        while (error!=false){
                            try{
                                numbers[i]=Double.parseDouble(toString);
                                error=false;
                            }catch (Exception e){
                                error=true;
                            }
                            if(error==true){
                                System.out.println("Dato incorrecto intenta nuevamente");
                                toString=scanner.nextLine();
                            }
                        }
                    }
                    response=(String) client.execute("Methods.operaciones",numbers);
                    System.out.println(response);
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    System.out.println("------Suma de números------");
                    numbers= new Object[2];
                    for(int i=0;i<numbers.length;i++){
                        error=true;
                        if(i==0){
                            System.out.println("Ingresa un número");
                        }else {
                            System.out.println("Ingresa otro número");
                        }
                        toString=scanner.nextLine();
                        while (error!=false){
                            try{
                                numbers[i]=Double.parseDouble(toString);
                                error=false;
                            }catch (Exception e){
                                error=true;
                            }
                            if(error==true){
                                System.out.println("Dato incorrecto intenta nuevamente");
                                toString=scanner.nextLine();
                            }
                        }
                    }
                    response = (String) client.execute("Methods.sumar",numbers);
                    System.out.println(response);
                    break;
                case 3:
                    System.out.println("------Ordena 5 numeros------");
                    numbers= new Object[5];
                    for (int i=0;i<numbers.length; i++){
                        error=true;
                        if(i==0){
                            System.out.println("Ingresa un número");
                        }else {
                            System.out.println("Ingresa otro número");
                        }
                        toString=scanner.nextLine();
                        while (error!=false){
                            try{
                                numbers[i]=Double.parseDouble(toString);
                                error=false;
                            }catch (Exception e){
                                error=true;
                            }
                            if(error==true){
                                System.out.println("Dato incorrecto intenta nuevamente");
                                toString=scanner.nextLine();
                            }
                        }
                    }
                    response = (String) client.execute("Methods.ordenar",numbers);
                    System.out.println(response);
                    break;
                default:
                    System.out.println("Esa no es una opción baboso");
                    break;
            }
        }
    }
}
