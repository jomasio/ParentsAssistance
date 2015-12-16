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
public class AlunoDao implements IDao<Aluno>{


    private static final String CATEGORIA_DAO = "dao";

    protected static final String NOME_BANCO = "db_CadastroAluno";

    protected static final String NOME_TABELA = "Aluno";

    protected static final int VERSAO_BANCO = 1;

    protected SQLiteDatabase db;

    protected AlunoDao(Context context) {
        db = context.openOrCreateDatabase(NOME_BANCO, Context.MODE_PRIVATE, null,null);
    }


    protected AlunoDao() {
        //apenas para subclasse
    }

    public long salvar(Aluno aluno) {
        long resultado = 0;

        if (aluno.getId() != 0) { // met já existe
            resultado = atualizar(aluno);
        } else {
            resultado = inserir(aluno); // usuario novo
        }

        return resultado;
    }

    public long inserir(Aluno aluno) {
        ContentValues values = getContentValues(aluno);

        long id = inserir(values);
        return id;
    }

    @NonNull
    private ContentValues getContentValues(Aluno aluno) {
        ContentValues values = new ContentValues();

        values.put(Aluno.Alunos.EMAIL, aluno.getEmail());
        values.put(Aluno.Alunos.SENHA, aluno.getSenha());

        return values;
    }

    public long inserir(ContentValues valores) {
        return db.insert(NOME_TABELA, "", valores);
    }

    public int atualizar(Aluno aluno) {
        ContentValues values = getContentValues(aluno);

        String id = String.valueOf(aluno.getId());
        String where = Aluno.Alunos._ID + "=?"; //were define qual esspecifico para alterar
        String[] whereArgs = new String[] { id } ;

        int count = atualizar(values, where, whereArgs);

        return count;
    }

    public int atualizar(ContentValues valores, String where, String[] whereArgs) {
        int count = db.update(NOME_TABELA, valores, where, whereArgs);
        Log.i(CATEGORIA_DAO, "Atualizou " + count + " registros");
        return count;
    }



    public int remover(long id) {
     String where = Aluno.Alunos._ID + "=?";
        String _id = String.valueOf(id);
        String[] whereArgs = new String[] { _id } ;

        int count = remover(where, whereArgs);

        return count;
    }

    public int remover(String where, String[] whereArgs) {
        int count = db.delete(NOME_TABELA, where, whereArgs);
        Log.i(CATEGORIA_DAO, "removidos " + count + " registros");
        return count;
    }

    public Cursor getCursor() {
        try {
            return db.query(NOME_TABELA,Aluno.Alunos.COLUNAS, null, null, null, null, null, null);
        } catch (SQLException ex) {
            Log.e(CATEGORIA_DAO, "Erro ao buscar os alunos: " + ex.toString());
            return null;
        }
    }

    public List<Aluno> listar() {
        Cursor cursor = getCursor();
        List<Aluno> alunos = new ArrayList<Aluno>();

        if (cursor.moveToFirst()) {
            do {
                Aluno aluno = getAluno(cursor);
                alunos.add(aluno);
            } while (cursor.moveToNext());
        }

        return alunos;
    }

    public Aluno buscarPorEmail(String email) {
        Aluno aluno = null;
        try {
            Cursor cursor = db.query(NOME_TABELA, Aluno.Alunos.COLUNAS, Aluno.Alunos.EMAIL + "='" + email + "'", null, null, null, null);

            if (cursor.moveToNext()) {
                aluno = getAluno(cursor);
            }
        } catch(Exception ex) {
            Log.e(CATEGORIA_DAO, "Erro ao buscar o Aluno pelo email " + ex.toString());
        }

        return aluno;
    }

    private Aluno getAluno(Cursor cursor) {
        int idxId = cursor.getColumnIndex(Aluno.Alunos._ID);
        int idxEmail = cursor.getColumnIndex(Aluno.Alunos.EMAIL);
        int idxSenha = cursor.getColumnIndex(Aluno.Alunos.SENHA);

        Aluno aluno = new Aluno();

        aluno.setId(cursor.getLong(idxId));
        aluno.setEmail(cursor.getString(idxEmail));
        aluno.setSenha(cursor.getString(idxSenha));

        return aluno;
    }
}