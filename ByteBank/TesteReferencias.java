public class TesteReferencias {

    public static void main(String[] args){

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda: " + segundaConta.saldo);
        System.out.println("Saldo da primeira: " + primeiraConta.saldo);

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
