package pwr.git.geoguessly.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository  extends JpaRepository<Country, Long> {

    @Query("SELECT c FROM Country c WHERE c.country = :countryName")
    Country findByCountryName(@Param("Country") String countryName);
}
