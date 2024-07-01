package keyinserver.controller;

import keyinserver.model.Aircraft;
import keyinserver.services.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/aircrafts")
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @PostMapping("/add")
    public void addAircraft(@RequestBody Aircraft aircraft) {
        aircraftService.addAircraft(aircraft);
    }

    @GetMapping("/all")
    public List<Aircraft> getAllAircraft() {
        return aircraftService.getAllAircraft();
    }

    @GetMapping("/{id}")
    public Aircraft findAircraftById(@PathVariable int id) {
        return aircraftService.findAircraftById(id);
    }
}
