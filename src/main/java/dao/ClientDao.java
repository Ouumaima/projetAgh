package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import bean.Client;

@Repository
public class ClientDao {

	SessionFactory sessionFactory;
	
	ClientDao(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public List<Client> findAll() {
		Session session = sessionFactory.openSession();
		try {
			List<Client> clients = session.createQuery("FROM Client c").list();
			return clients;
		}catch (Exception e) {
			return null;
		}finally {
			session.close();			
		}
	}
	
	public void add(Client client) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(client);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
    }
	
	public void removeById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Client c = session.get(Client.class, id);
			session.delete(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
    }
	
	public Client findById(int id) {
		Session session = sessionFactory.openSession();
		try {
			Client c = session.get(Client.class, id);
			return c;
		} catch (Exception e) {
			return null;
		}finally{
			session.close();
		}
	}

	public void updateClient(int id, Client client) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Client c = client;
			c.setId(id);
			session.update(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally{
			session.close();
		}
	}
	
}
