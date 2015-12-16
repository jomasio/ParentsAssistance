package br.com.parentsassistance.PA.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.parentsassistance.PA.Dao.AlunoDaoScript;
import br.com.parentsassistance.PA.entidades.Aluno;
import br.com.parentsassistance.R;

/**
 * Created by Robinson on 25/11/2015.
 */
public class CadastrodeAlunoActivity  extends Activity {

    private String matriculaaluno;
    private String nomealuno;
    private String serie;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
   // private String sessionToken;
    private Button Cadastraraluno;

    private String sessionToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.CadastrodeAluno);

        Cadastraraluno = (Button) findViewById(R.id.cadastraraluno);
       // Cadastraraluno.setOnClickListener(this);

    }

    /*@Override
    public void onClick(View v) {
        criar();
    }

    private void criar() {
        if (Validacao.validarCamposVazios(Cadastraraluno)) {
            Aluno aluno = new Aluno();
            aluno.setMatriculaaluno(matriculaaluno);
            aluno.setEmail(Email.getText().toString());
            aluno.setSenha(senhadoaluno.getText().toString());

            AlunoDaoScript dbUser = new AlunoDaoScript(this);
            dbUser.inserir(aluno);

            Toast.makeText(getApplicationContext(), getResources().getString(R.string.title_activity_cadastraraluno), Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.MenuFuncionario.CadastrodeAlunoActivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/

}
