package com.medical.research.program.dataservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.medical.research.program.dataservice.model.MedicalResearchParticipants;
import com.medical.research.program.dataservice.service.MedicalResearchParticipantsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin
@RequestMapping("/participants")
@EnableJpaRepositories(basePackages = "com.medical.research.program.dataservice.repository.*")
public class MedicalResearchParticipantsController {

    MedicalResearchParticipantsService medicalResearchParticipantsService;

    MedicalResearchParticipantsController(MedicalResearchParticipantsService medicalResearchParticipantsService) {
        this.medicalResearchParticipantsService = medicalResearchParticipantsService;
    }

    @GetMapping("/")
    public List<?> getResearchPrograms() {
        return medicalResearchParticipantsService.findAll();
    }

    @GetMapping("/id")
    public Optional<MedicalResearchParticipants> getResearchProgramByResearchCode(@RequestParam String id) {
        return medicalResearchParticipantsService.findById(Long.parseLong(id));
    }
      
}
