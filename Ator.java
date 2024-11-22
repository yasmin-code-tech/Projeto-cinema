import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Ator extends Pessoa {
    private int registro;

    public Ator(String cpf,String nome,String email, int registro){
        super(cpf,nome,email);
        this.registro = registro;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public int getRegistro(){
        return this.registro;
    }
    

    public boolean cadastrar(){
      boolean retorno = false;
      Ator a = this;
      try(
        FileWriter fr = new FileWriter("ator.txt",true);
        BufferedWriter bw = new BufferedWriter(fr)){
            

            // o usuario insere as informações do ator
            Scanner sc = new Scanner(System.in);
            System.out.println("Cadastro do ator");
            System.out.println("Digite o cpf do ator: ");
            String cpf = sc.nextLine();
            System.out.println("Digite o nome do ator: ");
            Stringnome =sc.nextLine();
            System.out.println("Digite o email do ator: ");
            
            // o sistema escreve as informações do ator e confirma o sucesso
            bw.write(this.getCpf()+";"+this.getNome()+";"+this.getEmail()+";"+this.getRegistro());
            bw.newLine();
            System.out.println("Dados do ator gravados com sucesso!");
            retorno = true;
        }catch(IOException e){
            e.printStackTrace();
            retorno = false;
        }
        return retorno;  
    }

    public boolean editar(Ator ator){

    }
    public Ator consultar(Ator ator){

    }
    public ArrayLIst ListarAtor(){
        
    }

}