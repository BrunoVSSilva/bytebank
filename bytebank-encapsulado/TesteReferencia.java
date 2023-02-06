public class TesteReferencia {

    public static void main(String[] args) {

        Funcionario g1 = new Gerente();

        g1.setNome("Bruno");
        g1.setSalario(5000.0);

        Funcionario f1 = new Diretor();
        f1.setNome("lero lero");
        f1.setSalario(2000);



        ControleBonificacao controle = new ControleBonificacao();
        controle.regristra(g1);
        controle.regristra(f1);

        System.out.println(controle.getSoma());
    }
}