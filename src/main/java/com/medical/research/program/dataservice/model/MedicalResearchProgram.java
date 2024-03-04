package com.medical.research.program.dataservice.model;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "medical_research_program")
public class MedicalResearchProgram {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int researchCode;
    
    private String description;

    public int getResearchCode() {
        return researchCode;
    }

    public void setResearchCode(int researchCode) {
        this.researchCode = researchCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
