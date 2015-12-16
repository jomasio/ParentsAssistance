package br.com.parentsassistance.PA.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import br.com.parentsassistance.PA.Dao.AlunoDaoScript;
import br.com.parentsassistance.PA.entidades.Aluno;
import br.com.parentsassistance.PA.util.ValidacaoUtil;
import br.com.parentsassistance.R;

/**
 * Created by Robinson on 25/11/2015.
 */
public class LogindoAlunoActivity extends Activity  {

    private final int REQ_SIGNUP = 1;

    private Button logaraluno;
    private TextView logindoaluno;
    private TextView senhadoaluno;
    private EditText email;
    private EditText aluno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.LogindoAluno);
    }
     /*   initFields();
        initCallbacks();

    }
    }
    @Override
    public void onBackPressed() {
        finish();
    }

    private void initCallbacks() {
        logaraluno.setOnClickListener(this);
    }

    private void initFields() {
        logaraluno = (Button) findViewById(R.id.logindoaluno);
        email = (AutoCompleteTextView) findViewById(R.id.email);
        aluno= (EditText) findViewById(R.id.senhadoaluno);


    }
*/
 /*  @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.logindoaluno):
                entrar();
                break;

        }
    }
    private void primeiroAcesso() {
        Intent intent = new Intent(LogindoAlunoActivity.this, MenudoResponsavelPeloAluno.class);
        startActivityForResult(intent, REQ_SIGNUP);
    }

   private void entrar() {
        if (!!Validacao.validarCampos(email, senhadoaluno)) {
            String emailBusca = email.getText().toString();
            String senhaBusca = senhadoaluno.getText().toString();
            AlunoDaoScript dbUser = new AlunoDaoScript(this);
            Aluno aluno = dbUser.buscarPorEmail(emailBusca);
            String loginResult = "Logado";

            if(aluno != null && aluno.getSenha().equalsIgnoreCase(senhaBusca)) {
                getIntent().putExtra(MenudoResponsavelPeloAluno.ARG_TOKEN, loginResult);
                setResult(Activity.RESULT_OK);
                finish();

                Intent intentEntrar = new Intent(LogindoAlunoActivity.this, MenudoResponsavelPeloAluno.class);
                startActivity(intentEntrar);
            }
            else{
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.userErroAcesso), Toast.LENGTH_SHORT).show();
            }
        }
    }*/

}



