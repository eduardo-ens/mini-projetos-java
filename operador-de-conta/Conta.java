public class Conta {
    private int numero;
    private double limite;
    private double saldo;

    public Conta(){
        numero = 0;
        limite = 0.00;
        saldo = 0.00;
    }

    public Conta(int numero, double limite, double saldo) {
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getDisponivel() {
        return saldo + limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double saqueValor) {
        if(this.saldo + this.limite >= saqueValor) {
            this.saldo -= saqueValor;
        } else {
            System.out.println("Saldo e limite insuficientes");
        }
    }

    public void depositar (double depositoValor) {
        this.saldo += depositoValor;
    }

    @Override
    public String toString() {
        return "Conta [ número: " + numero + ", limite: " + limite + ", saldo: " + saldo + " ]";
    }
}