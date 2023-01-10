package com.onesoft.Streams;

public class Ac {
	private String brand;
	private String color;
	private int noOfWings;
	private int price;
	private boolean isSmart;
	private float capacity;
	public Ac(String brand, String color, int noOfWings, int price, boolean isSmart, float capacity) {
		super();
		this.brand = brand;
		this.color = color;
		this.noOfWings = noOfWings;
		this.price = price;
		this.isSmart = isSmart;
		this.capacity = capacity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfWings() {
		return noOfWings;
	}
	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isSmart() {
		return isSmart;
	}
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	public float getCapacity() {
		return capacity;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Ac [brand=" + brand + ", color=" + color + ", noOfWings=" + noOfWings + ", price=" + price
				+ ", isSmart=" + isSmart + ", capacity=" + capacity + "]";
	}
	
	
	
}
