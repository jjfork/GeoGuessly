//package pwr.git.geoguessly.persistence;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface CountryCustomRepo extends JpaRepository<Country, Long> {
//
//    @Query(value = "SELECT * FROM Countries WHERE Country = :countryName", nativeQuery = true)
//    Country findByCountryNameNative(@Param("countryName") String countryName);
//
//}
