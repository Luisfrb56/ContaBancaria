
package contabancaria;


public class Conta {
    private String nome;
    private String nconta;
    private double saldo;
    public Conta(){   
    }  

    public Conta(String nom,String nconta,double saldo){
        nome=nom;
        this.nconta=nconta;
        this.saldo=saldo;
        
    }   
    public void setnconta(String nconta){
        this.nconta=nconta;
        
    }
    
    public String getnome(){
        return nome;
    }
    public void setsaldo(double saldo){
        this.saldo=saldo;
    }
    public double getsaldo(){
        return this.saldo;
       
    }
    public double ingresar(double cantidade){
        saldo=saldo+cantidade;
        return saldo;
    }
    public double retirar(double cantidade){
    saldo=saldo-cantidade;
        return saldo;
         
    }
    @Override
    public String toString(){
        return("nome= "+nome+" numero de conta "+nconta+" saldo "+saldo);
    }

}

