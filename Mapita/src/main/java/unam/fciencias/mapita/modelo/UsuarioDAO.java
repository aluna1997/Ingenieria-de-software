/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.fciencias.mapita.modelo;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author default
 */
public class UsuarioDAO extends AbstractDAO<Usuario> {
    protected SessionFactory sessionFactory;
    
    protected UsuarioDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    protected void save(Usuario obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(obj);
            tx.commit();
       }catch(HibernateException e){
          if(tx != null){
              tx.rollback();
          }
          e.printStackTrace();
       }finally{
          session.close();
        }
    }
    
    protected void update(Usuario obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.update(obj);
            tx.commit();
       }catch(HibernateException e){
          if(tx != null){
              tx.rollback();
          }
          e.printStackTrace();
       }finally{
          session.close();
        }
        
    }
    
    protected void delete(Usuario obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.delete(obj);
            tx.commit();
       }catch(HibernateException e){
          if(tx != null){
              tx.rollback();
          }
          e.printStackTrace();
       }finally{
          session.close();
        }
    }
    
    protected Usuario find(Class clazz, int id){
        Usuario obj = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            obj = (Usuario)session.get(clazz, id);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null){
                tx.rollback();
            }     
        }finally{
            session.close();
        }
        return obj;
    }
    
    
    protected List<Usuario> findAll(Class clazz){
        List<Usuario> obj = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From" + clazz;
            Query query = session.createQuery(hql);
            obj = (List<Usuario>)query.list();
            tx.commit();
        }catch(HibernateException e){
            if(tx != null){
                tx.rollback();
            }     
        }finally{
            session.close();
        }
        return obj;
    }
    
    
}
