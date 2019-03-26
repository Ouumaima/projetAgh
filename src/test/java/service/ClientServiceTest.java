package service;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import services.ClientService;
import bean.Adresse;
import bean.Client;
import dao.ClientDao;

@RunWith(MockitoJUnitRunner.class)
public class ClientServiceTest {
	
	@Mock
	ClientDao clientDao;

	@InjectMocks
	ClientService clientService = new ClientService(clientDao);
	
	private List<Client> clientsExpected = new ArrayList<>();

	@Before
	public void setUp() throws Exception {
		// given
		Adresse adresse1 = new Adresse(1, "12 rue moliere", "chez oumaima","montrouge", "92120");
		Adresse adresse2 = new Adresse(2, "50 places jules ferry","chez ahmed", "montrouge", "92120");
		clientsExpected.add(new Client(1, 12, "Société générale", adresse1));
		clientsExpected.add(new Client(2, 22, "Bnp Paribas", adresse2));
	}

	@Test
	public void testGetAllClients() {

		// when
		when(clientDao.findAll()).thenReturn(clientsExpected);
		List<Client> clientsResults = clientService.getAll();

		// then
		Assertions.assertThat(clientsExpected.get(0)).isEqualTo(clientsResults.get(0));
		Assertions.assertThat(clientsExpected.get(1)).isEqualTo(clientsResults.get(1));

	}

	@Test
	public void testGetById() {
		
		when(clientDao.findById(1)).thenReturn(clientsExpected.get(0));
		
		// when
		Client clientResults = clientService.getById(1);

		// then
		Assertions.assertThat(clientsExpected.get(0)).isEqualTo(clientResults);

	}
	

}
