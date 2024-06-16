package pwr.git.geoguessly.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pwr.git.geoguessly.persistence.Country;
import pwr.git.geoguessly.service.CountryService;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/all")
public class CountryResource {

    private static final Logger logger = LoggerFactory.getLogger(CountryResource.class);

    private final CountryService countryService;

    @Autowired
    public CountryResource(CountryService service) {
        this.countryService = service;
    }

    @GetMapping("/random")
    public Country getRandomCountry() {
        List<Country> countries = countryService.getAll();
        Random random = new Random();
        int randomIndex = random.nextInt(countries.size());
        Country randomCountry = countryService.getById((long) randomIndex);
        logger.info("Response: Returning random country details:\n ID={},\n Country={},\n Population={},\n Area={},\n PopDensity={},\n CoastlineRatio={},\n GDPPerCapita={}",
                randomCountry.getId(),
                randomCountry.getCountry(),
                randomCountry.getPopulation(),
                randomCountry.getArea(),
                randomCountry.getPopdensity(),
                randomCountry.getCoastlineratio(),
                randomCountry.getGdppercapita());
        return randomCountry;
    }

    @GetMapping("/{name}")
    public Country getByName(@PathVariable String name) {
        Country specificCountry = countryService.findByCountryName(name);
        logger.info("Response: Returning specific country details:\n ID={},\n Country={},\n Population={},\n Area={},\n PopDensity={},\n CoastlineRatio={},\n GDPPerCapita={}",
                specificCountry.getId(),
                specificCountry.getCountry(),
                specificCountry.getPopulation(),
                specificCountry.getArea(),
                specificCountry.getPopdensity(),
                specificCountry.getCoastlineratio(),
                specificCountry.getGdppercapita());
        return specificCountry;
    }

    @GetMapping(value = "/countries")
    public List<Country> getAll() {
        return countryService.getAll();
    }

    @GetMapping(value = "/country/{id}")
    public Country getById(@PathVariable Long id) {
        return this.countryService.getById(id);
    }


    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "HelloWorld";
    }
}
