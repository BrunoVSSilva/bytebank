public class Diretor extends Funcionario{
    private int senha;

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        }
        return false;
    }

    public double getBonificacao() {
        return super.getSalario() * 1.5;
    }
}
