package com.medical.research.program.dataservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medical.research.program.dataservice.model.MedicalResearchParticipants;
import com.medical.research.program.dataservice.model.MedicalResearchProgram;


@Repository
public interface MedicalResearchParticipantsRepository extends JpaRepository<MedicalResearchParticipants, Long> {

	List<MedicalResearchParticipants> findByResearchCode(int researchCode);

	List<MedicalResearchParticipants> findByResearchCode(Integer researchCode);
	 @Transactional
    public void deleteById(Integer researchCode);

    List<MedicalResearchParticipants> findByDescription(String description);
}