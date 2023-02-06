public class Gerente extends Funcionario {

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println("A senha está correta");
            return true;
        }
        return false;
    }

    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario();
    }
}
