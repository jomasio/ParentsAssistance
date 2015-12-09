package br.com.parentsassistance.PA.Dao;

import java.util.List;

/**
 * Created by Robinson on 09/12/2015.
 */


public interface IDao<T> {

    long salvar(T t);
    int remover(long id);
    List<T> listar();

}
