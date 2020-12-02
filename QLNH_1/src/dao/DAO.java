/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Administrator
 */
public abstract class DAO<E,K> {
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void delete(K value);
    abstract public List<E> selectAll();
    abstract public E selectById(K key);
    abstract protected void selectBySql(String sql,Object...args);
   
}
