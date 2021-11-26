package xyz.imaf6971.monopoly.countries;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/country")
@AllArgsConstructor
public class CountryController {
    private final CountryService service;

    @GetMapping
    public List<Country> getMethodName() {
        return service.getCountries();
    }

    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable Long id) {
        return service.getCountryById(id);
    }
    
    @PostMapping
    public Country saveCountry(@RequestParam Country country) {
        return service.saveCountry(country);
    }

    @DeleteMapping("/{id}")
    public void deleteCountryById(@PathVariable Long id) {
        service.deleteCountryById(id);
    }
}
