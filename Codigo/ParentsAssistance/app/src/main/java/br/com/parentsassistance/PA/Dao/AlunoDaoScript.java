package br.com.parentsassistance.PA.Dao;

import android.content.Context;
import android.os.NetworkOnMainThreadException;


/**
 * Created by Robinson on 09/12/2015.
 */
public class AlunoDaoScript {

    private static final String SCRIPT_DATABASE_DELETE = "DROP TABLE IF EXISTS ALUNOS";

    private static final String[] SCRIPT_DATABASE_CREATE = new String[] {
            "create table if not exists alunos (id integer primary key autoincrement, "
                    + "email text not null, senha text not null);"
    };
    /*private SQLiteHelper dbHelper;

    public AlunoDaoScript(Context ctx) {
        dbHelper = new SQLiteHelper(ctx,"db_CadastroAluno", "Aluno", SCRIPT_DATABASE_CREATE, SCRIPT_DATABASE_DELETE);
        db = dbHelper.getWritableDatabase();
    }
*/

}
