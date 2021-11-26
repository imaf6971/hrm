package xyz.imaf6971.monopoly.countries;

import java.util.List;

public interface CountryService {
    List<Country> getCountries();
    Country getCountryById(Long id);
    Country saveCountry(Country country);
    void deleteCountryById(Long id);
}
