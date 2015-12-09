package br.com.parentsassistance.PA.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import br.com.parentsassistance.R;

/**
 * Created by Robinson on 25/11/2015.
 */
public class CadastrodeAlunoActivity  extends Activity {


    private Button Cadastraraluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.CadastrodeAluno);
        //codigo para criar ação para o botão e chamar tela
        Cadastraraluno = (Button) findViewById(R.id.cadastraraluno);


    }
}