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
public class MarcadorDAO extends AbstractDAO<Marcador>{
    protected SessionFactory sessionFactory;
    
    protected MarcadorDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    protected void save(Marcador obj){
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
    
    protected void update(Marcador obj){
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
    
    
    protected void delete(Marcador obj){
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
    
    protected Marcador find(Class clazz, int id){
        Marcador obj = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            obj = (Marcador)session.get(clazz, id);
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
    
    
    protected List<Marcador> findAll(Class clazz){
        List<Marcador> obj = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From" + clazz;
            Query query = session.createQuery(hql);
            obj = (List<Marcador>)query.list();
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
