package br.com.parentsassistance.PA.util;

import android.widget.EditText;

/**
 * Created by Robinson on 09/12/2015.
 */


public class ValidacaoUtil {


        public static boolean validarCamposVazios(EditText... editTexts) {
            boolean isValido = true;
            for (EditText editText : editTexts) {
                if  (editText.getText().toString().isEmpty()) {
                    isValido = false;
                } else {
                    editText.setError(null);
                }
            }
            return isValido;
        }

        public static boolean validarCampoEmail(EditText Email){
            boolean Valido = true;

            if (!emailValido(Email)) {
                Email.setError("Digite um email Válido");
                Valido = false;
            }
            return Valido;
        }

        private static boolean emailValido(EditText email) {
            boolean Valido = true;
            if(email.getText().toString().contains("@") == true){
                return email.getText().toString().contains(".");
            }
            return Valido = false;
        }

        public static boolean validarCampoSenha(EditText campoSenha){
            boolean Valido = true;

            if (!senhaValida(campoSenha)) {
                campoSenha.setError("Senha curta!");
                Valido = false;
            }
            return Valido;
        }

        //verificação se a senha é maior que 4 digitos
        private static boolean senhaValida(EditText senha) {
            return senha.length() > 4;
        }

        public static boolean validarCpf(EditText campoCpf){
            boolean Valido = true;
            if (!cpfValido(campoCpf)) {
                campoCpf.setError("CPF Inválido");
                Valido = false;
            }
            return Valido;
        }

        //verificação se o CPF contém 11 digitos
        private static boolean cpfValido(EditText cpf) {
            return cpf.length() == 11;
        }

        public static boolean validarCampos(EditText campoEmail, EditText campoSenha) {

            boolean Valido = true;


            if (!emailValido(campoEmail)) {
                campoEmail.setError("Digite um email Válido");
                Valido = false;
            }

            if (!senhaValida(campoSenha)) {
                campoSenha.setError("Senha Curta!");
                Valido = false;
            }

            return Valido;
        }
    }








