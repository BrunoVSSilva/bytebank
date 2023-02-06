public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Guilherme");
        g1.setCpf("54615574351");
        g1.setSalario(5258.00);
        g1.setSenha(2222);

        boolean autenticou = g1.autentica(2222);
        System.out.println(autenticou);

        System.out.println("Ganhou R$" + g1.getBonificacao() + " de bonificação");
    }
}