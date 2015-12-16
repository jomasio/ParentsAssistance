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
import br.com.parentsassistance.PA.Dao.AtividadeExtraescolarDaoScript;

/**
 * Created by Robinson on 16/12/2015.
 */
public class ListaAtividadeExtraescolarActivity extends Activity {
    private ListView lvMostrarTodasAtividadeEscolares;

  /*  @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.Layout.tabAtividadeExtraescolar);

      //  Button cadastraratividade = (Button) findViewById(R.id.cadastraratividade);
        lvMostrarTodasAtividadeEscolares = (ListView) findViewById(R.id.lvMostrarTodosAtividadeEscolares);

        cadastraratividade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(ListaAtividadeExtraescolarActivity.this, CadastrodeAtividadeExtraescolarActivity.class);
                startActivity(it);
            }
        });
    }

    /*@Override
    protected void onResume(){
        super.onResume();

        AtividadeExtraescolarDaoScript dbUser = new AtividadeExtraescolarDaoScript(this);
        List<AtividadeExtraescolar> listaAtividadesextraescolares = dbUser.listar();

        ArrayAdapter<Aluno> adp = new ArrayAdapter<Aluno>(this, android.R.layout.simple_list_item_1, listaAtividadeExtraescolar);

        lvMostrarTodosAtividadeEscolares.setAdapter(adp);

    }
    */
}
