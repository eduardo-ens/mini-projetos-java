import java.lang.reflect.Array;
import java.util.Scanner;

public class CadastroGeneros {
    public static void main(String[] args) {
       int option, i = 0;

        Scanner scan = new Scanner(System.in);

        Genero[] generos = new Genero[100];
        System.out.println("---------------------");
        System.out.println(" CADASTRO DE GENEROS");

        do {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("Menu");
            System.out.println("Selecione uma opção:");
            System.out.println("<1> Cadastrar genero");
            System.out.println("<2> Exibir registros");
            System.out.println("<3> TESTE1: Cadastrar 100 generos");
            System.out.println("<0> Sair");
            System.out.print("Escolha um opção: "); 

            do {
                while(!scan.hasNextInt()) {
                    System.out.println("Opção Inválida!");
                    scan.next();
                    System.out.print("Escolha um opção novamente: ");
                }

                option = scan.nextInt();

                if(option > 3) {
                    System.out.println("Opção Inválida!");
                    System.out.print("Escolha um opção novamente: ");
                }

            }while(option > 3);
            
            System.out.println("---------------------");

            switch(option) {
                case 1:
                    if(i == 100) {
                        System.out.println("O sistema atingiu o limite de 100 registros");
                        break;
                    } else{
                        generos[i] = new Genero();
                        System.out.println("Digite o código do Genero: "); 
                        int genero = scan.nextInt();
                        generos[i].setCodigo(genero);

                        scan.nextLine();
                        System.out.println("Digite a descrição do Genero: ");
                        String descricao = scan.nextLine();
                        generos[i].setDescricao(descricao);
                        i++;

                        System.out.println();
                        System.out.println("Gênero cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    if(i == 0) {
                        System.out.println("Não há registros para exibir!");
                    } else {
                        System.out.println();
                        System.out.println("Todos os Registros"); 
                        
                        for(int cont = 0; cont < i; cont++) {
                            System.out.println("[" + (cont+1) + "] " + generos[cont]);
                        }
                    }
                    break;
                case 3:
                    int length = Array.getLength(generos);
                    while(i < length) {
                        generos[i] = new Genero();
                        i++;
                    }
                    System.out.println();
                    System.out.println("Todos os registros preenchidos com sucesso!");
                    break;
                case 0:
                    System.out.println("Sistema Encerrado!");
                    break;
            }
        }while(option != 0);
    }
}