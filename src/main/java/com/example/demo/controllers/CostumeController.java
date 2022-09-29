
package com.example.demo.controllers;

import com.example.demo.entities.Costume;
import com.example.demo.services.CostumeService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Costume")
public class CostumeController {
  
        @Autowired
        private CostumeService costumeService;
        
        @GetMapping("/all")
        public List<Costume> getCostume(){
            return costumeService.getAll();
        }
        @GetMapping("/{id}")
        public Optional<Costume> getCostume(@PathVariable("id") int costumeId){
            return costumeService.getCostume(costumeId);
        }
        @PostMapping("/save")
        public Costume save(@RequestBody Costume costume){
            return costumeService.save(costume);
        }
        @PutMapping("/update")
        public Costume update(@RequestBody Costume costume){
            return costumeService.update(costume);
        }
        @DeleteMapping("/{id}")
        public boolean delete(@PathVariable("id") int costumeId){
            return costumeService.deleteCostume(costumeId);
        }
    
}
