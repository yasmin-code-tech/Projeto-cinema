import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int choice1,choice2;
        String order;
        Scanner sc = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1. Filme");
        System.out.println("2. Genero");
        System.out.println("3. Sala");
        System.out.println("4. Sessao");
        
        System.out.println("Escolha uma opção(1-3) ");
        choice1 = sc.nextInt();

        switch(choice1){
            case 1:// filmes
            order="Filme";
            System.out.println("a opção escolhida foi: "+ order);
            System.out.println("Escolha uma ação:");
            System.out.println("1- cadastrar filme");
            System.out.println("2- editar filme");
            System.out.println("3- consultar filme");
            System.out.println("4- listar filme");
            choice2= sc.nextInt();

            switch(choice2){
                case 1:
                    // inserir as informações para cadastrar o filme
                    System.out.println("a opção escolhida foi cadastrar");
                    System.out.println("Digite o titulo do filme");
                    String titulo = sc.next();
                    
                    System.out.println("Digite o id do filme");
                    int idFilme = sc.nextInt();
                    
                    System.out.println("Digite a classificacao do filme: ");
                    int classificacao = sc.nextInt();
                    
                    System.out.println("Digite o status do filme disponivel/indisponivel");
                    String status = sc.next();

                    Filme f = new Filme(idFilme,titulo,classificacao,status);

                    System.out.println(f);

                    break;
                case 2:
                    System.out.println(" a opção escolhida foi editar filme");
                    break;
                case 3:
                    System.out.println("a opção escolhida foi consultar filmes");
                    break;
                case 4:
                    System.out.println("a opção escolhida foi listar os filmes que já existem.");
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }
            break;
            case 2:
            order= "Genero";
            System.out.println("a opção escolhida foi: "+ order);
            case 3:
            order = "Sala";
            System.out.println("a opção escolhida foi: "+ order);
            default:
                System.out.println("Opção invalida");;
        }
        
    }
}
