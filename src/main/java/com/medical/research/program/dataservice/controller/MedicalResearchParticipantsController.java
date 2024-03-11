package com.medical.research.program.dataservice.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.medical.research.program.dataservice.model.MedicalResearchParticipants;
import com.medical.research.program.dataservice.repository.MedicalResearchParticipantsRepository;
import com.medical.research.program.dataservice.service.MedicalResearchParticipantsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;



@RestController
@CrossOrigin
@RequestMapping("/participants")
@EnableJpaRepositories(basePackages = "com.medical.research.program.dataservice.repository.*")
public class MedicalResearchParticipantsController {

    MedicalResearchParticipantsService medicalResearchParticipantsService;

    MedicalResearchParticipantsController(MedicalResearchParticipantsService medicalResearchParticipantsService) {
        this.medicalResearchParticipantsService = medicalResearchParticipantsService;
    }

    @GetMapping("/participants")
    public ResponseEntity<List> getResearchProgramByResearchCode(@RequestParam String researchCode) {
    	return new ResponseEntity<List>(medicalResearchParticipantsService.findByResearchCode(Integer.parseInt(researchCode)), new HttpHeaders(),HttpStatus.OK);
    }
    
    
    @DeleteMapping("/employee/{id}")
    public void deleteParticipants(@PathVariable("id") int id) {
    	medicalResearchParticipantsService.deleteById(id);
    }
    @PutMapping("/updateparticipants/{id}")
    public void update(@RequestBody MedicalResearchParticipants researchParticipants , @PathVariable("id") int id)   {  
    	medicalResearchParticipantsService.update(researchParticipants, id);
    }  
    
    @PostMapping("addParticipants/{id}")
    public void createVehicle(@RequestBody MedicalResearchParticipants researchParticipants, @PathVariable("id") int id){
    	medicalResearchParticipantsService.createVehicle(researchParticipants, id);
    }
}
