package keyinserver.controller;


import keyinserver.model.Airport;
import keyinserver.model.City;
import keyinserver.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/add")
    public void addCity(@RequestBody City city) {
        cityService.addCity(city);
    }

    @GetMapping("/all")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public City findCityById(@PathVariable int id) {
        return cityService.findCityById(id);
    }

    @GetMapping("/{id}/airports")
    public List<Airport> getAirportsInCity(@PathVariable int id) {
        return cityService.getAirportsInCity(id);
    }
}
