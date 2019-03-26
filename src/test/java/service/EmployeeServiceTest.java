package service;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import bean.Adresse;
import bean.Client;
import bean.Employee;
import services.EmployeeService;
import dao.EmployeeDao;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

	@Mock
	EmployeeDao employeeDao;

	@InjectMocks
	EmployeeService employeeService = new EmployeeService(employeeDao);
	
	private List<Employee> employeesExpected = new ArrayList<>();

	@Before
	public void setUp() throws Exception {
		// given
		Adresse adresse1 = new Adresse(1, "12 rue moliere", "chez oumaima","montrouge", "92120");
		Adresse adresse2 = new Adresse(2, "50 places jules ferry","chez ahmed", "montrouge", "92120");
		Client client1 = new Client(1, 12, "Société générale", adresse1);
		Client client2 = new Client(2, 22, "Bnp Paribas", adresse2);
		List<Client> clients = new ArrayList<>();
		clients.add(client1);
		clients.add(client2);
		employeesExpected.add(new Employee(1, "oumaima", "ben arab", clients,"developer"));
		employeesExpected.add(new Employee(2, "ahmed", "belguith", clients,"team leader"));
	}

	@Test
	public void testGetAllEmployees() {
		
		when(employeeDao.findAll()).thenReturn(employeesExpected);
		// when
		List<Employee> employeesResults = employeeService.getAll();

		// then
		Assertions.assertThat(employeesExpected.get(0)).isEqualTo(employeesResults.get(0));
		Assertions.assertThat(employeesExpected.get(1)).isEqualTo(employeesResults.get(1));

	}

	@Test
	public void testGetById() {
		
		when(employeeDao.findById(1)).thenReturn(employeesExpected.get(0));
		
		// when
		Employee employeeResults = employeeService.getById(1);

		// then
		Assertions.assertThat(employeesExpected.get(0)).isEqualTo(employeeResults);

	}
	
}
