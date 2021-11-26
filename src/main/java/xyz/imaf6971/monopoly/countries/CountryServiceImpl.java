package xyz.imaf6971.monopoly.countries;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;

    @Override
    public List<Country> getCountries() {
        return repository.findAll();
    }

    @Override
    public Country getCountryById(Long id) {
        return repository.getById(id);
    }

    @Override
    public Country saveCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public void deleteCountryById(Long id) {
        repository.deleteById(id);
    }
    
}
