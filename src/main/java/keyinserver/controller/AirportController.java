package keyinserver.controller;

import keyinserver.model.Airport;
import keyinserver.services.AircraftService;
import keyinserver.services.AirportService;
import keyinserver.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @Autowired
    private PassengerService passengerService;

    @Autowired
    private AircraftService aircraftService;

    @PostMapping("/add")
    public void addAirport(@RequestBody Airport airport) {
        airportService.addAirport(airport);
    }

    @GetMapping("/all")
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @GetMapping("/{id}")
    public Airport findAirportById(@PathVariable int id) {
        return airportService.findAirportById(id);
    }

    @GetMapping("/used-by-passenger/{passengerId}")
    public List<Airport> getAirportsUsedByPassenger(@PathVariable int passengerId) {
        return airportService.getAirportsUsedByPassenger(passengerService, passengerId);
    }

    @GetMapping("/for-aircraft/{aircraftId}")
    public List<Airport> getAirportsForAircraft(@PathVariable int aircraftId) {
        return airportService.getAirportsForAircraft(aircraftId, aircraftService);
    }
}
