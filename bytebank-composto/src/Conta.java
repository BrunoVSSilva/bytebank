/* OBJETO*/
public class Conta {

        double saldo;
        int agencia;
        int numero;
        int idade;
        String titular;
        String senha;

        /* MÉTODO/AÇÃO*/

        void deposita(double valor){
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
                if (saldo >= valor) {
                        this.saldo -= valor;
                        destino.deposita(valor);
                        return true;
                } else {
                        return false;
                }
        }

}