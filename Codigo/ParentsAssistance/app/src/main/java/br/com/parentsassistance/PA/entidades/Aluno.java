package br.com.parentsassistance.PA.entidades;

/**
 * Created by Robinson on 09/12/2015.
 */
public class Aluno {
    private long id;
    private String matriculaaluno;
    private String nomealuno;
    private String serie;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;

    public Aluno() {
    }

    public Aluno(long id, String email, String senha, String matriculaaluno, String nomealuno, String serie, String endereco, String telefone) {
        this.id = id;
        this.matriculaaluno = matriculaaluno;
        this.nomealuno = nomealuno;
        this.serie = serie;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarticulaaluno() {
        return matriculaaluno;
    }

    public void setMatriculaaluno(String matriculaaluno) {
        this.matriculaaluno = matriculaaluno;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getSerie() {
        return serie;
    }

    public void setSeriel(String serie) {
        this.serie = serie;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public String toString() {
        return "Email: " + email;
    }

    public static final class aluno {

        public final static String _ID = "id";
        public final static String EMAIL = "email";
        public final static String SENHA = "senha";

        public final static String[] COLUNAS = new String[]{
                _ID, EMAIL, SENHA
        };
    }
}