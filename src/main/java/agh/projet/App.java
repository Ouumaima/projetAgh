package agh.projet;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import agh.projet.bean.AdressBean;
import agh.projet.bean.ClientBean;
import agh.projet.bean.EmployeeBean;
import agh.projet.service.AdresseService;
import agh.projet.service.ClientService;
import agh.projet.service.EmployeeService;

@Component
public class App 
{
	static EmployeeService employeeService ;
	static ClientService clientService; 
	static AdresseService adresseService;
	@Autowired
	public App(EmployeeService employeeService, ClientService clientService, AdresseService adresseService ){
		App.employeeService = employeeService;
		App.clientService = clientService;
		App.adresseService = adresseService;
	}
	
	
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext("agh.projet");
    	AdressBean a1 = new AdressBean("12 rue moliere", "chez robert", "Montrouge", "92120");
    	AdressBean a2 = new AdressBean("50 place jules Ferry", "chez louis", "Montrouge", "92120");
    	AdressBean a3 = new AdressBean("6 rue boetie", "", "Montrouge", "92120");
    	
    	adresseService.save(a1);
    	adresseService.save(a2);
    	adresseService.save(a3);
    	
    	ClientBean c1 = new ClientBean(1, 11, "SG",a1);
    	ClientBean c2 = new ClientBean(2, 22, "BNP",a2);
    	ClientBean c3 = new ClientBean(3, 01, "CNP",a3);
    	
    	clientService.save(c1);
    	clientService.save(c2);
    	clientService.save(c3);
    	
    	ArrayList<ClientBean> listClient = clientService.findAll();
    	
    	EmployeeBean e1 = new EmployeeBean(1, "toto", "bobo", null, listClient,"developper");
        EmployeeBean e2 = new EmployeeBean(2, "titi", "bibi", null,listClient, "team leader");
        EmployeeBean e3 = new EmployeeBean(3, "tata", "baba", null,listClient, "stagiaire");
        
        employeeService.save(e1);
        employeeService.save(e2);
        employeeService.save(e3);
        
    	ArrayList<EmployeeBean> listEmployee = employeeService.findAll();
    	for (EmployeeBean e : listEmployee){
    		System.out.println("Employee " + e.getFirstName());
    		for (ClientBean c : e.getClients())
    			System.out.println("	Client " + c.getName()+ " " + c.getAdress().getAdress());
    	}
    }

}
