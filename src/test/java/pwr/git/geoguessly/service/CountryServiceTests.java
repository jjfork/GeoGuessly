package pwr.git.geoguessly.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pwr.git.geoguessly.persistence.Country;
import pwr.git.geoguessly.persistence.CountryRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CountryServiceTests {

    @InjectMocks
    private CountryService countryService;

    @Mock
    private CountryRepository countryRepository;

    @Test
    public void testGetAll() {
        // Arrange
        when(countryRepository.findAll()).thenReturn(List.of(new Country(), new Country()));

        // Act
        List<Country> countries = countryService.getAll();

        // Assert
        assertEquals(2, countries.size());
    }

    @Test
    public void testGetById() {
        // Arrange
        Long id = 1L;
        Country country = new Country();
        country.setId(id);
        when(countryRepository.findById(id)).thenReturn(Optional.of(country));

        // Act
        Country retrievedCountry = countryService.getById(id);

        // Assert
        assertEquals(id, retrievedCountry.getId());
    }

    @Test
    public void testFindByCountryName() {
        // Arrange
        String countryName = "TestCountry";
        Country country = new Country();
        country.setCountry(countryName);
        when(countryRepository.findByCountry(countryName)).thenReturn(country);

        // Act
        Country foundCountry = countryService.findByCountryName(countryName);

        // Assert
        assertEquals(countryName, foundCountry.getCountry());
    }
}
