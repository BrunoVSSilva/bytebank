/* MÉTODO/AÇÃO*/
public class TestaMetodo {
    public static void main (String[] args){

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 150;
        primeiraConta.deposita(50);
        System.out.println(primeiraConta.saldo);

        boolean conseguiuRetirar = primeiraConta.saca(20);
        System.out.println(primeiraConta.saldo);
        System.out.println(conseguiuRetirar);


        Conta contaDaMarcela = new Conta();

        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(500, primeiraConta)){
            System.out.println("Transferencia realizada com sucesso!");
        } else {
            System.out.println("Transferencia negada.");
        }
        System.out.println(primeiraConta.saldo);


    }
}