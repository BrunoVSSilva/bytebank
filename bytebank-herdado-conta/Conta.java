/* OBJETO*/
public abstract class Conta {

        private double saldo;
        private int agencia;
        private int numero;
        private int idade;
        private Cliente titular;
        private static int total;

        public Conta(int agencia, int numero){
                if(agencia <= 0 || numero <= 0) {
                        System.out.println("Não pode valor menor ou igual a zero");
                } else{
                        Conta.total++;
                        this.agencia = agencia;
                        this.numero = numero;
                }
                // System.out.println("O total é " + Conta.total);
                // System.out.println("Criando uma conta " + this.numero);
        }

        /* MÉTODO/AÇÃO*/

        public void deposita(double valor){
                this.saldo = this.saldo + valor;
        }

        public boolean saca(double valor){
                if(this.saldo >= valor){
                        this.saldo = this.saldo - valor;
                        return true;
                }
                else{
                        return false;
                }
        }

        public boolean transfere(double valor, Conta destino){
                if (this.saca(valor)){
                        destino.deposita(valor);
                        return true;
                }
                return false;
        }

        public double getSaldo(){
                return this.saldo;
        }
        public int getNumero(){
                return this.numero;
        }

        public int getAgencia(){
                return this.agencia;
        }

        public Cliente getTitular() {
                return titular;
        }

        public void setTitular(Cliente titular) {
                this.titular = titular;
        }

        public static int getTotal() {
                return Conta.total;
        }
}