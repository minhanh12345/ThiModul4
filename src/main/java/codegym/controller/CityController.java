package codegym.controller;

import codegym.model.City;
import codegym.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/stu")
@CrossOrigin("*")
public class CityController {
    @Autowired
    CityService cityService;
    @GetMapping("/findAll")
    public ResponseEntity<ArrayList<City>> findAll(){
        return new ResponseEntity<>(cityService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/findById{id}")
    public ResponseEntity<City> findById(@PathVariable long id){
        return new ResponseEntity<>(cityService.findById(id),HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<City> save(@RequestBody City city){
        return new ResponseEntity<>(cityService.save(city),HttpStatus.OK);
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity delete(@PathVariable long id){
        cityService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
