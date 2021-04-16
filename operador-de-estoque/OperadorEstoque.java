import java.util.Scanner;

public class OperadorEstoque {
    public static void main (String[] args) {
        int option;

        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println(" OPERADOR DE ESTOQUE ");
        System.out.println("---------------------");
       
        Produto produto = new Produto();
        System.out.print("Digite o código do produto: ");
        int codigo = scan.nextInt();
        produto.setCodigo(codigo);

        scan.nextLine();

        System.out.print("Digite a descrição do produto: ");
        String descricao = scan.nextLine();
        produto.setDescricao(descricao);

        System.out.print("Digite o preço do produto: ");
        double preco = scan.nextDouble();
        produto.setPreço(preco);

        do {
            System.out.println("---------------------------------------");
            System.out.println("MENU");
            System.out.println("Selecione uma opção: ");
            System.out.println("<1> Registrar Entrada");
            System.out.println("<2> Registrar Saída");
            System.out.println("<3> Ver quantidade em Estoque");
            System.out.println("<4> Exibir todas informações do produto");
            System.out.println("<0> Sair do Sistema");
            System.out.print("Escolha uma opção: ");
            option = scan.nextInt();
            System.out.println("---------------------------------------");

            switch (option){
                case 1:
                    System.out.print("Digite a quantidade de entrada: ");
                    int qtdIn = scan.nextInt();
                    produto.registrarEntrada(qtdIn);
                    break;
                case 2:
                    System.out.print("Digite a quantidade de saída: ");
                    int qtdOut = scan.nextInt();
                    produto.registrarSaida(qtdOut);
                    break;
                case 3:
                    System.out.println(Produto.qtdeEstoque);
                    break;
                case 4:
                    System.out.println(produto);
                    break;
                
                case 0: 
                    System.out.println("Sistema Encerrado!");
                    break;
            }

    }while(option != 0);

   }
}
