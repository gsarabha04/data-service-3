package com.medical.research.program.dataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.research.program.dataservice.model.MedicalResearchParticipants;


@Repository
public interface MedicalResearchParticipantsRepository extends JpaRepository<MedicalResearchParticipants, Long> {

}