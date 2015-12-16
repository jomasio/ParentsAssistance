package br.com.parentsassistance.PA.controller;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import br.com.parentsassistance.PA.Dao.AlunoDaoScript;
import br.com.parentsassistance.PA.entidades.Aluno;

/**
 * Created by Robinson on 16/12/2015.
 */
public class ListaAlunosActivity extends Activity {
  /*  private ListView lvMostrarTodosalunos;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);

        Button cadastraraluno = (Button) findViewById(R.id.cadastraraluno);
        lvMostrarTodosalunos = (ListView) findViewById(R.id.lvMostraTodosAlunos);

        cadastraraluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(ListaAlunosActivity.this, CadastrodeAlunoActivity.class);
                startActivity(it);
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();

        AlunoDaoScript dbUser = new AlunoDaoScript(this);
        List<Aluno> listaUsuarios = dbUser.listar();

        ArrayAdapter<Aluno> adp = new ArrayAdapter<Aluno>(this, android.R.layout.simple_list_item_1, listaAlunos);

        lvMostrarTodosalunos.setAdapter(adp);

    }*/
}


