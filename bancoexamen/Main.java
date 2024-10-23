package bancoexamen;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
      Scanner input=new Scanner(System.in);

      ArrayList<CuentaAhorro> cuentas=new ArrayList<>();


      System.out.println("Ahorro");
      cerrar:
      while(true){
        CuentaAhorro cuenta=new CuentaAhorro();
        System.out.print("Ingrese el titular de la cuenta a crear:");
        cuenta.setTitular(input.next());
        System.out.print("Ingrese el saldo inicial:");
        cuenta.setSaldoInicial(input.nextDouble());
        System.out.print("Ingrese el interes con el que contara la cuenta(1-100):");
        cuenta.setInteres((input.nextInt()/100.0));
        while(true){
          System.out.println("Ingrese 0.- para seguir, 1.-Para calcular el interes, 2.-Para mostrar el saldo actualizado");
          int calculo=input.nextInt();
          if(calculo<0||calculo>2){System.out.println("Opcion invalida intente de nuevo");continue;}
          if(calculo==0)break;
          if(calculo==1){System.out.printf("El interes mensual es de: %s\n",cuenta.calculoInteresMensual());continue;}
          cuenta.calculoSaldoMensual();
          System.out.println(cuenta.getSaldo());
        } 
        cuentas.add(cuenta);
        while(true){
          System.out.println("Ingresa 0 para salir, 1 para seguir ingresando cuentas y 2 para mostrar los datos");
          int opcion=input.nextInt();
          if(opcion<0||opcion>2){System.out.println("Opcion invalida intente de nuevo");continue;}
          if(opcion==1)break;
          if(opcion==2){ 
          System.out.println(cuentas.size());
          for(int i=0;i<cuentas.size();i++){
            
            System.out.println(cuentas.get(i).getDetalles());
            }
          }
          if(opcion==0)break cerrar;
        }
      }
  }
}