package model;

import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ActiveProduct {

    public void save(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(getThis());
        transaction.commit();
    }

    public void update(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(getThis());
        transaction.commit();
    }
    public Product getThis(){
        return (Product) this;
    }

    public static Product retrieve (Integer productId){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = (Product) session.load(Product.class, productId);
        return product;
    }
}
