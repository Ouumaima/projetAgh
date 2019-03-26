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

import services.AdresseService;
import bean.Adresse;
import bean.Adresse;
import dao.AdresseDao;

@RunWith(MockitoJUnitRunner.class)
public class AdresseServiceTest {

	@Mock
	AdresseDao adresseDao;

	@InjectMocks
	AdresseService adresseService = new AdresseService(adresseDao);
	
	private List<Adresse> adressesExpected = new ArrayList<>();

	@Before
	public void setUp() throws Exception {
		// given
		adressesExpected.add(new Adresse(1, "12 rue moliere", "chez oumaima","montrouge", "92120"));
		adressesExpected.add(new Adresse(2, "50 places jules ferry","chez ahmed", "montrouge", "92120"));
	}

	@Test
	public void testGetAllAdresses() {

		// when
		when(adresseDao.findAll()).thenReturn(adressesExpected);
		List<Adresse> adressesResults = adresseService.getAll();

		// then
		Assertions.assertThat(adressesExpected.get(0)).isEqualTo(adressesResults.get(0));
		Assertions.assertThat(adressesExpected.get(1)).isEqualTo(adressesResults.get(1));

	}

	@Test
	public void testGetById() {
		
		when(adresseDao.findById(1)).thenReturn(adressesExpected.get(0));
		// when
		Adresse adresseResults = adresseService.getById(1);

		// then
		Assertions.assertThat(adressesExpected.get(0)).isEqualTo(adresseResults);

	}
}
