package com.medical.research.program.dataservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.research.program.dataservice.model.MedicalResearchProgram;
import com.medical.research.program.dataservice.repository.MedicalResearchProgramRepository;

@Service
public class MedicalResearchProgramService {

    @Autowired
    private MedicalResearchProgramRepository medicalResearchRepository;

    public List<MedicalResearchProgram> findAll() {
        return medicalResearchRepository.findAll();
    }

    public List<MedicalResearchProgram> findByResearchCode(Integer id) {
        return medicalResearchRepository.findByResearchCode(id);
    }

    @SuppressWarnings("null")
    public MedicalResearchProgram save(MedicalResearchProgram researchProgram) {
        return medicalResearchRepository.save(researchProgram);
    }

    public void deleteById(Integer id) {
        medicalResearchRepository.deleteByResearchCode(id);
    }

    public List<MedicalResearchProgram> findByDescription(String description) {
        return medicalResearchRepository.findByDescription(description);
    }
    
}
