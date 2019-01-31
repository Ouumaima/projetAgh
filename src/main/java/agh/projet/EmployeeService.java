package agh.projet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employee;
	
	List<EmployeeBean> findById(String firstName){
		return null;
	}
	
		
		
		
	}
	

