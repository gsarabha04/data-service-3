package com.medical.research.program.dataservice.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.repository.CrudRepository;

import com.medical.research.program.dataservice.service.MedicalResearchProgramService;




@RestController
@CrossOrigin
@RequestMapping("/programs")
public class MedicalResearchProgramController {

    MedicalResearchProgramService medicalResearchProgramService;

    MedicalResearchProgramController(MedicalResearchProgramService medicalResearchProgramService) {
        this.medicalResearchProgramService = medicalResearchProgramService;
    }

    @GetMapping("/")
    public ResponseEntity<List> getResearchPrograms() {
        return new ResponseEntity<List>(medicalResearchProgramService.findAll(),new HttpHeaders(),HttpStatus.OK);
    }

    @GetMapping("/researchCode")
    public ResponseEntity<List> getResearchProgramByResearchCode(@RequestParam String researchCode) {
    	return new ResponseEntity<List>(medicalResearchProgramService.findByResearchCode(Integer.parseInt(researchCode)),new HttpHeaders(),HttpStatus.OK);
    	
    }

      
}
