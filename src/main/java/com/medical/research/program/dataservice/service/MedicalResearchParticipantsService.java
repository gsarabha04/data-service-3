package com.medical.research.program.dataservice.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.research.program.dataservice.model.MedicalResearchParticipants;
import com.medical.research.program.dataservice.model.MedicalResearchProgram;
import com.medical.research.program.dataservice.repository.MedicalResearchParticipantsRepository;
import com.medical.research.program.dataservice.repository.MedicalResearchProgramRepository;

@Service
public class MedicalResearchParticipantsService {
	

    protected static final Logger logger = LogManager.getLogger();

	@Autowired
	private MedicalResearchParticipantsRepository medicalResearchParticipantsRepository;
	
	@Autowired
	private MedicalResearchProgramRepository medicalResearchProgramRepository;

//
	public List<MedicalResearchParticipants> findAll() {
		return medicalResearchParticipantsRepository.findAll();
	}

//    @SuppressWarnings("null")
	public List<MedicalResearchParticipants> findByResearchCode(Integer researchCode) {
		return medicalResearchParticipantsRepository.findByResearchCode(researchCode);
	}

	@SuppressWarnings("null")
	public MedicalResearchParticipants save(MedicalResearchParticipants researchParticipants) {
		return medicalResearchParticipantsRepository.save(researchParticipants);
	}

	public void deleteById(int id) {
		medicalResearchParticipantsRepository.deleteById(id);
	}

	public void update(MedicalResearchParticipants researchParticipants, long id) {
		logger.trace("entering update participants method");
		MedicalResearchParticipants updateParticipants = medicalResearchParticipantsRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
		updateParticipants.setAddress(researchParticipants.getAddress());
		updateParticipants.setFirstName(researchParticipants.getFirstName());
		updateParticipants.setLastName(researchParticipants.getLastName());
		updateParticipants.setDob(researchParticipants.getDob());
		updateParticipants.setPhone(researchParticipants.getPhone());
		updateParticipants.setCity(researchParticipants.getCity());
		updateParticipants.setState(researchParticipants.getState());
		updateParticipants.setZipCode(researchParticipants.getZipCode());
		updateParticipants.setProfilePic(researchParticipants.getProfilePic());

		medicalResearchParticipantsRepository.save(updateParticipants);
	}

	public void createVehicle(MedicalResearchParticipants researchParticipants , Integer id) {
        
        List<MedicalResearchProgram> findProgram =  medicalResearchProgramRepository.findByResearchCode(id);
		MedicalResearchParticipants addParticipants = new MedicalResearchParticipants();
		
		addParticipants.setAddress(researchParticipants.getAddress());
		addParticipants.setFirstName(researchParticipants.getFirstName());
		addParticipants.setLastName(researchParticipants.getLastName());
		addParticipants.setDob(researchParticipants.getDob());
		addParticipants.setPhone(researchParticipants.getPhone());
		addParticipants.setCity(researchParticipants.getCity());
		addParticipants.setState(researchParticipants.getState());
		addParticipants.setZipCode(researchParticipants.getZipCode());
		addParticipants.setProfilePic(researchParticipants.getProfilePic());
		addParticipants.setResearchCode(findProgram.get(0).getResearchCode());

		medicalResearchParticipantsRepository.save(addParticipants);
	}

}
