package br.com.parentsassistance.PA.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.parentsassistance.PA.entidades.Aluno;

/**
 * Created by Robinson on 09/12/2015.
 */
public class AlunoDao {


    private static final String CATEGORIA_DAO = "dao";

    protected static final String NOME_BANCO = "db_CadastroAluno";

    protected static final String NOME_TABELA = "Aluno";

    protected static final int VERSAO_BANCO = 1;

    protected SQLiteDatabase db;

    protected AlunoDao(Context context) {
        db = context.openOrCreateDatabase(NOME_BANCO, Context.MODE_PRIVATE, null);
    }

}