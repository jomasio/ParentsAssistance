package br.com.parentsassistance.PA.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.parentsassistance.R;

public class MainActivity extends AppCompatActivity {
    private Button func;
    private Button aluno;
    private Button Responsavel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void fun(View view) {

        Intent func = new Intent(this, MenudoFuncionario.class);
        startActivity(func);
    }
    public void aluno(View view) {

        Intent aluno = new Intent(this, MenudoResponsavelPeloAluno.class);
        startActivity(aluno);
    }
    public void responsavel(View view) {

        Intent responsavel = new Intent(this, MenudoFuncionario.class);
        startActivity(responsavel);
    }

    }


