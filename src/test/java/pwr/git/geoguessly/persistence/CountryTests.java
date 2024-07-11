package pwr.git.geoguessly.persistence;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

@ExtendWith(MockitoExtension.class)
public class CountryTests {

    @Test
    public void testGetId() {
        Country country = new Country();
        country.setId(1L);
        assertEquals(1L, country.getId());
    }

    @Test
    public void testGetCountry() {
        Country country = new Country();
        country.setCountry("Unknown");
        assertEquals("Unknown", country.getCountry());
    }

    @Test
    public void testGetPopulation() {
        Country country = new Country();
        country.setPopulation(1000000.0);
        assertEquals(1000000.0, country.getPopulation());
    }

    @Test
    public void testGetArea() {
        Country country = new Country();
        country.setArea(500000.0);
        assertEquals(500000.0, country.getArea());
    }

    @Test
    public void testGetPopdensity() {
        Country country = new Country();
        country.setPopdensity(200.0);
        assertEquals(200.0, country.getPopdensity());
    }

    @Test
    public void testGetCoastlineratio() {
        Country country = new Country();
        country.setCoastlineratio(0.5);
        assertEquals(0.5, country.getCoastlineratio());
    }

    @Test
    public void testGetGdppercapita() {
        assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
            Country country = new Country();
            country.setGdppercapita(50000.0);
            assertEquals(50000.0, country.getGdppercapita());
        });
    }
}
