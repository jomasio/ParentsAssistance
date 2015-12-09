package br.com.parentsassistance.PA.Dao;

import android.content.Context;

/**
 * Created by Robinson on 09/12/2015.
 */
public class AlunoDaoScript {
    private static final String SCRIPT_DATABASE_DELETE = "DROP TABLE IF EXISTS alunos";

    private static final String[] SCRIPT_DATABASE_CREATE = new String[] {
            "create table alunos (id integer primary key autoincrement,"
                    + "matricula text not null, nome text not null"
                    + " serie text not null,telefone text not null, endereco text not null);"
    };
   

}
