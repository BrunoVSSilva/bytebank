public class ControleBonificacao {

    private double soma;

    public void regristra(Funcionario g){
        double boni = g.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma(){
        return soma;
    }
}