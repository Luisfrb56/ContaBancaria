
package contabancaria;

import java.util.Scanner;



public class ContaBancaria {
//Codifica un programa para xestionar unha conta bancaria. Para iso crea unha clase conta con 3 atributos [nome,numero de conta e saldo(double)].
    //contructores por defecto e con parametros.
    //Metodos de acceso para o numero de conta, metodo para recibir o nome da conta e para mudar o saldo.
    //Metodo, que reciba unha cantidade de cartos, e os ingrese na nosa conta e devolva o saldo final.
    //Metodo que reciba unha cantidade de cartos e os retire da nosa conta e devolvendo o saldo total.(Ainda que non teña cartos na conta o banco mos da e quedaria negativo).
   
    public static void main(String[] args){
        Conta libreta1=new Conta();
        System.out.println(libreta1.toString());
        libreta1.setsaldo(55000);
        libreta1.setnconta("39489811");
        System.out.println(libreta1.toString());
        Conta libreta2= new Conta("Ana","22222",5000);
        libreta2.setnconta("22224");
        System.out.println(libreta2.toString());
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el nombre de la cuenta: ");
        String nome=sc.nextLine();//Para os espacios en branco
        System.out.println("Dime el numero de cuenta: ");
        String nconta=sc.next();
        System.out.println("Dime tu saldo: ");
        double saldo=sc.nextDouble();
        Conta libreta3 = new Conta(nome,nconta,saldo);
        System.out.println("Mis datos son: "+libreta3.toString());
        libreta3.ingresar(3000);
        System.out.println("Ingresamos 3000€= "+libreta3.toString());
        libreta3.retirar(1000);
        System.out.println("Retiramos 1000€= "+libreta3.toString());
  
  
        
    }
    

}