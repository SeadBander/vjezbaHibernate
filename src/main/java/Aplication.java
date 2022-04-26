import hibernate.HibernateUtil;
import model.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;

import java.math.BigDecimal;
import java.util.List;

public class Aplication {
    public static void main(String[] args) {
            /*Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.createQuery("from Product p where p .name like 'Sweet%'").list().forEach(System.out::println);
            transaction.commit();*/

//        Product product = new Product();
//        product.setName("Ćevapi sa lukom");
//        product.setQuantityInStock(100);
//        product.setUnitPrice(BigDecimal.TEN);
//        product.save();

        Product product = Product.retrieve(11);
        product.setName("Ćevapi bez luka");
        product.update();
    }
}
