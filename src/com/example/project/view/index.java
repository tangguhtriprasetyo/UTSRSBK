package com.example.project.view;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@Named
@RequestScoped
@ManagedBean
public class index {
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String codePos;
	private String phoneNumber;
	private String email;
	private String date;
	private String[] favoritPlaces;
	private String favoritStudent;
	private String recommendation;
	private String textArea;
	

	public index() {
		// TODO Auto-generated constructor stub
	}


	


	public String getTextArea() {
		return textArea;
	}





	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}





	public String getRecommendation() {
		return recommendation;
	}





	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}





	public String getFavoritStudent() {
		return favoritStudent;
	}





	public void setFavoritStudent(String favoritStudent) {
		this.favoritStudent = favoritStudent;
	}





	public String[] getFavoritPlaces() {
		return favoritPlaces;
	}


	public void setFavoritPlaces(String[] favoritPlaces) {
		this.favoritPlaces = favoritPlaces;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getAddress() {
		return address;
	}


	public String getCity() {
		return city;
	}


	public String getCodePos() {
		return codePos;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public String getDate() {
		return date;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setCodePos(String codePos) {
		this.codePos = codePos;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	

}
