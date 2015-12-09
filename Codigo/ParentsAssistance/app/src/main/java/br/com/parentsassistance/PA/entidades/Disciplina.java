package br.com.parentsassistance.PA.entidades;

/**
 * Created by Robinson on 09/12/2015.
 */
public class Disciplina {

        private long id;
        private String matriculaaluno;
        private String nomealuno;
        private String serie;
        private String disciplina;


        public Disciplina() {
        }

        public Disciplina(long id, String matriculaaluno, String nomealuno, String serie, String disciplina) {
            this.id = id;
            this.matriculaaluno = matriculaaluno;
            this.nomealuno = nomealuno;
            this.serie = serie;
            this.disciplina = disciplina;

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

        public void setSerie(String serie) {
            this.serie = serie;
        }

        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }


}