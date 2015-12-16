package br.com.parentsassistance.PA.entidades;

/**
 * Created by Robinson on 09/12/2015.
 */
public class ResponsavelPeloAluno {
        private long id;
        private String matriculaaluno;
        private String nomeResponsavel;
        private String cpf;
        private String telefone;
        private String email;
        private String senha;

        public ResponsavelPeloAluno() {
        }

        public ResponsavelPeloAluno(long id, String matriculaaluno, String nomeResponsavel, String cpf, String telefone, String email, String senha) {
            this.id = id;
            this.matriculaaluno = matriculaaluno;
            this.nomeResponsavel = nomeResponsavel;
            this.cpf = cpf;
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

        public String getNomeResponsavel() {
            return nomeResponsavel;
        }

        public void setNomeResponsavel(String nomeResponsavel) {
            this.nomeResponsavel = nomeResponsavel;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
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

        public  final class responsavelPeloaluno {

            public final static String _ID = "id";
            public final static String EMAIL = "email";
            public final static String SENHA = "senha";

            public final String[] COLUNAS = new String[]{
                    _ID, EMAIL, SENHA
            };
        }

    }

