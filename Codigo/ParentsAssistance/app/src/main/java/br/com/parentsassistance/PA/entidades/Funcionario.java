package br.com.parentsassistance.PA.entidades;

/**
 * Created by Robinson on 09/12/2015.
 */
public class Funcionario {

        private long id;
        private String matriculafuncionario;
        private String nomefuncionario;
        private String cpf;
        private String funcao;
        private String setor;
        private String email;
        private String senha;

        public Funcionario() {
        }

        public Funcionario(long id, String matriculafuncionario, String nomefuncionario, String cpf, String funcao, String setor, String email, String senha) {
            this.id = id;
            this.matriculafuncionario = matriculafuncionario;
            this.nomefuncionario = nomefuncionario;
            this.cpf = cpf;
            this.funcao = funcao;
            this.setor = setor;
            this.email = email;
            this.senha = senha;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getMarticulafuncionario() {
            return matriculafuncionario;
        }

        public void setMatriculafuncionario(String matriculafuncionario) {
            this.matriculafuncionario = matriculafuncionario;
        }

        public String getNomefuncionario() {
            return nomefuncionario;
        }

        public void setNomefuncionario(String nomefuncionario) {
            this.nomefuncionario = nomefuncionario;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getFuncao() {
            return funcao;
        }

        public void setFuncao(String funcao) {
            this.funcao = funcao;
        }

        public String getSetor() {
            return setor;
        }

        public void setSetor(String setor) {
            this.setor = setor;
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

        public  final class funcionario {

            public final static String _ID = "id";
            public final static String EMAIL = "email";
            public final static String SENHA = "senha";

            public final String[] COLUNAS = new String[]{
                    _ID, EMAIL, SENHA
            };
        }

    }
