package com.medical.research.program.dataservice.model;

import java.sql.Date;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "medical_participants")
public class MedicalResearchParticipants {

	@Override
	public String toString() {
		return "MedicalResearchParticipants [id=" + id + ", researchCode=" + researchCode + ", description="
				+ description + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", email="
				+ email + ", Phone=" + Phone + ", address=" + address + ", AddressLine2=" + addressLine2 + ", City="
				+ City + ", State=" + State + ", zipCode=" + zipCode + ", ProfilePic=" + ProfilePic + "]";
	}

	@Id
	private long id;

	private int researchCode;

	private String description;

	private String firstName;

	private String lastName;

	private Date dob;

	private String email;

	private String Phone;

	private String address;

	private String addressLine2;

	private String City;

	private String State;

	private String zipCode;

	private String ProfilePic;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getProfilePic() {
		return ProfilePic;
	}

	public void setProfilePic(String profilePic) {
		ProfilePic = profilePic;
	}

}
