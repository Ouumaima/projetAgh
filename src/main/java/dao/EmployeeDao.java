package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import bean.Employee;

@Repository
public class EmployeeDao {

	SessionFactory sessionFactory;
	EmployeeDao(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public List<Employee> findAll() {
		Session session = sessionFactory.openSession();
		try {
			List<Employee> employees = session.createQuery("FROM Employee e").list();
			return employees;
		}catch (Exception e) {
			return null;
		}finally {
			session.close();			
		}
	}

	public Employee findById(int id) {
		Session session = sessionFactory.openSession();
		try {
			Employee e = session.get(Employee.class, id);
			return e;
		} catch (Exception e) {
			return null;
		}finally{
			session.close();
		}
	}

	public void add(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(employee);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	public Employee updateEmployee(int id, Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Employee e = employee;
			e.setId(id);
			session.update(e);
			tx.commit();
			return e;
		} catch (Exception e) {
			tx.rollback();
			return null;
		}
	}

	public void deleteEmployeeById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Employee e = session.get(Employee.class, id);
			session.delete(e);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally{
			session.close();
		}
	}

}
