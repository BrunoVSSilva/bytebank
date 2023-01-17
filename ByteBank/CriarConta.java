import java.sql.SQLOutput;

public class CriarConta {

    public static void main(String[] args){
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;
        primeiraConta.agencia = 15;
        primeiraConta.numero = 0;
        primeiraConta.idade = 20;
        primeiraConta.titular = "Bruno";
        primeiraConta.senha = "0000";

        System.out.println("Olá " + primeiraConta.titular + ", Você tem " + primeiraConta.saldo + " mangos");

        Conta segundaConta = new Conta();

        segundaConta.saldo = 48618.1;
        segundaConta.agencia = 12;
        segundaConta.numero = 0;
        segundaConta.idade = 37;
        segundaConta.titular = "Bruno Vicente";
        segundaConta.senha = "0000";

        System.out.println("A subtração é igual a " + (segundaConta.saldo - primeiraConta.saldo));

        while(primeiraConta.saldo < segundaConta.saldo){
            primeiraConta.saldo++;
            System.out.println(primeiraConta.saldo);
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
