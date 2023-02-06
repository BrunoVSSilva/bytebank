public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario bruno = new EditorVideo();

        bruno.setNome("Bruno Vicente");
        bruno.setCpf("43930067805");
        bruno.setSalario(1212.00);

        System.out.println(bruno.getNome());
        System.out.println(bruno.getBonificacao());

    }
}
