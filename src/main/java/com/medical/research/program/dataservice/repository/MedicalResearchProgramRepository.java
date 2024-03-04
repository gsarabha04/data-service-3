package com.medical.research.program.dataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.research.program.dataservice.model.MedicalResearchProgram;

import java.util.List;


@Repository
public interface MedicalResearchProgramRepository extends JpaRepository<MedicalResearchProgram, Integer> {

	List<MedicalResearchProgram> findByResearchCode(Integer researchCode);

    void deleteByResearchCode(Integer researchCode);

    List<MedicalResearchProgram> findByDescription(String description);

}