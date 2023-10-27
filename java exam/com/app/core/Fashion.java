package com.app.core;

import java.time.LocalDate;

public class Fashion {

	private static int ID = 0;
	private int clothId;
	private Category cat;
	private int stock;
	private LocalDate stockUpdateDate;
	private Size sizeValue;
	private int price;
	private Brand brandName;
	private String color;
	private int discount;
	
	public Fashion(Category cat, int stock, LocalDate stockUpdateDate, Size sizeValue, int price,
			Brand brandName, String color) {
		super();
		++ID;
		this.clothId = ID;
		this.cat = cat;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.sizeValue = sizeValue;
		this.price = price;
		this.brandName = brandName;
		this.color = color;
		this.discount = 0;
	}

	public int getClothId() {
		return clothId;
	}

	public Category getCategory() {
		return cat;
	}

	public int getStock() {
		return stock;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public Size getSizeValue() {
		return sizeValue;
	}

	public int getPrice() {
		return price;
	}

	public Brand getBrandName() {
		return brandName;
	}

	public String getColor() {
		return color;
	}

	public int getDiscount() {
		return discount;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Fashion [clothId=" + clothId + ", Category=" + cat + ", stock=" + stock + ", stockUpdateDate="
				+ stockUpdateDate + ", sizeValue=" + sizeValue + ", price=" + price + ", brandName=" + brandName
				+ ", color=" + color + ", discount=" + discount + "]";
	}

	
	
	
	
	
	
}
