import java.util.*;
import java.*;

public class App {
    public static void main(String[] args) throws Exception {
        int choice;
        String order;
        Scanner sc = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1. Filme");
        System.out.println("2. Genero");
        System.out.println("3. Sala");

        System.out.println("Escolha uma opção(1-3) ");
        choice = sc.nextInt();

        switch(choice){
            case 1:
            order="Filme";
            break;
            case 2:
            order= "Genero";
            case 3:
            order = "Sala";
            default:
                System.out.println("Opção invalida");;
        }
        
    }
}
