package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import bean.Adresse;

@Repository
public class AdresseDao {
	
	SessionFactory sessionFactory;
	
	AdresseDao(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public void add(Adresse adresse) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(adresse);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
    }
	
	public void deleteById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Adresse a = session.get(Adresse.class, id);
			session.delete(a);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally {
			session.close();
		}
    }
	
	public List<Adresse> findAll() {
		Session session = sessionFactory.openSession();
		try {
			List<Adresse> adresses = session.createQuery("FROM Adresse a").list();
			return adresses;
		}catch (Exception e) {
			return null;
		}finally {
			session.close();			
		}
    }
	
	public Adresse findById(int id) {
		Session session = sessionFactory.openSession();
		try {
			Adresse a = session.get(Adresse.class, id);
			return a;
		} catch (Exception e) {
			return null;
		}finally{
			session.close();
		}
	}
	
	public void removeByAdresse(int id){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Adresse a = session.get(Adresse.class, id);
			session.delete(a);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally{
			session.close();
		}
	}
	
	public void updateAdresse(int id, Adresse adresse) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Adresse a = adresse;
			a.setId(id);
			session.update(a);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally{
			session.close();
		}
	}

}
