package codegym.service;

import codegym.model.City;
import codegym.repository.ICityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CityService {
    @Autowired
    ICityRepo iCityRepo;
    public  ArrayList<City> findAll(){
        return (ArrayList<City>) iCityRepo.findAll();
    }
    public City save(City city){
        return iCityRepo.save(city);
    }
    public City findById(long id){
        return iCityRepo.findById(id).get();
    }
    public void delete(long id){
        iCityRepo.delete(iCityRepo.findById(id).get());
    }

}
