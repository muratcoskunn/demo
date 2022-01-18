package com.backend.demo.RestController;

import com.backend.demo.Business.ICityService;
import com.backend.demo.Entities.City;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class Controller {

    ICityService cityService;

    @Autowired
    public Controller(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/getAll")
    public List<City> getAll(){

        return cityService.getAll();

    }
    @GetMapping("/getByName")
    public List<City> getByName(@RequestParam String name){
        return cityService.getByName(name);
    }
    @GetMapping("/findById")
    public City findById(@RequestParam int id){
        return cityService.findById(id);
    }
}
