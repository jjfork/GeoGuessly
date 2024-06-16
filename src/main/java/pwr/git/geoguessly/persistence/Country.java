package pwr.git.geoguessly.persistence;

import jakarta.persistence.*;


@Entity
@Table(name = "Countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;
    private Double population;
    private Double area;
    private Double popdensity;
    private Double coastlineratio;
    private Double gdppercapita;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String countryName) {
        this.country = countryName;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPopdensity() {
        return popdensity;
    }

    public void setPopdensity(Double popDensity) {
        this.popdensity = popDensity;
    }

    public Double getCoastlineratio() {
        return coastlineratio;
    }

    public void setCoastlineratio(Double coastlineRatio) {
        this.coastlineratio = coastlineRatio;
    }

    public Double getGdppercapita() {
        return gdppercapita;
    }

    public void setGdppercapita(Double gdpPerCapita) {
        this.gdppercapita = gdpPerCapita;
    }

}
