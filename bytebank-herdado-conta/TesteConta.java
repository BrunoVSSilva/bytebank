public class TesteConta {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 111);

        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(222, 222);

        cc.transfere(01.00, cp);

        System.out.println("Conta corrent: R$" + cc.getSaldo());
    }
}
