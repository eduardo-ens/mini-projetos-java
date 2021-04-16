import java.util.Scanner;

public class OperadorConta {
    public static void main (String[] args) {
        int option = 0;
        Scanner scan = new Scanner(System.in);

        Conta conta1 = new Conta(25689, 1500.50, 3025.99);

        System.out.println("---------------------------------------");
        System.out.println("            OPERADOR CONTA             ");
       
        do {
            System.out.println("---------------------------------------");
            System.out.println("MENU");
            System.out.println("Selecione um opção: ");
            System.out.println("<1> Ver número da conta");
            System.out.println("<2> Ver saldo");
            System.out.println("<3> Ver limite");
            System.out.println("<4> Ver qtde disponivel");
            System.out.println("<5> Registrar novo limite");
            System.out.println("<6> Sacar");
            System.out.println("<7> Depositar");
            System.out.println("<8> Ver todas informações a conta");
            System.out.println("<0> Sair");
            System.out.print("Escolha uma opção: ");
            do {
                while(!scan.hasNextInt()) {
                    System.out.println("Opção Inválida!");
                    scan.next();
                    System.out.print("Escolha uma opção novamente: ");               
                }

                option = scan.nextInt();
                
                if(option > 8) {
                    System.out.println("Opção Inválida!");
                    System.out.print("Digite novamente uma opcao: ");
                }
                
            }while(option > 8);
            
            System.out.println("---------------------------------------");
            
            switch(option) {
                case 1:
                    System.out.println("Número da conta: " + conta1.getNumero());
                    break;
                case 2:
                    System.out.println("Saldo da conta: " + conta1.getSaldo());
                    break;
                case 3:
                    System.out.println("Saldo da conta: " + conta1.getLimite());
                    break;
                case 4:
                    System.out.println("Disponível: " + conta1.getDisponivel());
                    break;
                case 5:
                    System.out.print("Digite o novo limite: ");
                    double limite = scan.nextDouble();
                    conta1.setLimite(limite);
                    break;
                case 6:
                    System.out.print("Digite o valor do saque: ");
                    double saqueValor = scan.nextDouble();
                    conta1.sacar(saqueValor);
                    break;
                case 7:
                    System.out.print("Digite o valor do deposito: ");
                    double depositoValor = scan.nextDouble();
                    conta1.depositar(depositoValor);
                    break;
                case 8:
                    System.out.println(conta1);
                    break;
                case 0:
                System.out.println("Sistema Encerrado!");
            }
        }while(option != 0);
    }
}