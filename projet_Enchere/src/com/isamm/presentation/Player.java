package com.isamm.presentation;

public class Player {
	
	private String name;
	private int number;
	private String image;
	private String position;
	
	
	public Player(String name, int number, String image, String position) {
		super();
		this.name = name;
		this.number = number;
		this.image = image;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
