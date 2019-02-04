package agh.projet.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agh.projet.bean.EmployeeBean;
import agh.projet.dao.EmployeeDao;

@Service("employeeService")
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employee ;
	

	public ArrayList<EmployeeBean> findAll(){
		 return employee.getEmployee();
	}
	
	public ArrayList<EmployeeBean> findById(int id){
		 return employee.getEmployeeById(id);
	}
		
	public ArrayList<EmployeeBean> findByFirstName(String firstName){
		 return employee.getEmployeeByFirstName(firstName);
	}
	public void save(EmployeeBean e){
		 employee.save(e);
	}
	}
	

