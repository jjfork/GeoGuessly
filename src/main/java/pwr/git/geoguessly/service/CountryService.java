package pwr.git.geoguessly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pwr.git.geoguessly.persistence.Country;
import pwr.git.geoguessly.persistence.CountryRepository;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class CountryService {

    @Autowired
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository repository) {
        this.countryRepository = repository;
    }


    public List<Country> getAll() {
        return this.countryRepository.findAll();
    }

    public Country getById(Long id) {
        return this.countryRepository.findById(id).get();
    }

    public Country findByCountryName(String name) {
        return countryRepository.findByCountryName(name);
    }

}
