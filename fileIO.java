import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class fileIO {
    public static void main(String[] args){
        

        
        
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Escrevendo em um arquivo");
            writer.close();

        }catch(IOException e){
            e.printStackTrace();
        }
        String genero = "terror";

        try{
            String[] generos = {"comedia","aventura","ação"};
            BufferedWriter escritor = new BufferedWriter(new FileWriter("genero.txt"));
            escritor.write("o genero escolhido foi: "+ genero);
            escritor.write("\n Aqui é outra linha");

            for(String name:generos){
                escritor.write("\n"+ name);
            }
            escritor.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("genero.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            }catch(IOException e){
                e.printStackTrace();}
        
    
    
    
    
    
    
    }
}
