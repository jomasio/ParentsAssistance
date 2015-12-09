package br.com.parentsassistance.PA.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Robinson on 09/12/2015.
 */
public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String CATEGORIA_DAO = "dao";

    private String[] scriptsSQLCreate;
    private String scriptsSQLDelete;

    public SQLiteHelper(Context context,  String nomeBanco, int versaoBanco, String[] scriptsSQLCreate, String scriptsSQLDelete) {

        super(context, nomeBanco, null, versaoBanco);

        this.scriptsSQLCreate = scriptsSQLCreate;
        this.scriptsSQLDelete = scriptsSQLDelete;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(CATEGORIA_DAO, "Criando banco com sql");
        int qtdeScripts = scriptsSQLCreate.length;
        for (int i = 0; i < qtdeScripts; i++) {
            String sql = scriptsSQLCreate[i];
            Log.i(CATEGORIA_DAO, sql);

            db.execSQL(sql);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(CATEGORIA_DAO, "Atualizando a versão " + oldVersion + " para " + newVersion);
        Log.i(CATEGORIA_DAO, scriptsSQLDelete);
        db.execSQL(scriptsSQLDelete);
        onCreate(db);
    }
}


