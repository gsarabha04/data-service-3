package com.medical.research.program.dataservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.research.program.dataservice.model.MedicalResearchParticipants;
import com.medical.research.program.dataservice.repository.MedicalResearchParticipantsRepository;

@Service
public class MedicalResearchParticipantsService {

    @Autowired
    private MedicalResearchParticipantsRepository medicalResearchParticipantsRepository;

    public List<MedicalResearchParticipants> findAll() {
        return medicalResearchParticipantsRepository.findAll();
    }

    @SuppressWarnings("null")
    public Optional<MedicalResearchParticipants> findById(Long id) {
        return medicalResearchParticipantsRepository.findById(id);
    }

    @SuppressWarnings("null")
    public MedicalResearchParticipants save(MedicalResearchParticipants researchParticipants) {
        return medicalResearchParticipantsRepository.save(researchParticipants);
    }

    public void deleteById(Long id) {
        medicalResearchParticipantsRepository.deleteById(id);
    }
    
}
