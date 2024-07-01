package keyinserver.controller;

import keyinserver.model.Aircraft;
import keyinserver.model.Passenger;
import keyinserver.services.PassengerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/add")
    public void addPassenger(@RequestBody Passenger passenger) {
        passengerService.addPassenger(passenger);
    }

    @GetMapping("/all")
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @GetMapping("/{id}")
    public Passenger findPassengerById(@PathVariable int id) {
        return passengerService.findPassengerById(id);
    }

    @GetMapping("/{id}/aircrafts")
    public List<Aircraft> getAircraftForPassenger(@PathVariable int id) {
        return passengerService.getAircraftForPassenger(id);
    }
}
