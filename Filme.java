import java.io.*;

public class Filme{
    protected int idFilme;
    protected String titulo;
    protected int classificacao;
    protected Genero genero;
    protected String status;

    public Filme(int idFilme,String titulo, int classificacao,String status ){
        this.idFilme = 0;
        this.titulo = "";
        this.classificacao = 0;
        this.status = "indisponivel";
    }

    public int getIdFilme(){
        return this.idFilme;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public int getClassificacao(){
        return this.classificacao;
    }
    public String  getStatus(){
        return this.status;
    }
    
}